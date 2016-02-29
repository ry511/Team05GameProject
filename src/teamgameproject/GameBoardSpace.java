/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author rwb5529
 */
public class GameBoardSpace extends JButton implements ActionListener{
    private int xCord;
    private int yCord;
    private boolean isOccupied;
    private Unit unit;
    
    
    
    private GameBoardPanel gbp;
    
    public GameBoardSpace(int x, int y, GameBoardPanel gbp){
        this.xCord = x;
        this.yCord = y;
        this.isOccupied = false;
        this.addActionListener(this);
        this.unit = unit;
        
        this.gbp = gbp;
    }
    
    public void setUnit(Unit unit){
        this.unit = unit;
    }
    
    public Unit getUnit(){
        return this.unit;
    }
    
    public boolean getIsOccupied(){
        return this.isOccupied;
    }
    
    public void setIsOccupied(boolean isOccupied){
        this.isOccupied = isOccupied;
    }
    
    public int getXCord(){
        return this.xCord;
    }
    
    public int getYCord(){
        return this.yCord;
    }
    
    public void displayUnitImg(){
        this.setIcon(unit.getImg());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("x: " + getXCord());
        System.out.println("y: " + getYCord());
        System.out.println(gbp.getIsUnitSelected());
        
        
        if(gbp.getIsUnitSelected() && !getIsOccupied()){  
            System.out.println("test: " + gbp.getCurrentUnit().getDetails());
            
            
            setUnit(gbp.getCurrentUnit());
            gbp.getGameBoardSpace(getXCord(), getYCord()).setIsOccupied(true);
            
            
            gbp.getCurrentSpace().displayUnitImg();
            ImageIcon spaceIcon = new ImageIcon(new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB));
            gbp.getCurrentSpace().setIcon(spaceIcon);
            
            displayUnitImg();
            gbp.setIsUnitSelected(false);
        }
        if(isOccupied && !gbp.getIsUnitSelected()){
            System.out.println(unit.getDetails());
            gbp.setCurrentUnit(getUnit());
            gbp.setCurrentSpace(gbp.getGameBoardSpace(getXCord(), getYCord()));
            
            System.out.println("test: " + gbp.getCurrentUnit().getDetails());
            
            
            gbp.setIsUnitSelected(true); 
            System.out.println(gbp.getIsUnitSelected());
        }
                
    }
}
