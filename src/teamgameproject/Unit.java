package teamgameproject;

import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class Unit {

    private int health;
    private int attack;
    private int range;
    private String details;
    //private int posX;
    //private int posY;
    private int mobility;
    protected Image image;
    protected int width;
    protected int height;
    protected boolean vis;
    private ImageIcon img;
    private boolean isDark;

    public Unit(int health, int attack, int range, String details, int mobility, ImageIcon img, boolean isDark) {
        this.health = health;
        this.attack = attack;
        this.range = range;
        this.details = details;
        //this.posX = posX;
        //this.posY = posY;
        this.mobility = mobility;
        this.img = img;
        this.isDark = isDark;

    }

    public boolean getIsDark(){
        return this.isDark;
    }
    
    public String getStats() {
        return getDetails() + " Attack: " + getAttack() + " Range: " + getRange() + " Mobility: " + getMobility()
                + " Health: " + getHealth();
    }

    public ImageIcon getImg() {
        return this.img;
    }

    public int getHealth() {
        return health;
    }

    public boolean checkUnitMovement(int oldX, int oldY, int newPosX, int newPosY) {
        if ((Math.abs(oldX - newPosX) <= mobility) && (Math.abs(oldY - newPosY) <= mobility)) {
            return true;
        } else {
            return false;
        }

    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public int getRange() {
        return range;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    /*
     public int getPosX() {
     return posX;
     }

     public void setPosX(int posX) {
     this.posX = posX;
     }

     public int getPosY() {
     return posY;
     }

     public void setPosY(int posY) {
     this.posY = posY;
     }
     */

    public Image getImage() {
        return image;
    }

    public boolean isVisible() {
        return vis;
    }

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public int getMobility() {
        return mobility;
    }

}
