package day19_strings;

import java.util.Scanner;

public class WEbsite {
    public static void main(String[] args) {
        /*
        Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL");
        String url = input.next();
        //www.google.com
        //01234567891011
        String website = url.substring(4, url.length()-4); // it takes from forth index till the .com
        System.out.println(website);
        //input www.google.com output => google
        //input www.apple.com output => apple

    }
}
