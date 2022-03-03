package day18_string;

import java.util.Locale;

public class UnderAndLower {
    public static void main(String[] args) {

        String str = "sNOw";

        System.out.println(str.toUpperCase()); //prints all characters uppercase --> SNOW
        System.out.println(str.toLowerCase()); //prints all characters lowercase --> snow
        System.out.println(str); // prints => sNOw

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        System.out.println(a); //prints 5

        String word2 = word + " WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += " new text";  //word = word + "next text"
        System.out.println(word);

        String old = "mark";
        String newValue = old.toUpperCase();

        System.out.println(old); //mark
        System.out.println(newValue); //MARK



    }//end main meth
}//end class
