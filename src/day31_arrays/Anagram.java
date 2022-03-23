package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String word1 = "listen";
        String word2 = "silent";
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        System.out.println(Arrays.equals(w1, w2));
    }
}