/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author rwb5529
 */
public class GameBoardPanel extends JPanel implements MouseListener, ActionListener{
    
    private int xAxis = 10;
    private int yAxis = 10;
    private boolean isUnitSelected = false;
    private GameBoardSpace currentSpace = null;
    private GameBoardSpace newSpace = null;
    private Unit currentUnit = null;
    
    private ArrayList<Unit> units = new ArrayList<Unit>();
    
    private GameBoardSpace[][] boardSpaces = new GameBoardSpace[xAxis][yAxis];
    
    
    
    public GameBoardPanel(){
        super();
        
        this.isUnitSelected = isUnitSelected;
        
        
        GridLayout grid = new GridLayout(0, 10);
        setBorder(new LineBorder(Color.BLACK));
        setLayout(grid);
        
        Insets buttonSeperation = new Insets(0,0,0,0);
        for (int i = 0; i < boardSpaces.length; i++){
            for (int j = 0; j < boardSpaces[i].length; j++){
                GameBoardSpace space = new GameBoardSpace(j, i, this);
                space.setMargin(buttonSeperation);
                ImageIcon spaceIcon = new ImageIcon(new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB));
                space.setIcon(spaceIcon);
                
                
                space.setBackground(Color.WHITE);
                boardSpaces[j][i] = space;
                this.add(boardSpaces[j][i]);
                boardSpaces[j][i].addActionListener(this);
                
                
            }
            }
        
        createPeon(0,0);

        
        
    }
    
    public GameBoardSpace getGameBoardSpace(int x, int y){
        return boardSpaces[x][y];
    }
    
    public GameBoardSpace getCurrentSpace(){
        return currentSpace;
    }
    
    public void setCurrentSpace(GameBoardSpace currentSpace){
        this.currentSpace = currentSpace;
    }
    
    public GameBoardSpace getNewSpace(){
        return newSpace;
    }
    
    public void setNewSpace(GameBoardSpace newSpace){
        this.newSpace = newSpace;
    }
    
    public Unit getCurrentUnit(){
        return currentUnit;
    }
    
    public void setCurrentUnit(Unit currentUnit){
        this.currentUnit = currentUnit;
    }
    
    public boolean getIsUnitSelected(){
        return isUnitSelected;
    }
    
    public void setIsUnitSelected(boolean isUnitSelected){
        this.isUnitSelected = isUnitSelected;
    }
    
    public void setGameBoardSpace(int x, int y, GameBoardSpace space){
        this.boardSpaces[x][y] = space;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i =0; i < boardSpaces.length; i++){
            for (int j = 0; j < boardSpaces[i].length;j++){
                
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        for (int i =0; i < boardSpaces.length; i++){
            for (int j = 0; j < boardSpaces[i].length;j++){
                
            }
        }
    }
    
    public void createPeon(int x, int y){
        Peon p = new Peon();
        boardSpaces[x][y].setUnit(p);
        boardSpaces[x][y].setIsOccupied(true);
        boardSpaces[x][y].displayUnitImg();
    }
        
    }

