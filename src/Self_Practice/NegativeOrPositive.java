package Self_Practice;

import java.util.Scanner;

public class NegativeOrPositive {

    /*
    create a method that will accept a number. Find and print if it is a
positive number, negative number, or zero
     */
    public static void postiveOrNegative (int num ) {
        if (num > 0) {
            System.out.println("Your number is positive");
        } else if (num < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        postiveOrNegative(input.nextInt());
    }
   }



