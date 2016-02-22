/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author rwb5529
 */
public class MyJFrame extends JFrame{
    public MyJFrame(){
        super ("Team 05 Game Project");
        MyJPanel mjp = new MyJPanel();
        getContentPane().setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1500, 1200);
        setVisible(true); 
    }
    
}
