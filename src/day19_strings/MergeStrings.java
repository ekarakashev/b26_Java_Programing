package day19_strings;

import java.util.Scanner;

public class MergeStrings {

    /*
     two Strings: hard code to have 3 characters each
            merge the Strings together

            ex:
                abc
                xyz

            output: axbycz
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 stringsA");
        String one = input.next();
        String two = input.next();
        String merged = "";
        merged +=one.charAt(0);
        merged +=two.charAt(0);
        merged +=one.charAt(1);
        merged +=two.charAt(1);
        merged +=one.charAt(2);
        merged +=two.charAt(2);
        System.out.println(merged);

    }


}
