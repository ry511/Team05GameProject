
package teamgameproject;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author rwb5529
 */
public class GameBoardSpace extends JButton implements ActionListener {

    private int xCord;
    private int yCord;
    private boolean isOccupied;
    private Unit unit;

    private GameBoardPanel gbp;

    public GameBoardSpace(int x, int y, GameBoardPanel gbp) {
        this.xCord = x;
        this.yCord = y;
        this.isOccupied = false;
        this.addActionListener(this);
        this.unit = unit;
        this.gbp = gbp;
        


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
    public void displayUnitAttack(ImageIcon icon, int mobility, int xCord, int yCord){
        
            if (!gbp.getGameBoardSpace(xCord, yCord).isOccupied){
                gbp.getGameBoardSpace(xCord, yCord).setIcon(icon);
            }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        if (isOccupied && !gbp.getIsUnitSelected()) {
            gbp.setCurrentUnit(getUnit());
            gbp.setCurrentSpace(gbp.getGameBoardSpace(getXCord(), getYCord()));
            isOccupied = false;
            gbp.setIsUnitSelected(true);
            ImageIcon movableSpaceIcon = new ImageIcon("src/images/grass_yellow.png");
            for(int i = 1; i <= getUnit().getMobility(); i++){
                if(getXCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() + i, getYCord());
                }
                if(getYCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord(), getYCord() + i);
                }
                if(getXCord() - i >= 0){   
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() - i, getYCord());
                }
                if(getYCord() - i >= 0){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord(), getYCord() - i);
                }
                if(getXCord() + i <= 9 && getYCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() + i, getYCord() + i);
                }
                if(getYCord() + i <= 9 && getXCord() - i >= 0){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() - i, getYCord() + i);
                }
                if(getXCord() - i >= 0 && getYCord() - i >= 0){   
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() - i, getYCord() - i);
                }
                if(getYCord() - i >= 0 && getXCord() + i <= 9){
                    displayUnitMovement(movableSpaceIcon, gbp.getCurrentUnit().getMobility(), getXCord() + i, getYCord() - i);
                }
            }
            
        } else if (gbp.getIsUnitSelected() && !getIsOccupied() && gbp.getCurrentUnit().checkUnitMovement(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())) {
            ImageIcon movableSpaceIcon = new ImageIcon("src/images/grass.png");
            for(int i = 1; i <= gbp.getCurrentUnit().getMobility(); i++){
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
            setUnit(gbp.getCurrentUnit());
            gbp.getGameBoardSpace(getXCord(), getYCord()).setIsOccupied(true);
            setToolTipText(gbp.getCurrentUnit().getStats());
            gbp.getCurrentSpace().setToolTipText(null);
            
            gbp.getCurrentSpace().displayUnitImg();
            ImageIcon spaceIcon = new ImageIcon("src/images/grass.png");
            gbp.getCurrentSpace().setIcon(spaceIcon);
            displayUnitImg();
            
            gbp.setCurrentSpace(null);
            gbp.setCurrentUnit(null);
            gbp.setIsUnitSelected(false);
        } else if(gbp.getIsUnitSelected() && !getIsOccupied() && !gbp.getCurrentUnit().checkUnitMovement(gbp.getCurrentSpace().getXCord(), gbp.getCurrentSpace().getYCord(), getXCord(), getYCord())){
            ImageIcon movableSpaceIcon = new ImageIcon("src/images/grass.png");
            for(int i = 1; i <= gbp.getCurrentUnit().getMobility(); i++){
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
            
            gbp.getCurrentSpace().setIsOccupied(true);
            
            gbp.setCurrentUnit(null);
            gbp.setCurrentSpace(null);
            gbp.setIsUnitSelected(false);
        } else if(gbp.getIsUnitSelected() && isOccupied){
            getUnit().setHealth(getUnit().getHealth() - gbp.getCurrentUnit().getAttack());
            System.out.println(getUnit().getHealth());
            if(getUnit().getHealth() <= 0){
                setUnit(null);
                ImageIcon spaceIcon = new ImageIcon("src/images/grass.png");
                setIcon(spaceIcon);
                setIsOccupied(false);
            }
            
        }

    }
}
