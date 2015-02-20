package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import java.util.*;
public class ListTest
        extends TestCase
{

    Add myAdd;
    DeleteItem myDelete;
    Menu myMen;
    DisplayList myDisplay;
    List<String> myList;
    @Before
    public void setUp() throws Exception{
        myAdd = new Add();
        myMen= new Menu();
        myDisplay= new DisplayList();
        myList= new ArrayList<String>();
    }

    @After
    public void tearDown() throws Exception
    {
        myAdd=null;
        myList=null;
        myMen=null;
        myDisplay=null;
    }


    /*public void testMakeChoice()
    {
        assertEquals('Y', Add.addToList());
    }*/

    @org.junit.Test
    public void testAddToList()
    {
        assertEquals("milk", myAdd.add().get(0));
    }

    @org.junit.Test
    public void testDeleteItem()
    {
        assertEquals(null,myAdd.add().get(0));
    }

    @org.junit.Test
    public void testListContent()
    {
        assertSame(myList,myDisplay.displayList());
    }

    @org.junit.Test
    public void testChoice()
    {
        assertEquals(9,myMen.menu());
    }




}