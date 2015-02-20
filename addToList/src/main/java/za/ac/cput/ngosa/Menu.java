package za.ac.cput.ngosa;

import java.util.*;

/**
 * Created by User on 2015/02/19.
 */
public class Menu {
    public  static int choice;
    public  static Scanner input= new Scanner(System.in);
    public static int menu()
    {
        do{
            System.out.println("1. Add items");
            System.out.println("2. Delete Items");
            System.out.println("3. Display Items");
            System.out.println("4.Exit");
            choice=input.nextInt();
        }
        while(choice<1 || choice>4);

        return choice;
    }
}
