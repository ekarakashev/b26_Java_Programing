package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    /*
    Ask the user the month number they want, print the month name
       1 --> January
       12 --> December
       Assume only valid numbers are given, but as a challenge you can handle invalid numbers
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the month you want");
        int month = input.nextInt();

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        System.out.println(months[month-1]);  //index starts from 0 so we need to subtract 1









    }

}
