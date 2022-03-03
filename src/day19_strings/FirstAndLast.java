package day19_strings;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = input.nextLine();

        System.out.println("first character " + str.charAt(0) );
        System.out.println("last character " + str.charAt(str.length() -1));  //prints the last character and its dynamic


    }
}
