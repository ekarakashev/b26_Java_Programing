package Self_Practice;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        /*
        declare and assign an age variable

use these ranges to determine which age group you belong to

	if the given age value is less than 0 or more than 120:
		print: Invalid age

	otherwise uses these to determine the age group

		Baby (2 years and below)
		Toddler (3 - 5)
		Kid (6 - 9
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 35)
		Middle-Aged Adult (36 - 55)
		Senior Citizen (55+)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();

        if(age >= 0 && age <=120){
            if(age<=2){
                System.out.println("Baby");
            }else if(age>=3 && age <= 5){
                System.out.println("Toddler");
            }else if(age >= 6 && age <=9){
                System.out.println("Kid");
            }else if(age>=10 && age <= 12){
                System.out.println("Pre-teen");
            }else if(age>=13 && age<-17){
                System.out.println("Teenager");
            }else if(age>=18 && age<=20){
                System.out.println("Young adult");
            }else if(age>= 21 && age<=35){
                System.out.println("Adult");
            }else if(age>=36 && age<=55){
                System.out.println("Mid-age adult");
            }else{
                System.out.println("Senior citizen");
            }


        }else {
            if (age < 0) {
                System.out.println("Invalid age");
            }else{
                System.out.println("You are too old");
            }
        }



    }//end main
}//end class
