package teamgameproject;

public abstract class Unit {

    private int health;
    private int attack;
    private int range;
    private String details;
    private int posX;
    private int posY;
    private int mobility;

    public Unit(int health, int attack, int range, String details, int posX, int posY, int mobility) {
        this.health = health;
        this.attack = attack;
        this.range = range;
        this.details = details;
        this.posX = posX;
        this.posY = posY;
        this.mobility = mobility;
    }

    public int getHealth() {
        return health;
    }

    public void moveUnit(int newPosX, int newPosY) {
        if ((Math.abs(posX - newPosX) <= mobility) &&(Math.abs(posY - newPosY) <= mobility)) {
            posX = newPosX;
            posY = newPosY;
        }
        else {
            System.out.println("Unit does not have enough mobility");
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
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
}
