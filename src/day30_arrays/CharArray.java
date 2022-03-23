package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};
        String word = "java";
        char [] java = word.toCharArray(); //converting string to char array

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        for (char eachChar : java){
            System.out.println(eachChar);
        }

        System.out.println(java[0]);
        System.out.println("=============");


        //convert char array to string method
        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day); //converts array into string
        System.out.println(strDay);  //prints monday
        System.out.println(day); //prints monday
        System.out.println(strDay.toUpperCase()); // it will print to upper case
         // System.out.println(day.toUpperCase); this will not work


    }//main
}//class
