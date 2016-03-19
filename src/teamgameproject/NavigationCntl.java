/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jeongeunsun
 */
public class NavigationCntl {
 
NavigationUI theNavigationUI = null;
ImageIcon image;
       // MyJFrame mjf = new MyJFrame();
public NavigationCntl(){
        
        theNavigationUI = new NavigationUI(this);
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
        
}
 public void showGameboardFrame(){
      
        MyJFrame mjf = new MyJFrame();
        mjf.setVisible(true);
        mjf.setLocationRelativeTo(null);
    }
 
 public void setImage(NavigationUI d,ImageIcon a){
    this.image = a;
     
      try {

     //       d.add(new JLabel(new ImageIcon(ImageIO.read(new File(ImageIcon a)))));

        } catch (IOException e) {
            System.out.println("Image ");
        }
     
 }
}

