package day32_multidementional_array;

import java.util.Arrays;

public class MultyArrEx {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10};
        int [] m = {5, 10, 100, 39, 19};

        int [][] all = {n,m};
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all)); //this is to print multi dementional arrays
        System.out.println("1st array " + Arrays.toString(all[0])); // print 1st array
        System.out.println("2nd array " + Arrays.toString(all[1]));
        System.out.println("******");

        int [][] multi = {

                {90,80,50},  // index 0 array
                {54,58,669,51}, // index 1 array
                {14,58},  // index 2 array
                {13}  // index 3 array

        };

        System.out.println(multi.length);  // = 4
        System.out.println(multi[0].length); // length of 1st array = 3
        System.out.println(multi[0][1]); // 80
        System.out.println(multi[3].length);

    }
}
