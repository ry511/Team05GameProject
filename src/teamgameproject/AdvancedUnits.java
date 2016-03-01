package teamgameproject;

import javax.swing.ImageIcon;

/**
 *
 * @author ShiFan
 */
public class AdvancedUnits {

    public static class Wizard extends Unit {

        public Wizard(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(2, 1, 3, "A wise wizard", 2, new ImageIcon("src/images/wizard1.png"));

        }

    }

    public static class DarkWizard extends Unit {

        public DarkWizard(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(2, 1, 3, "A wise wizard", 2, new ImageIcon("src/images/wizard2.png"));

        }

    }

    public static class DarkKnight extends Unit {

        public DarkKnight(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(3, 2, 1, "A brave knight", 2, new ImageIcon("src/images/knight2.png"));

        }
    }

    public static class Knight extends Unit {

        public Knight(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(3, 2, 1, "A brave knight", 2, new ImageIcon("src/images/knight1.png"));

        }
    }

    public static class Peon extends Unit {

        public Peon(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(1, 1, 1, "A simple unit", 1, new ImageIcon("src/images/peon1.png"));

        }
    }

    public static class DarkPeon extends Unit {

        public DarkPeon(/*int health, int attack, int range, String details, int posX, int posY, int mobility, Image img*/) {
            super(1, 1, 1, "A simple unit", 1, new ImageIcon("src/images/peon2.png"));

        }
    }
}
