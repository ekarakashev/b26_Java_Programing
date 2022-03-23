package day32_multidementional_array;

import java.util.Arrays;

public class AvarageOfeach {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6, 15},
                {10, 20, 30},
                {12, 51, 32, 52, 30}
        };

        double total = 0;   //total sum of each inner array element
        int totalLength = 0; //number of all the digits we have.

        for(int [] eachArray : nums){

            //System.out.println(Arrays.toString(eachArray));

            double sum = 0; //declaring double every time the inner loops ends. this double will be reset to 0

            for(int eachNumber : eachArray){
                sum += eachNumber;
            }

            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/ eachArray.length));
            total += sum;
            totalLength += eachArray.length;
        }

        System.out.println(totalLength);
        System.out.println("Average of the whole 2D array: " + (total/totalLength));
    }
}




