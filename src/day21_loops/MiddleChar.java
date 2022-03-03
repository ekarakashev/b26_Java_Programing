package day21_loops;

public class MiddleChar {
    /*
[Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
    Ex:
    Input: elephant
    Output: The middle characters: ph

     */
    public static void main(String[] args) {

        String s = "elephant";
        //          01234567
        int leng = s.length();

        if (s.length() % 2 == 0){
            //our word is even lenght
            //length /2 => 6/2 =3
            char firstMiddle = s.charAt(leng/2 -1);
            char secondMiddle = s.charAt(leng/2);
            System.out.println("With charAt: " + firstMiddle + secondMiddle); // ==> ph
            System.out.println("With substring: " + s.substring(leng/2 -1, leng/2+1));

        }else{
            //our word is odd length
            char middle = s.charAt(s.length()/2);  //thats when we dont know how long the word is
            System.out.println("with charAt: " + middle);
            System.out.println("with substring: " + s.substring(leng/2, leng/2 +1));
        }




    }
}
