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
     * Test of getImg method, of class Unit.
     */
    @Test
    public void testGetImg() {
        
    }

    /**
     * Test of getHealth method, of class Unit.
     */
    @Test
    public void testGetHealth() {
        Peon pea = new Peon();
        int peaHealth = pea.getHealth();
        int expectedHealth = 1;
        assert(peaHealth == expectedHealth);
    }

    /**
     * Test of setHealth method, of class Unit.
     */
    @Test
    public void testSetHealth() {
        Peon pea = new Peon();
        int newHealth = 2;
        pea.setHealth(newHealth);
        int setHealth = pea.getHealth();
        assertEquals(newHealth, setHealth);
    }

    /**
     * Test of getAttack method, of class Unit.
     */
    @Test
    public void testGetAttack() {
        System.out.println("getAttack");
        Peon pea = new Peon();
        int peaAttack = pea.getAttack();
        int expResult = 1;
        assertEquals(expResult, peaAttack);
        
    }

    /**
     * Test of getRange method, of class Unit.
     */
    @Test
    public void testGetRange() {
        System.out.println("getRange");
        Unit instance = null;
        int expResult = 0;
        int result = instance.getRange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetails method, of class Unit.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Unit instance = null;
        String expResult = "";
        String result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetails method, of class Unit.
     */
    @Test
    public void testSetDetails() {
        
    }

    /**
     * Test of getImageDimensions method, of class Unit.
     */
    @Test
    public void testGetImageDimensions() {
    
    }

    /**
     * Test of loadImage method, of class Unit.
     */
    @Test
    public void testLoadImage() {
      
    }

    /**
     * Test of getImage method, of class Unit.
     */
    @Test
    public void testGetImage() {
        
    }

    /**
     * Test of isVisible method, of class Unit.
     */
    @Test
    public void testIsVisible() {
        
    }

    /**
     * Test of setVisible method, of class Unit.
     */
    @Test
    public void testSetVisible() {
        
    }

    public class UnitImpl extends Unit {

        public UnitImpl() {
            super(0, 0, 0, "", 0, null);
        }
    }
    
}
