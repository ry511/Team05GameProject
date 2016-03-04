
package teamgameproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author rwb5529
 */
public class GameBoardSpace extends JButton implements ActionListener {

    private int xCord;
    private int yCord;
    private boolean isOccupied;
    private Unit unit;
    
    private MyJPanel mjp;
    private GameBoardPanel gbp;

    public GameBoardSpace(int x, int y, GameBoardPanel gbp, MyJPanel mjp) {
        this.xCord = x;
        this.yCord = y;
        this.isOccupied = false;
        this.addActionListener(this);
        this.unit = unit;
        this.gbp = gbp;
        this.mjp = mjp;
        


    }
   
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public boolean getIsOccupied() {
      InputStream in;
        try{
            in = new FileInputStream(new File("/Users/jeongeunsun/NetBeansProjects/NewFolder/Lab2B_Team5/Team05GameProject/src/Soundeffect/footstep.wav"));
            AudioStream audios=new AudioStream(in);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        return this.isOccupied;   
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public int getXCord() {
        return this.xCord;
    }

    public int getYCord() {
        return this.yCord;
    }

    public void displayUnitImg() {
        this.setIcon(unit.getImg());
    }
    
    public void displayUnitMovement(ImageIcon icon, int mobility, int xCord, int yCord){
   
            if (!gbp.getGameBoardSpace(xCord, yCord).isOccupied){
                gbp.getGameBoardSpace(xCord, yCord).setIcon(icon);
            }
        
    }
    public void displayUnitAttack(ImageIcon icon, int mobility, int xCord, int yCord){
        
            if (!gbp.getGameBoardSpace(xCord, yCord).isOccupied){
                gbp.getGameBoardSpace(xCord, yCord).setIcon(icon);
            }
        
    }
    
    public void showMovementIndicators(String image){
        ImageIcon movableSpaceIcon = new ImageIcon(image);
        for(int i = 1; i <= gbp.getCurrentUnit().getMobility(); i++){
            for(int j = 1; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getXCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() + i, gbp.getCurrentSpace().getYCord());
                }
                if(gbp.getCurrentSpace().getYCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord() + i);
                }
                if(gbp.getCurrentSpace().getXCord() - i >= 0){   
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() - i, gbp.getCurrentSpace().getYCord());
                }
                if(gbp.getCurrentSpace().getYCord() - i >= 0){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord() - i);
                }
                if(gbp.getCurrentSpace().getXCord() + i <= 9 && gbp.getCurrentSpace().getYCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() + i, gbp.getCurrentSpace().getYCord() + i);
                }
                if(gbp.getCurrentSpace().getYCord() + i <= 9 && gbp.getCurrentSpace().getXCord() - i >= 0){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() - i, gbp.getCurrentSpace().getYCord() + i);
                }
                if(gbp.getCurrentSpace().getXCord() - i >= 0 && gbp.getCurrentSpace().getYCord() - i >= 0){   
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() - i, gbp.getCurrentSpace().getYCord() - i);
                }
                if(gbp.getCurrentSpace().getYCord() - i >= 0 && gbp.getCurrentSpace().getXCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() + i, gbp.getCurrentSpace().getYCord() - i);
                }
            }
        }
    }
    
    public void win(){
        
    }
    
    public void darkWin(){
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        if (isOccupied && !gbp.getIsUnitSelected()) {
            gbp.setCurrentUnit(getUnit());
            gbp.setCurrentSpace(gbp.getGameBoardSpace(getXCord(), getYCord()));
            
            gbp.setIsUnitSelected(true);
            
            showMovementIndicators("src/images/grass_yellow.png");
            
            
        } else if (gbp.getIsUnitSelected() && !getIsOccupied() && gbp.getCurrentUnit().checkUnitMovement(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())) {
            showMovementIndicators("src/images/grass.png");
            setUnit(gbp.getCurrentUnit());
            gbp.getGameBoardSpace(getXCord(), getYCord()).setIsOccupied(true);
            setToolTipText(gbp.getCurrentUnit().getStats());
            gbp.getCurrentSpace().setToolTipText(null);
            gbp.getCurrentSpace().setIsOccupied(false);
            gbp.getCurrentSpace().displayUnitImg();
            ImageIcon spaceIcon = new ImageIcon("src/images/grass.png");
            gbp.getCurrentSpace().setIcon(spaceIcon);
            displayUnitImg();
            
            gbp.setCurrentSpace(null);
            gbp.setCurrentUnit(null);
            gbp.setIsUnitSelected(false);
        } else if(gbp.getIsUnitSelected() && !getIsOccupied() && !gbp.getCurrentUnit().checkUnitMovement(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())){
            showMovementIndicators("src/images/grass.png");
            
            gbp.getCurrentSpace().setIsOccupied(true);
            
            gbp.setCurrentUnit(null);
            gbp.setCurrentSpace(null);
            gbp.setIsUnitSelected(false);
        } else if(gbp.getIsUnitSelected() && isOccupied){
            showMovementIndicators("src/images/grass.png");
            InputStream in;
            try{
            in = new FileInputStream(new File("/Users/jeongeunsun/NetBeansProjects/NewFolder/Lab2B_Team5/Team05GameProject/src/Soundeffect/Sword.wav"));
            AudioStream audios=new AudioStream(in);
            AudioPlayer.player.start(audios);
              }
               catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
             }
           
            
            getUnit().setHealth(getUnit().getHealth() - gbp.getCurrentUnit().getAttack());
            System.out.println(getUnit().getHealth());
            if(getUnit().getHealth() <= 0){
                if(getUnit().getIsDark()){
                    gbp.setNumDarkNumUnits(gbp.getNumDarkUnits() - 1);
                    System.out.println(gbp.getNumDarkUnits());
                }else{
                    gbp.setNumUnits(gbp.getNumUnits() - 1);
                    System.out.println(gbp.getNumDarkUnits());
                }
                setUnit(null);
                ImageIcon spaceIcon = new ImageIcon("src/images/grass.png");
                setIcon(spaceIcon);
                setIsOccupied(false);
                
            }
            
            gbp.setCurrentSpace(null);
            gbp.setCurrentUnit(null);
            gbp.setIsUnitSelected(false);
            System.out.println(gbp.getIsUnitSelected());
            
        }
        
        if(gbp.getNumUnits() <= 0){
            JFrame lightWins = new JFrame("Light Team Won");
            JPanel panel = new JPanel();
            JLabel message = new JLabel("Light Team Won!");

            panel.add(message);
            
            lightWins.getContentPane().add(panel, "Center");
            lightWins.setBackground(Color.DARK_GRAY);
            lightWins.setSize(400, 100);
            lightWins.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            lightWins.setVisible(true);
            
            
            gbp.restartGame();
        }
        
        if(gbp.getNumDarkUnits() <= 0){
            JFrame darkWins = new JFrame("Dark Team Won");
            JPanel panel = new JPanel();
            JLabel message = new JLabel("Dark Team Won!");

            
            
            panel.add(message);
            
            darkWins.getContentPane().add(panel, "Center");
            darkWins.setBackground(Color.DARK_GRAY);
            darkWins.setSize(400, 100);
            darkWins.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            darkWins.setVisible(true);
            gbp.restartGame();
                    
        }

    }
}
