package Self_Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]

         */

        int[] x = {17,12,10,8};
        int firstIndexOfx = x[0];

        for (int i = 0; i< x.length-1; i++){
            x[i] = x[i+1];

        }
        x[x.length-1] = firstIndexOfx;
        System.out.println(Arrays.toString(x));





    }
}
