package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        boolean isPrime = number >=2; //true when u have valid number
        /*
        n%2
        n%3
        n%3
        ...
        n% les than number
         */

    // this loop is trying to check if any number is evenly divisible
        for (int i =-200; i<number; i++){

            if(number % i ==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is not prime");
        }

    }
}
