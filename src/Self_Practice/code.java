package Self_Practice;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();
        int price = 0;
        //WRITE YOUR CODE HERE:

        String message = "";

        if(numberOfBedrooms==1){
            price=1100;
            message = "One Bedroom Selected" + "\nStarting Price: "+ price;
        } else if (numberOfBedrooms==2) {
            price=1850;
            message = "Two Bedroom Selected" + "\nStarting Price: " + price;
        } else if (numberOfBedrooms==3) {
            price=2550;
            message = "Three Bedroom Selected" + "\nStarting Price: " + price;
        } else {
            message = "Sorry, we do not offer that many bedrooms";
        }
    }
}
