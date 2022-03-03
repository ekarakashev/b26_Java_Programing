package Self_Practice;

import java.util.Scanner;

public class SplitOnTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int leng = word.length();
        int halfLeng = leng/2;
        String firstHalf = word.substring(0, halfLeng);

        System.out.println( firstHalf + firstHalf) ;
    }
}
