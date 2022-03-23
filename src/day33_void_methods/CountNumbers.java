package day33_void_methods;

import java.util.Scanner;

public class CountNumbers {

    public static void countTo(int num){

        for(int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num: ");
        countTo(input.nextInt());
    }

    }


