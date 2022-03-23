package Self_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeStartEndPoint {
    public static void main(String[] args) {
        /*
        Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Add your starting number");
        int firstNum = input.nextInt();
        System.out.println("Add your ending number");
        int lastNum = input.nextInt();

        int [] a = new int[lastNum - firstNum];

        for (int i = 0; i< a.length; i++){
           a[i] = firstNum ++;

        }
        System.out.println(Arrays.toString(a));
    }
}
