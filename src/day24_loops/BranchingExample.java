package day24_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i =0; i<=10; i++){
            System.out.print(i + " ");
            break;
        }//end for

        System.out.println();
        for (int i =0; i<=10; i++) {
            System.out.print(i + " ");
            break;
        }//end for

        System.out.println();
        for (int i =0; i<=10; i++){
            System.out.print(i + " ");
            if (i==5){
                break;
            }//end if
        }//end for

        System.out.println();
        for (int i =0; i<=10; i++) {
            if (i == 5) {  //this if == skips 5
                continue;
            }//end if
            System.out.print(i + " ");
        }//end for

        System.out.println();
        for (int i =1; i<=50; i++){
            if (i%2==1){  //skips odd numbers (1,3,5,7,9....)
                continue;
            }//end if
            System.out.print(i + " ");
        }//end if
    }
}
