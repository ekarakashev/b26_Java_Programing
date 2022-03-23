package Self_Practice;

import java.util.Locale;
import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();


    if(  email.contains("alejandro") || email.contains("project")  ){
        System.out.println("priority");
    }else if(  email.contains("Alejandro") && !email.contains("project")   ){
        System.out.println("read");
    }else{
        System.out.println("don't read");
    }

    }
}
