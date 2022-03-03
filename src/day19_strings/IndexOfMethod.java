package day19_strings;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        System.out.println(s.indexOf("p")); //gives the index number 0
        System.out.println(s.indexOf("e")); //1
        System.out.println(s.indexOf("n")); //2

        System.out.println(s.indexOf("x")); //whenever u use a character that does not exist it gives u => -1

        System.out.println(s.indexOf("pe")); //it gives just the starting index => 0
        System.out.println(s.indexOf("pz")); // gives -1
        System.out.println(s.indexOf("pn")); // -1 (characters need to be next to each other)

    }
}
