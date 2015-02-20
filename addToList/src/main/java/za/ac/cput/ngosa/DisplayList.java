package za.ac.cput.ngosa;
import java.util.*;
/**
 * Created by User on 2015/02/19.
 */
public class DisplayList

{

    public static List<String> displayList()
    {
        if(Add.listA.size()==0)
        {
            System.out.println("list is empty");
            return Add.listA;
        }
        for(String l: Add.listA) {
            System.out.println(l);
        }
        return Add.listA;
    }
}
