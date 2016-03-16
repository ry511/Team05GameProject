
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
    
    public void displayUnitAttack(boolean isRed, int xCord, int yCord){
        ImageIcon attackableSpace = new ImageIcon();
        
        if (gbp.getGameBoardSpace(xCord, yCord).isOccupied){
            attackableSpace = new ImageIcon(getUnitImg(isRed, xCord, yCord));
            
            gbp.getGameBoardSpace(xCord, yCord).setIcon(attackableSpace); 
        }
        
    }
    
    public String getUnitImg(boolean isRed, int xCord, int yCord){
        String unitImage = null;
        String redUnitImage = null;
        if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 1){
            unitImage = "src/images/peon1.png";
            redUnitImage = "src/images/peon1_red.png";
        } else if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 2){
            unitImage = "src/images/peon2.png";
            redUnitImage = "src/images/peon2_red.png";
        } else if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 3){
            unitImage = "src/images/knight1.png";
            redUnitImage = "src/images/knight1_red.png";
        } else if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 4){
            unitImage = "src/images/knight2.png";
            redUnitImage = "src/images/knight2_red.png";
        } else if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 5){
            unitImage = "src/images/wizard1.png"; 
            redUnitImage = "src/images/wizard1_red.png";
        } else if(gbp.getGameBoardSpace(xCord, yCord).getUnit().getID() == 6){
            unitImage = "src/images/wizard2.png"; 
            redUnitImage = "src/images/wizard2_red.png";
        }
        if(isRed){
            return unitImage;
        }else{
             
            return redUnitImage; 
        }
        
    }
        
    
    
    public void showMovementIndicators(String image){
        ImageIcon movableSpaceIcon = new ImageIcon(image);
        for(int i = 1; i <= gbp.getCurrentUnit().getMobility(); i++){
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getXCord() + i <= 9 && gbp.getCurrentSpace().getYCord() + j <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() + i, gbp.getCurrentSpace().getYCord() + j);
                }
            }
            
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getYCord() + i <= 9 && gbp.getCurrentSpace().getXCord() - j >= 0){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() - j, gbp.getCurrentSpace().getYCord() + i);
                }
            }
            
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getXCord() - i >= 0 && gbp.getCurrentSpace().getYCord() - j >= 0){   
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() - i, gbp.getCurrentSpace().getYCord() - j);
                }
            }
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getYCord() - i >= 0 && gbp.getCurrentSpace().getXCord() + j <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), gbp.getCurrentSpace().getXCord() + j, gbp.getCurrentSpace().getYCord() - i);
                }
            }
        }
    }
    
    public void showRangeIndicators(boolean isRed){
        ImageIcon attackableSpaceIcon;
        for(int i = 1; i <= gbp.getCurrentUnit().getRange(); i++){
            for(int j = 0; j <= gbp.getCurrentUnit().getRange(); j++){
                if(gbp.getCurrentSpace().getXCord() + i <= 9 && gbp.getCurrentSpace().getYCord() + j <= 9){
                    
                    displayUnitAttack(isRed, gbp.getCurrentSpace().getXCord() + i, gbp.getCurrentSpace().getYCord() + j);
                }
            }
            
            for(int j = 0; j <= gbp.getCurrentUnit().getRange(); j++){
                if(gbp.getCurrentSpace().getYCord() + i <= 9 && gbp.getCurrentSpace().getXCord() - j >= 0){
                    
                    displayUnitAttack(isRed, gbp.getCurrentSpace().getXCord() - j, gbp.getCurrentSpace().getYCord() + i);
                }
            }
            
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getXCord() - i >= 0 && gbp.getCurrentSpace().getYCord() - j >= 0){   
                    
                    displayUnitAttack(isRed, gbp.getCurrentSpace().getXCord() - i, gbp.getCurrentSpace().getYCord() - j);
                }
            }
            for(int j = 0; j <= gbp.getCurrentUnit().getMobility(); j++){
                if(gbp.getCurrentSpace().getYCord() - i >= 0 && gbp.getCurrentSpace().getXCord() + j <= 9){
                    
                    displayUnitAttack(isRed, gbp.getCurrentSpace().getXCord() + j, gbp.getCurrentSpace().getYCord() - i);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        if (isOccupied && !gbp.getIsUnitSelected()) {
            gbp.setCurrentUnit(getUnit());
            gbp.setCurrentSpace(gbp.getGameBoardSpace(getXCord(), getYCord()));
            
            gbp.setIsUnitSelected(true);
            
            showMovementIndicators("src/images/grass_yellow.png");
            showRangeIndicators(false);
            
            
        } else if (gbp.getIsUnitSelected() && !getIsOccupied() && gbp.getCurrentUnit().checkUnitMovement(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())) {
            showMovementIndicators("src/images/grass.png");
            showRangeIndicators(true);
            InputStream in;
            try{
                in = new FileInputStream(new File("src/Soundeffect/footstep.wav"));
                AudioStream audios=new AudioStream(in);
                AudioPlayer.player.start(audios);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
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
            showRangeIndicators(true);
            
            gbp.getCurrentSpace().setIsOccupied(true);
            
            gbp.setCurrentUnit(null);
            gbp.setCurrentSpace(null);
            gbp.setIsUnitSelected(false);
        } else if(gbp.getIsUnitSelected() && isOccupied && gbp.getCurrentUnit().checkUnitRange(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())){
            showMovementIndicators("src/images/grass.png");
            showRangeIndicators(true);
            InputStream in;
            try{
            in = new FileInputStream(new File("src/Soundeffect/Sword.wav"));
            AudioStream audios=new AudioStream(in);
            AudioPlayer.player.start(audios);
              }
               catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
             }
            int victimHealth = getUnit().getHealth();
            int damageToVictim = gbp.getCurrentUnit().getAttack();
            getUnit().setHealth((victimHealth - damageToVictim));
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
            
        } else if(gbp.getIsUnitSelected() && getIsOccupied() && !gbp.getCurrentUnit().checkUnitRange(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())){
            showMovementIndicators("src/images/grass.png");
            showRangeIndicators(true);
            
            gbp.getCurrentSpace().setIsOccupied(true);
            
            gbp.setCurrentUnit(null);
            gbp.setCurrentSpace(null);
            gbp.setIsUnitSelected(false);
        }
        
          if (gbp.getNumUnits() <= 0) {
            InputStream in;
            try {
                in = new FileInputStream(new File("src/Soundeffect/Woohoo.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
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
        
         if (gbp.getNumDarkUnits() <= 0) {
            InputStream in;
            try {
                in = new FileInputStream(new File("src/Soundeffect/Woohoo.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
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
