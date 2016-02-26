/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author srh10
 */
public class NavigationUI extends JFrame{
    
    private NavigationCntl navigationCntl = null;
 //  private MyJFrame mjf = new MyJFrame();
    private JButton cancelButton;
    private JButton startButton;
    private JPanel buttonPanel;

    public NavigationUI(NavigationCntl parentNavigationCntl) {
        parentNavigationCntl = navigationCntl;
        initCustomerComponents();
    }
    
    public void initCustomerComponents(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Initialize all of the components
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        
        
        startButton = new JButton("Start");
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                 startButtonActionPerformed(evt);
            }
        });
        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(startButton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }
    
        private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         MyJFrame mjf = new MyJFrame();
        this.setVisible(false);
        mjf.setVisible(true);
        //navigationCntl.showGameboardFrame();
    }   
    
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        
    }   
}

