package za.ac.cput.ngosa;

import java.util.*;
import java.lang.Character;
/**
 * Created by User on 2015/02/19.
 */
public class Add {
    public  static char choice;
    public  static int counter=1;
    public  static String value;
    public  static Scanner input= new Scanner(System.in);
    public    static List<String> listA = new ArrayList();
    public  static Set<String> setA = new HashSet();
    public  static Map mapA = new HashMap();


public static char addToList()
{
    do{
        add();
        System.out.println("Would you like to add an item[Y/N]: ");
        choice= input.next().charAt(0);
        while (Character.toUpperCase(choice)!='Y' && Character.toUpperCase(choice)!='N' )
        {
            System.out.println("Invalid option please re-select, Would you like to add another item[Y/N]: ");
            choice= input.next().charAt(0);
        }
    }
    while(choice!='N');
    return choice;

}

    public static List<String> add()
    {
        System.out.println("Enter item name: ");
        value= input.next();
        mapA.put(counter, value);
        setA.add(value);
        listA.add(value);
        counter++;
        return(listA);
    }
}
