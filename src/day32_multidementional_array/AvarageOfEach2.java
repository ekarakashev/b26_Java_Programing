package day32_multidementional_array;

import java.util.Arrays;

public class AvarageOfEach2 {
    public static void main(String[] args) {


        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6, 15},
                {10, 20, 30},
                {12, 51, 32, 52, 30}
        };

        double total = 0;   //total sum of each inner array element
        int totalLength = 0; //number of all the digits we have.

        for(int i = 0; i< nums.length; i++){ //going through 2d array

            //System.out.println(Arrays.toString(eachArray));

            double sum = 0;

            for(int j = 0; j< nums[i].length; j++){
                sum += nums[i][j];
            }

            System.out.println(Arrays.toString(nums[i]) + " the average is: " + (sum/ nums[i].length));
            total += sum;
            totalLength += nums[i].length;
        }

        System.out.println("How many numbers we have - " + totalLength);
        System.out.println("Average of the whole 2D array: " + (total/totalLength));





/*
                int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6, 15},
                {10, 20, 30},
                {12, 51, 32, 52, 30}
                };

        int i = 0

        int j =0
        nums [i][j]
        nums [0][0] -->3

        j increments
        j=1
        nums [0][1] --> 4

        j=2
        nums [0][2] --> 5

        j=3
        nums [0][3] --> 6


        int i = 1

        int j =0
        nums [1][0] -->5

        j=1
        nums [1][1] --> 2

        j=2
        nums [1][2] --> 6

        j=3
        nums [1][3] --> 15

        j=4
        nums [1][3] --> 6



 */




    }


}

