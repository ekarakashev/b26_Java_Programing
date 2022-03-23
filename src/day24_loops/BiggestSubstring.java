package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {

    String s = "aaabbbnbbbbbbbbccccccddddee";
    String sub = "";
    String biggest = "";

    for(int i = 0; i<s.length()-1; i++){

       sub += s.charAt(i);

       if (s.charAt(i) != s.charAt(i+1)){ //s.charAt(i+1) checks the character after

            if (sub.length() > biggest.length()){
                biggest = sub;
            }// end nested if
           sub = "";  //resets this string for the next string
       } //end if
    }//end for
        System.out.println(biggest);

    }//end main

}//end class
