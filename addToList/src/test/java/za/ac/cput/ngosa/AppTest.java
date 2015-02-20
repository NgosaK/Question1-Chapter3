package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public List<String> setMyList() {
        List<String> myList = new ArrayList();
        myList.add("bread");
        myList.add("milk");
        return  myList;
    }


    public void testMakeChoice()
    {
        assertEquals('Y', Add.addToList());
    }

    public void testAddToList()
    {
        assertEquals("milk", Add.add().get(0));
    }

    public void testDeleteItem()
    {
        assertEquals(null,Add.add().get(0));
    }

    public void testListContent()
    {
        assertSame(Add.listA,setMyList());
    }


}
