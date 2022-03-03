package day16_Review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / % ");
        String operator = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();
        double result = 0;

        switch (operator){

            case "+":
               result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*" :
                result = numOne * numTwo;
                break;
            case "/":

                if(numTwo !=0){
                    result = numOne / numTwo;
                }else{
                    System.out.println("Can not divide by 0");
                }
                break;
            case "%":
                if(numTwo !=0) {
                    result = numOne % numTwo;
                }else{
                    System.out.println("Can not take a reminder of 0");
                }
                break;

            default:
                System.out.println(operator + " is not a valid operator for this calculator");



        } //end of switch

        System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);



    }
}
