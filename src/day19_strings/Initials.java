package day19_strings;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            01234
            bond
            0123
            JB
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your First and Last name: ");
        String firstName = input.next().toUpperCase();
        String lastName = input.next().toUpperCase();

        System.out.println( firstName.charAt(0) + "" + lastName.charAt(0));



    }
}
