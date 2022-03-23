package day29_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {10, 0, 0, 0, 5, 0 ,1, 0};
        int[] newArr = new int[nums.length];
        int index = 0;

        for (int i = 0; i< nums.length; i++){

            if (nums[i] !=0){
                newArr[index++] = nums[i];
           }
    }

       /* for(int each : nums){
            if(each != 0){
                newArr[index] = each;
                index++;
            }
        }*/

        System.out.println(Arrays.toString(newArr));
    }
}
