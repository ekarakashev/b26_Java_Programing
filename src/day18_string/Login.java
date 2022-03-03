package day18_string;

import java.util.Scanner;

public class Login {
    /*

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
         String username = input.next();
         username = username.toLowerCase();
        System.out.println("Please enter your password");
        String password = input.nextLine();  //if we use 1 for next and other one nextLine we might have issue

        if(password.length() >=8 && password.equals("jamesbond")){
            System.out.println("logged in with " + username);
        }else{
            System.out.println("Invalid password");
        }



    }
}
