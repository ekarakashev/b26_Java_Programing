package day27_nested_Loops;

public class PrimeInRange {

    public static void main(String[] args) {
        /*
        [IQ] Prime in range
         Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
         Ex:
        Input:
           50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */
            int range = 50;
        for (int i =1; i <=range; i++){ // the purpose of this loop is to check all the numbers from 2 to the value the range variable
            int count = 0; // putting the counter inside the outer loop will reset it bac to 0 for the next number
            for (int j = 2; j<i; j++){
                if (i%j ==0){
                    count++;
                }

            }//inner loop
            if (count == 0){
                System.out.print(i + ", ");
            }
        }//outer loop
  /*
                    i = 5
                    j = 2; j < 5; j++
                        i % j
                        5 % 2
                        5 % 3
                        5 % 4
                        =====
                        i = 6
                        j = 2; j < 6; j++
                        i % j
                        6 % 2 --> count++;
                        6 % 3 --> count++;
                        6 % 4
                        6 & 5
                 */






    }

}
