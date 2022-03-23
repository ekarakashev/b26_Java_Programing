package Self_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGradeBook {
    /*
    Declare three arrays:
    1. String array which will hold names for the students (give values)
    2. Int array which has the score of the student got in the quiz (give values)
    3. Char array which will have some letter grade based on the score (empty)
    4. Output the gradebook at the end with all the information
    Grade scale:
    Above 85: A
    Above 75: B
    Above 65: C
    Other: D
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many students are there ");
        int num = input.nextInt();
        input.nextLine();
        String [] names = new String[num];
        int [] score = new int[num];
        char [] letter = new char[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Enter student names: ");
            names[i] = input.nextLine();

            System.out.println("Enter student score: ");
            score[i] = input.nextInt();
            input.nextLine();

            if(score[i] > 85){
                letter[i] = 'A';
            }else if(score[i] >= 75){
                letter[i] = 'B';
            }else if(score[i] >= 65){
                letter[i] = 'C';
            }else{
                letter[i] = 'D';
            }
        }
        for (int j = 0; j < num; j++) {
            System.out.println("" + names[j] + " | " + score[j] + " | " + letter[j]);
            System.out.println();
        }




    }//main
}//class








