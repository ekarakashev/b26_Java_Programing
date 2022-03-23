package day30_arrays;
/*
[IQ]    Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
 */
public class LongestPalindrome {
    public static void main(String[] args) {


        String [] words = {"java", "longer word", "civicivic", "civic", "apple", "racecar", "mom", "anna"  };
        String longestPoli = "";

        // this loop is iterating through the array
        for (String eachWord : words) { // eachWord is same as words[i]
             // System.out.println(eachWord); this will print us the array words on each line we will get the words : java, longer word,..etc
            boolean isPoli = true;

        //this loop is  iterating through each element in the array
           for ( int i = 0; i< eachWord.length()/2; i++ ){ //we devide lenght by 2 so it will no longer check after reach the middle ot the word
               if (eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1-i)){
                   /*
                   checks if first character is equal to last..and second is equal to second to last ...etc

                   civic
                   int i = 0
                   eachWord. charAt(0) != eachWord.charAt(eachWord.length(5-1-0))   5-1=4
                                c      !=     c
                   int i = 1
                   eachWord. charAt(1) != eachWord.charAt(eachWord.length(5-1-1)) 5-1-1 =3
                                 i     !=     i

                    */

                   isPoli = false; //in chart (0) does not match last char the word is not Polindrome
                   break;


               }//end if

           }//nested loop

            if (isPoli && eachWord.length() > longestPoli.length()){
                longestPoli = eachWord;
            }//end if



        } //end for


        System.out.println(longestPoli.isEmpty()? "No Polindrome" : longestPoli);























    }

}
