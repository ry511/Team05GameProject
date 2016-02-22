
package teamgameproject;


public class Peon extends Unit{
    
    public Peon (int health, int attack, int range, String details, int posX, int posY, int mobility){
        super(health, attack, range, details, posX, posY, mobility);
        health=1;
        attack=1;
        range=1;
        details="A simple Unit";
        mobility=1;
    }
}
