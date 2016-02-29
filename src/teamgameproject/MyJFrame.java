
package teamgameproject;

import java.awt.Color;
import java.awt.GridLayout;
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
        getContentPane().add(mjp, "Center");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1000, 1000);
        setVisible(true); 
    }
    
}
