package za.ac.cput.ngosa;
import java.util.*;
/**
 * Created by User on 2015/02/19.
 */
public class DeleteItem {
    static String  value;
    static int count;
    static Scanner input= new Scanner(System.in);
    static Add  myAdd= new Add();
    public static List<String> deleteItem()
    {
        System.out.println("what item would you like to delete");
        value= input.next();
        myAdd.listA.remove(value);
        return(myAdd.listA);
    }

}
