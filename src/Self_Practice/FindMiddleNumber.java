package Self_Practice;

import java.util.Scanner;

public class FindMiddleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        String message = " ";

        if(num2>=num1 && num1>=num3 || num3>=num1 && num1>=num2){
            message = "middle number is: " + num1;
        }

        if(num1>=num2 && num2>=num3 || num3>=num2 && num2>=num1){
            message = "middle number is: " + num2;
        }

        if(num1>=num3 && num3>=num2 || num2>=num3 && num3>=num1){
            message = "middle number is: " + num3;
        }

        System.out.println(message);




    }

}
