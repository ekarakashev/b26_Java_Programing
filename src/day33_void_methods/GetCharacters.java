package day33_void_methods;

public class GetCharacters {
/*

        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9

     */
    public static void fromAtoZ(){
    for (char i = 'A'; i<='Z'; i++){
        System.out.print(i+" ");
    }
    System.out.println();
}

    public static void fromAtoZlower(){
        for (char i = 'a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void from1to9(){
        for (int i = 1; i<=9; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fromZoA(){
        for (char i = 'Z'; i<='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }



}
