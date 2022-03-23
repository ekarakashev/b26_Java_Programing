package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int iterations = 0;

        while(iterations < 5){
            iterations++; //this can be put after the if statement but should not be inside the if stmnt
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }
            if (num < min){
                min=num;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
