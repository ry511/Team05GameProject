/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author rwb5529
 */
public class GameBoardPanel extends JPanel{
    
    private int xAxis = 10;
    private int yAxis = 10;
    
    private  JPanel gui = new JPanel(new BorderLayout(3, 3));
    private JButton[][] boardSpaces = new JButton[xAxis][yAxis];
    private JPanel gameBoard; 
    
    public GameBoardPanel(){
        super();
        
        setLayout(new GridLayout(0, xAxis));
        setBorder(new LineBorder(Color.DARK_GRAY));
        Insets buttonSeperation = new Insets(0,0,0,0);
        for (int i = 0; i < boardSpaces.length; i++){
            for (int j = 0; j < boardSpaces[i].length; j++){
                JButton space = new JButton();
                space.setMargin(buttonSeperation);
                ImageIcon spaceIcon = new ImageIcon(new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB));
                space.setIcon(spaceIcon);
                if ((j % 2 == 1 && i % 2 == 1)
                        //) {
                        || (j % 2 == 0 && i % 2 == 0)) {
                    space.setBackground(Color.WHITE);
                } else {
                    space.setBackground(Color.BLACK);
                }
                //space.setBackground(Color.WHITE);
                boardSpaces[j][i] = space;
            }
        }
        
    }
    
    public final void initializeBoard(){
        
        Insets buttonSeperation = new Insets(0,0,0,0);
        for (int i = 0; i < boardSpaces.length; i++){
            for (int j = 0; j < boardSpaces[i].length; j++){
                JButton space = new JButton();
                space.setMargin(buttonSeperation);
                ImageIcon spaceIcon = new ImageIcon(new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB));
                space.setIcon(spaceIcon);
                space.setBackground(Color.WHITE);
                boardSpaces[j][i] = space;
            }
        }
    }
}
