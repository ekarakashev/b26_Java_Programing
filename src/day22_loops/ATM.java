package day22_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to atm");
        int validPin = 1234;
        int userPin;   //declair here and assign in the scanner..
        int attempts = 0;
        do{
            System.out.println("enter ur pin");
            userPin = input.nextInt();  //assinging the userPin int
            attempts++;
        }while (attempts<3 && validPin != userPin);
            if(validPin == userPin){
                System.out.println("logged in");
            }else{
                System.out.println("locked out");
            }

        }

    }

