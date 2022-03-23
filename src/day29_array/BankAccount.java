package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

    String[] bankAccountOne = {"Brad Smith", "Checking", "100219482", "100,000" };
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Acc type: " + bankAccountOne[1]);
        System.out.println("Acc number: " + bankAccountOne[2]);
        System.out.println("Available amount: " + bankAccountOne[3]);

    String[] bankAccountTwo = new String[4];
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "SAvings";
        bankAccountTwo[2] = "123456852";
        bankAccountTwo[3] = "150,975";
        System.out.println(Arrays.toString(bankAccountTwo));

        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        bankAccountThree[0] = fullName;
        System.out.println("Enter your account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));




    }
}
