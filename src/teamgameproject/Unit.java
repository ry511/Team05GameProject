package teamgameproject;

import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class Unit {

    private int health;
    private int attack;
    private int range;
    private String details;
    private int mobility;
    protected Image image;
    protected int width;
    protected int height;
    protected boolean vis;
    private ImageIcon img;
    private boolean isDark;
    private int ID;

    public Unit(int health, int attack, int range, String details, int mobility, ImageIcon img, boolean isDark, int ID) {
        this.health = health;
        this.attack = attack;
        this.range = range;
        this.details = details;
        this.mobility = mobility;
        this.img = img;
        this.isDark = isDark;
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public boolean getIsDark() {
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

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean checkUnitMovement(int oldX, int oldY, int newPosX, int newPosY) {
        if ((Math.abs(oldX - newPosX) <= mobility) && (Math.abs(oldY - newPosY) <= mobility)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkUnitRange(int oldX, int oldY, int newPosX, int newPosY) {
        if ((Math.abs(oldX - newPosX) <= range) && (Math.abs(oldY - newPosY) <= range)) {
            return true;
        } else {
            return false;
        }

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
