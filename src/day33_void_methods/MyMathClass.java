package day33_void_methods;

public class MyMathClass {
    public static void add(double numOne, double numTwo){
        System.out.println(numOne + " + " + numTwo + " = " + (numOne+numTwo));
    }
    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + " = " + (numOne-numTwo));
    }
    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + " x " + numTwo + " = " + (numOne*numTwo));
    }
    public static void divide(double numOne, double numTwo){
        if (numTwo !=0){
        System.out.println(numOne + " / " + numTwo + " = " + (numOne/numTwo));
        }else{
            System.out.println("Can not divide by 0");
        }
    }

    public static void main(String[] args) {
        add(4.3, 5.3);
        add(5, 3);

        subtract(8.4, 4.5);
        multiply(4.1, 5.6);
        divide(8.5, 0.5);



    }
}
