package eu.marten.java;

import org.junit.BeforeClass;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static App app;
    private static String name;
    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp() {
        name = "Marten";
        app = new App(name);
        
    } 

    @Test
    public void appHasCorrectName() {
         assertTrue("App name is Marten", app.getName() == name);
    }

    @Test
    public void varIsHigherThanOne() {
         assertFalse("Variable is lower than 1", app.calculationValue(0));
    }

    @Test
    public void varDoesntEqualSame() {
        assertNotEquals("Doesn't equal", true, app.calculationValue(0));
    }

    @Test
    public void notNull() {
        assertNotNull("Not null", app.calculation2(1));
    }

    @Test
    public void notSame() {
        assertNotSame("Not same", 3, app.calculation2(1));
    }

    @Test
    public void isSame() {
        assertSame("Same", 1, app.calculation2(0));
    }



    @Test
    public void oneEqualsTwo() {
        assertEquals("One equals two", 1, 1);
    }

    @Test
    public void getMaxValue() {
        assertEquals("Get max value", 10, app.maxValue(4, 10));
    }
    @Test
    public void testArray() {
        int[] testIntArray = {1,2,3};
        assertArrayEquals("Test arrays", testIntArray, app.arrays(1));
    }
}
