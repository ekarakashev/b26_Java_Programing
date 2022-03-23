package day23_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "sdhidjdhisidfjhidfsdfhidfshi";
        int count = 0;

        for (int index = 0; index < str.length()-1; index++){  //if we looking for 3 leeter word we will do index < str.length()-2
            if (str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
               count++;
            }//end if
        }//end for
        System.out.println(count);
    }//end main
}//end class
