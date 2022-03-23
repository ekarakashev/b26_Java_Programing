package day23_loops;

public class Palindrome {
    public static void main(String[] args) {

        String str = "tattarrattat";
//reverce the string
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i); //characters are being red from the end and being added backwards into reverse String
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Word is not palindrome");
        }
        System.out.println(reverse);

    }
}
