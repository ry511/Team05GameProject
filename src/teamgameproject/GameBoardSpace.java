/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rwb5529
 */
public class GameBoardSpace extends JButton implements ActionListener{
    private int xCord;
    private int yCord;
    private boolean isOccupied;
    
    public GameBoardSpace(int x, int y){
        this.xCord = x;
        this.yCord = y;
        this.isOccupied = false;
    }
    
    public void addSpaceToArray(){
        
    }
    
    public int getXCord(){
        return this.xCord;
    }
    
    public int getYCord(){
        return this.yCord;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
