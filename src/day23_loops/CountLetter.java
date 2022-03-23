package day23_loops;

public class CountLetter {
    public static void main(String[] args) {
/*
       Given a String we want to count how many 'a' characters we have
       Challenge: adjust so that we can check for not only 'a' but any character
 */

        String s = "tattarrattat";
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a'){  //checks each character if its equal to 'a'
                count++;
            }
        }
        System.out.println(count);


    }
}
