package day32_multidementional_array;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElement {
    public static void main(String[] args) {

      /*
        int [] a = {1, 2, 3, 40, 50};
        //   index  0  1  2   3   4
        int [] z = Arrays.copyOf(a, a.length+2);
        z[5] = 100;
        z[6] = 200;
        System.out.println(Arrays.toString(z));
*/
        Scanner input = new Scanner(System.in);
        System.out.println("How big array we want? ");
        int size = input.nextInt();
        int [] nums = new int[size];


        for (int i = 0; i<nums.length; i++){
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
        }

        System.out.println("Array so far: " + Arrays.toString(nums));

        int [] expand = Arrays.copyOf(nums, nums.length+1 ); //making new array with indexes of the old one and adding 1 more element
        System.out.println("Enter the last number");
        expand[expand.length-1] = input.nextInt();
        //name of the array[lest index of that array]

        System.out.println("Array so far: " + Arrays.toString(expand));






    }
}
