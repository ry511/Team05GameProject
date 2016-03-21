package teamgameproject;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author srh10
 */
public class NavigationUI extends JFrame {

    private NavigationCntl navigationCntl = null;
    private JButton startButton;
    private JPanel buttonPanel;

    public NavigationUI(NavigationCntl parentNavigationCntl) {
        parentNavigationCntl = navigationCntl;
        initCustomerComponents();
    }

    public void initCustomerComponents() {
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        startButton = new JButton("Start");

        buttonPanel = new JPanel();

        try {

            this.add(new JLabel(new ImageIcon(ImageIO.read(new File("src/images/Main2.png")))));

        } catch (IOException e) {
            System.out.println("Image ");
        }
        this.setResizable(false);
        this.pack();
        this.setVisible(true);

        buttonPanel.add(startButton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        startButton.setFont(startButton.getFont().deriveFont(36.0f));
        startButton.setPreferredSize(new Dimension(200, 100));

        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
    }

    
      public void setMusic(){
     InputStream in;
      try {
                in = new FileInputStream(new File("src/Soundeffect/Dragonball.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
}
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        NavigationCntl a = new NavigationCntl();
        setMusic();
        MyJFrame mjf = new MyJFrame();
        mjf.setVisible(true);
        mjf.setLocationRelativeTo(null);

    }
}
