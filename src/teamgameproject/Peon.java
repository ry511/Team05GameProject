
package teamgameproject;

import javax.swing.ImageIcon;


public class Peon extends Unit{
    
    public Peon (/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/){
        super(1, 1, 1, "A simple unit", /*posX, posY,*/ 1, new ImageIcon("src/images/peon.png") );
        
    }
    
    public void attackPeon(Peon attacker, Peon victim){
        int healthAfterAttack = 0;
        victim.setHealth(healthAfterAttack);
        int attackIncrease = 2;
        attacker.setAttack(attackIncrease);
    }
   
}
