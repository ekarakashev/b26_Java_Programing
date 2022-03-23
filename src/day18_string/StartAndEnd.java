package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String str2 = "App";
        System.out.println(str.startsWith(str2)); // does the String str start with the String s.

        System.out.println(str.startsWith(" App")); // space is in the String, so it counts as a space character
        System.out.println(str.startsWith(   "App")); // spaces are in the code, doesn't affect the String

        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
                // index   01234567891111111111
                //                   0123456789
        System.out.println(sentence.startsWith("today was a")); //true
        System.out.println(sentence.startsWith("was")); //false
        System.out.println(sentence.startsWith("was", 6)); // looking for "was" starting index 6 which is true
        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day")); //true






    }
}
