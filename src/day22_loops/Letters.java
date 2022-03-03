package day22_loops;

public class Letters {
    public static void main(String[] args) {
        //a-z lowercase


        char lowerCaseUp = 'a';

        while (lowerCaseUp <= 'z'){
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp ++;
            // also works with lowerCaseUp +=1;
        }

        //Z-A Uppercase

        char upperCase = 'Z';  //int i = 90 (ASCII value of Z)
        while (upperCase >= 'A'){ //i>= 65
            System.out.println(upperCase + " ");
            upperCase--;
        }


    }
}