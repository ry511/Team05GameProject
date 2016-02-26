/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

/**
 *
 * @author jeongeunsun
 */
public class NavigationCntl {
 
NavigationUI theNavigationUI = null;

public NavigationCntl(){
        
        theNavigationUI = new NavigationUI(this);
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
}
}
