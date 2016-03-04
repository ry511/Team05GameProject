/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamgameproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ShiFan
 */
public class GameBoardPanelTest {
    
    public GameBoardPanelTest() {
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
     * Test of createPeon method, of class GameBoardPanel.
     */
    @Test
    public void testPeonStats() {
        GameBoardPanel instance = new GameBoardPanel();
        AdvancedUnits.Peon p = new AdvancedUnits.Peon();
        instance.setToolTipText(p.getStats());
        
        String text= instance.getToolTipText();
        String stats = "A simple unit Attack: 1 Range: 1 Mobility: 1 Health: 1";
        assertEquals(stats, text);
    }


    /**
     * Test of createWizard method, of class GameBoardPanel.
     */
    @Test
    public void testWizardStats() {
        GameBoardPanel instance = new GameBoardPanel();
        AdvancedUnits.Wizard w = new AdvancedUnits.Wizard();
        instance.setToolTipText(w.getStats());
        
        String text= instance.getToolTipText();
        String stats = "A wise wizard Attack: 1 Range: 3 Mobility: 2 Health: 2";
        assertEquals(stats, text);
    }


    /**
     * Test of createKnight method, of class GameBoardPanel.
     */
    @Test
    public void testKnightStats() {
        GameBoardPanel instance = new GameBoardPanel();
        AdvancedUnits.Knight k = new AdvancedUnits.Knight();
        instance.setToolTipText(k.getStats());
        
        String text= instance.getToolTipText();
        String stats = "A brave knight Attack: 2 Range: 1 Mobility: 2 Health: 3";
        assertEquals(stats, text);
    }
 
}
