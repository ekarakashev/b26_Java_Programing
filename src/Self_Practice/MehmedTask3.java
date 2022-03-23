package Self_Practice;

import java.util.Arrays;

public class MehmedTask3 {
    /*
    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
     */
    public static void main(String[] args) {

        String str = "knife,      wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String [] arr = str.split(", "); //converting the string into array. it will separate everything after the coma
        System.out.println(Arrays.toString(arr));

        for(String eachWord : arr){
            eachWord = eachWord.trim();
            if(eachWord.trim().contains(" ")){
                System.out.println(eachWord);
            }
        }




    }
}
