package Self_Practice;

import java.util.Scanner;

public class JavaVsPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();
        int javaCount =0;
        int pythonCount = 0;

        for (int i = 0; i<sentence.length()-1; i++){
            if(sentence.startsWith("java", i)){
                javaCount++;
            }
        }
        for(int j = 0; j<sentence.length()-1; j++){
            if(sentence.startsWith("python", j)){
                pythonCount++;
            }
        }

        if(javaCount == pythonCount){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
