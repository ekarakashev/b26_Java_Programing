package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        repeated steps:
            ask the user to enter the item
            add item to shopping list
            ask te ser if they want to ass more items

         */
        Scanner input = new Scanner(System.in);
        String list = "Those are the following items in your basket:";
        String addMore;
        do {
            System.out.println("enter the name of the item");
            list += "\n* " + input.nextLine();

            System.out.println("Do you want to add more to your shopping list");
            addMore = input.nextLine();

        }while(addMore.equalsIgnoreCase("yes")); // if the user types "yes" in the console about wanting to add more items, then the loop will iterate again
        //if the user types anything besides "yes" the equals method will give false and the loop will stop


        System.out.println(list);


    }
}
