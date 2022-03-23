package day24_loops;

public class CharacterInString {
    public static void main(String[] args) {
        String s = "java";

        for (int i = 0; i<s.length(); i++){
            System.out.print((int)s.charAt(i) + " "); //casting s.charAt so it will show us ASCII number for each character

        }

    }
}
