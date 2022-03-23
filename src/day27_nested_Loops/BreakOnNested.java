package day27_nested_Loops;

public class BreakOnNested {
    public static void main(String[] args) {



        for (int i = 0; i<5; i++){
            System.out.println("i-" + i);
            if (i==3){
                break;
            }
            for(int j=0; j<2; j++){
                System.out.println("j-" + j);
                //break; if break is here the inner loop will run only one time. outer loop will run 5 times, then code will stop
            }
            System.out.println();
            // break; if the break is here the 1st iteration of the outer loop will run, then the outer loop stops
        }







    }
}
