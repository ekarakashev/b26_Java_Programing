package day24_loops;

import java.util.Scanner;

public class CountsWords {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words Output:
    4
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int space = 0;

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                space++;
            }//end if
        }//end for
        System.out.println("Num of words:" + (space +1));

    }
}
