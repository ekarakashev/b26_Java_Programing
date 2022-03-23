package day32_multidementional_array;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(nums, 4)); //it will show is the index of 4
        System.out.println(Arrays.binarySearch(nums, 100));//it will show is the index of 100
        System.out.println(Arrays.binarySearch(nums, 200)); //it gives us -5 bcs the positive value of that number would be in position 5
        System.out.println(Arrays.binarySearch(nums, 6)); //if we have 6 in the array it would be in position 2, but it will give us negative -2

    }
}
