package day32_multidementional_array;

import java.util.Arrays;

public class recap {
    public static void main(String[] args) {

        int [] arr1 = {30, 90, 60, 360, 180};

        int [] arr2 = {180, 360, 30, 90, 60};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1, arr2)); //checking if they are equal..elements are the same but not in the same order, so they are not equal.

        System.out.println("Before sorting: " + Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr1, arr2));


        String [] words = {"Hello", "java", "Saturday"};
        // System.out.println(String.join("###", arr1)); this method works only with string array
        System.out.println(String.join(" ### ", words));
        // Hello ### java ### Saturday
        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));
        // returns char [] ----- [T, o, d, a, y,  , i, s,  , S, a, t, u, r, d, a, y]
        System.out.println(Arrays.toString(str.split(" ")));
        // returns you String  --- [Today, is, Saturday]
    }
}
