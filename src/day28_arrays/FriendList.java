package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    /*
    Make an array of your friends names
    Asking how many friends do you have
    Then ask for each friend's name one at a time, store
    all the names into an array
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int numOfFriends= input.nextInt();


        String [] friends= new String[numOfFriends];
        for (int i=0; i<numOfFriends; i++){

            System.out.println("Enter the name of your friend: " + (i + 1));
            friends[i]= input.next();
        }
        System.out.println(Arrays.toString(friends));







    }

}
