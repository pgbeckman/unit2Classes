

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void insertCansTest() {
        VendingMachine wendy = new VendingMachine(50);
        wendy.insertCans(50);
        assertEquals(100, wendy.getCans(), 1e-6);
    }
    @Test
    public void insertTokensTest() {
        VendingMachine wendy = new VendingMachine(70);
        wendy.insertTokens(50);
        assertEquals(20, wendy.getCans(), 1e-6);
        assertEquals(50, wendy.getTokens(), 1e-6);
    }
}
