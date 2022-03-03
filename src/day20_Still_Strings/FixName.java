package day20_Still_Strings;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*

         */
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter 1st name");
        String firstName = inout.next();
        System.out.println("Enter last name");
        String lastName = inout.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFist = firstName.substring(0,1).toUpperCase();
        fixedFist +=firstName.substring(1);

        String fixedLast = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);

        System.out.println(fixedFist + "" + fixedLast);






    }
}
