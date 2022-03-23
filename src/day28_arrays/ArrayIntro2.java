package day28_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4]; //gives us double array with 4 elements each = 0.0 by default
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr)); //[30.99, 0.0, 0.0, 0.0]
        arr[1] = 12.55;
        System.out.println(Arrays.toString(arr)); //[30.99, 12.55, 0.0, 0.0]
        arr[2] = 10.20;
        System.out.println(Arrays.toString(arr)); //[30.99, 12.55, 10.20, 0.0]
        arr[3] = 5;
        System.out.println(Arrays.toString(arr)); //[30.99, 12.55, 10.20, 5.0]

        //
        arr = new double[5];
        System.out.println(Arrays.toString(arr)); //creates new array with 5 elements and reassigns the arr reference to the new object. it will print [0.0, 0.0, 0.0, 0.0, 0.0]
        //access just one element
        System.out.println(arr[1]); // this element is 0.0

    }
}
