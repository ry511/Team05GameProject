/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author jeongeunsun
 */
public class NavigationCntl {
 
NavigationUI theNavigationUI = null;
       // MyJFrame mjf = new MyJFrame();
public NavigationCntl(){
        
        theNavigationUI = new NavigationUI(this);
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
        music();
}
 public void music(){
       InputStream in;
        try{
            in = new FileInputStream(new File("src/Soundeffect/Dragonball.wav"));
            AudioStream audios=new AudioStream(in);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            
     //  mjf.setVisible(true);
    }
}
