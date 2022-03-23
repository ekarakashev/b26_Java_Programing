package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = input.nextLine().trim();
        String fixed = "";

        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                fixed+= "_ ";
            }else {
                fixed +=s.charAt(i) + " ";
            }
        }
        System.out.println(fixed.trim());




    }
}
