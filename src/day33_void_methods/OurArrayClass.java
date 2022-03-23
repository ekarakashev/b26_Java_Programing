package day33_void_methods;

public class OurArrayClass {

    public static void firstElement(int[] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void lastElement (int[]nums){
        System.out.println("Last element: "+ nums[nums.length-1]);
    }
    public static void middleElement(int[]nums){
        if(nums.length%2==0){
            System.out.println("Middle elements are: "+ nums[nums.length/2-1]+" and "+nums[nums.length/2]);
        }else System.out.println("Middle element is: "+nums[nums.length/2-1]);
    }
    public static void printArray(int[] nums){
        String result = "Start | ";
        for (int num :nums){
            result+= num + " ~ ";
        }
        result += " | End";
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        firstElement(a);
        lastElement(a);
        middleElement(a);

        int[] b = {1, 2, 3, 4, 5, 6, 7};
        middleElement(b);

        printArray(b);
    }

}
