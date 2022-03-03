package Self_Practice;

import java.util.Scanner;

public class LoseTheX {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();




        if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))) {
            System.out.println(word.substring(1, word.length() - 1));
        }else if(word.startsWith("x") || word.startsWith("X") ){
            System.out.println(word.substring(1));
        }else if( word.endsWith("X") || word.endsWith("x")){
            System.out.println(word.substring(word.length()-1));
        }else{
            System.out.println(word);
        }


    }
}
