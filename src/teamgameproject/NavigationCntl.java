/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.in;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;
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
  public void music(){
     InputStream in;
      try {
                in = new FileInputStream(new File("src/Soundeffect/Dragonball.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
}}

