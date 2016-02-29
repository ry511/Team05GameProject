
package teamgameproject;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 * @author rwb5529
 */
public class MyJPanel extends JPanel implements ActionListener{
    
    
    private GameBoardPanel gameBoardPanel;
    
    
    
    MyJPanel(){
        
        super();
        
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        
        gameBoardPanel = new GameBoardPanel();
        add(gameBoardPanel, BorderLayout.CENTER);
        gameBoardPanel.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
