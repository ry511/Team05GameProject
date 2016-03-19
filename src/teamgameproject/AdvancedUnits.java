package teamgameproject;

import javax.swing.ImageIcon;

/**
 *
 * @author ShiFan
 */

/*
Created AdvancedUnits class to combine multiple unit classes. Originally we had a separate class that each extended
Unit, but they each stored similar information, so AdvancedUnits was created where sublcasses extended the Unit class 
to make the code easier to manage as they are all under one class.
Refactored by: Shifan Zheng, committed on February 29
*/
public class AdvancedUnits {

    static final boolean normalUnit = false;
    static final boolean darkUnit = true;

    static final int wizardHealth = 2, wizardAttack = 1, wizardRange = 3, wizardMobility = 2, wizardID = 5, darkWizardID = 6;
    static final String wizardDetail = "A wise wizard";
    static final ImageIcon wizardIMG = new ImageIcon("src/images/wizard1.png"), darkWizardIMG = new ImageIcon("src/images/wizard2.png");

    static final int knightHealth = 3, knightAttack = 2, knightRange = 1, knightMobility = 2, knightID = 3, darkKnightID = 4;
    static final String knightDetail = "A brave knight";
    static final ImageIcon knightIMG = new ImageIcon("src/images/knight1.png"), darkKnightIMG = new ImageIcon("src/images/knight2.png");

    static final int peonHealth = 1, peonAttack = 1, peonRange = 1, peonMobility = 1, peonID = 1, darkPeonID = 2;
    static final String peonDetail = "A simple unit";
    static final ImageIcon peonIMG = new ImageIcon("src/images/peon1.png"), darkPeonIMG = new ImageIcon("src/images/peon2.png");


    /*
     Created variables for magic numbers for wizard and dark wizard classes
     and added @Override to getStats methods.
    Refactored by: Shifan Zheng
     */
    public static class Wizard extends Unit {

        public Wizard() {
            super(wizardHealth, wizardAttack, wizardRange, wizardDetail, wizardMobility, wizardIMG, normalUnit, wizardID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }

    }

    public static class DarkWizard extends Unit {

        public DarkWizard() {
            super(wizardHealth, wizardAttack, wizardRange, wizardDetail, wizardMobility, darkWizardIMG, darkUnit, darkWizardID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }
    }
    /*
     Created variables for magic numbers for knight and dark knight classes
     and added @Override to getStats methods.
    Refactored by: Shifan Zheng
     */

    public static class DarkKnight extends Unit {

        public DarkKnight() {
            super(knightHealth, knightAttack, knightRange, knightDetail, knightMobility, darkKnightIMG, darkUnit, darkKnightID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }

    }

    public static class Knight extends Unit {

        public Knight() {
            super(knightHealth, knightAttack, knightRange, knightDetail, knightMobility, knightIMG, normalUnit, knightID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }

    }

    /*
     Created variables for magic numbers for peon and dark peon classes
     and added @Override to getStats methods.
    Refactored by: Shifan Zheng
     */
    public static class Peon extends Unit {

        public Peon() {
            super(peonHealth, peonAttack, peonRange, peonDetail, peonMobility, peonIMG, normalUnit, peonID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }

    }

    public static class DarkPeon extends Unit {

        public DarkPeon() {
            super(peonHealth, peonAttack, peonRange, peonDetail, peonMobility, darkPeonIMG, darkUnit, darkPeonID);

        }

        @Override
        public String getStats() {
            return super.getStats();
        }
    }

}
