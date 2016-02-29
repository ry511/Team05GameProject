
package teamgameproject;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author srh10
 */
public class NavigationUI extends JFrame{
    
    private NavigationCntl navigationCntl = null;
  
    
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
        

        
        
        startButton = new JButton("Start");
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                 startButtonActionPerformed(evt);
            }
        });
        buttonPanel = new JPanel();
        
        buttonPanel.add(startButton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        
         
          startButton.setFont(startButton.getFont().deriveFont(18.0f));
        
        startButton.setPreferredSize(new Dimension(100, 100));
    }
    
        private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        MyJFrame mjf = new MyJFrame();
        this.setVisible(false);
        mjf.setVisible(true);
        mjf.setLocationRelativeTo(null);
        
        //navigationCntl.showGameboardFrame();
    }     
}

