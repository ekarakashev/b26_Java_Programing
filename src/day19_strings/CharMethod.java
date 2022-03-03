package day19_strings;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));  //line 11
        System.out.println(s.charAt(3));    //line 12
        //System.out.println(s.charAt(4));

        int lastIndex = s.length() -1; // 4-1 = 3
        System.out.println("last char: " + s.charAt(lastIndex)); // this is the same like line 12 but line 12 is hard coded

        int secondToLastIndex = s.length() -2; // 4-2=2
        char secondToLastChar = s.charAt(secondToLastIndex); //this is the same as line 11
    }
}
