package day26_nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){            // 1 x 1 = (1*1) 1 x 2 = (1*2)


            for (int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
