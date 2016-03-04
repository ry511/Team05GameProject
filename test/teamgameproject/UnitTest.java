/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Colin
 */
public class UnitTest {
    
    public UnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }




    /**
     * Test of checkUnitMovement method, of class Unit.
     */
    @Test
    public void testCheckUnitMovementPeon() {
        System.out.println("checkUnitMovement");
        int oldX = 0;
        int oldY = 0;
        int newPosX = 1;
        int newPosY = 1;
        Unit instance = null;
        AdvancedUnits.Peon p = new AdvancedUnits.Peon();
        boolean expResult = true;
        int mobility=1;
        boolean result = p.checkUnitMovement(oldX, oldY, newPosX, newPosY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCheckUnitMovementWizard() {
        System.out.println("checkUnitMovement");
        int oldX = 3;
        int oldY = 9;
        int newPosX = 1;
        int newPosY = 1;
        Unit instance = null;
        AdvancedUnits.Wizard w = new AdvancedUnits.Wizard();
        boolean expResult = false;
        int mobility=3;
        boolean result = w.checkUnitMovement(oldX, oldY, newPosX, newPosY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    

    /**
     * Test of getImg method, of class Unit.
     */
//    @Test
//    public void testGetImg() {
//        
//    }

    /**
     * Test of getHealth method, of class Unit.
     */
//    @Test
//    public void testGetHealth() {
//        Peon pea = new Peon();
//        int peaHealth = pea.getHealth();
//        int expectedHealth = 1;
//        assert(peaHealth == expectedHealth);
//    }
//
//    /**
//     * Test of setHealth method, of class Unit.
//     */
//    @Test
//    public void testSetHealth() {
//        Peon pea = new Peon();
//        int newHealth = 2;
//        pea.setHealth(newHealth);
//        int setHealth = pea.getHealth();
//        assertEquals(newHealth, setHealth);
//    }
//
//    /**
//     * Test of getAttack method, of class Unit.
//     */
//    @Test
//    public void testGetAttack() {
//        System.out.println("getAttack");
//        Peon pea = new Peon();
//        int peaAttack = pea.getAttack();
//        int expResult = 1;
//        assertEquals(expResult, peaAttack);
//        
//    }

//    public class UnitImpl extends Unit {
//
//        public UnitImpl() {
//            super(0, 0, 0, "", 0, null);
//        }
//    }



//    public class UnitImpl extends Unit {
//
//        public UnitImpl() {
//            super(0, 0, 0, "", 0, null);
//        }
//    }
//    


}
