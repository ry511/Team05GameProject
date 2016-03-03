
package teamgameproject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author srh10
 */
public class NavigationUI extends JFrame{
    
    private NavigationCntl navigationCntl = null;
  
    private JButton optionButton;
    private JButton startButton;
    private JButton instruction;
    private JPanel buttonPanel;

    public NavigationUI(NavigationCntl parentNavigationCntl) {
        parentNavigationCntl = navigationCntl;
        initCustomerComponents();
    }
    
    public void initCustomerComponents(){
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        
        optionButton = new JButton("Option");
        startButton = new JButton("Start");
        instruction = new JButton("How To Play");
        
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                 startButtonActionPerformed(evt);
            }
        });
        buttonPanel = new JPanel();
        
        buttonPanel.add(startButton);
        
        
       
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(instruction, BorderLayout.SOUTH);
        buttonPanel.add(optionButton);
        
         this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.add(instruction);
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
       
         
        
        startButton.setFont(startButton.getFont().deriveFont(36.0f));
        startButton.setPreferredSize(new Dimension(300, 200));
        
        optionButton.setFont(optionButton.getFont().deriveFont(36.0f));
        optionButton.setPreferredSize(new Dimension(300, 200));
        
        instruction.setFont(instruction.getFont().deriveFont(36.0f));
        instruction.setPreferredSize(new Dimension(300, 200));
        
        
        
        optionButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                 optionButtonActionPerformed(evt);
            }
        });
      //  buttonPanel = new JPanel();
        instruction.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                 instructionButtonActionPerformed(evt);
            }
        });
           }
    
    
        private void instructionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        Instruction ist = new Instruction();
        this.setVisible(false);
        ist.setVisible(true);
        ist.setLocationRelativeTo(null);
        
        }
    
    
        private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        OptionUI oUI = new OptionUI();
        this.setVisible(false);
        oUI.setVisible(true);
        oUI.setLocationRelativeTo(null);
        
        }
    
        private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        MyJFrame mjf = new MyJFrame();
        this.setVisible(false);
        mjf.setVisible(true);
        mjf.setLocationRelativeTo(null);
        
        //navigationCntl.showGameboardFrame();
    }     
}

