package day29_array;

public class EvenOrOdd {
    public static void main(String[] args) {
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers

 */

        int [] nums = {4, 1, 3, 12, 5, 17, 33, 14, 21, 28};
        int even = 0;
        int odd = 0;
        String evenNums = "" ;
        String oddNums = "";

     /*
     for(int i = 0; i< nums.length; i++){
            if(nums[i] % 2 == 0){
                even++;
                evenNums += nums[i] + " ";
            }else{
                odd++;
                oddNums+= nums[i] + " ";
            }
        }
     */
        for (int number: nums){
            if (number %2 == 0){
                even++;
                evenNums += number + " ";
            }else{
                odd++;
                oddNums+= number+ " ";
            }
        }


        System.out.println("How many even numbers did we found? =>" + even);
        System.out.println("Even numbers \n" + evenNums);
        System.out.println("How many odd numbers dd we found? =>"  + odd);
        System.out.println("Odd numbers \n" + oddNums);
    }
}
