package com.orc.ak;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App #4.
 */
public class App4Test
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App4Test(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println( "TESTING: App4Test.suite() .. " );
        return new TestSuite( App4Test.class );
    }

    /**
     * Extremely Rigourous Test for App4 :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
