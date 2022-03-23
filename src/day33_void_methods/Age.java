package day33_void_methods;

public class Age {

    public static void age(int birthYear){
        int currentYear = 2022;
        int age = currentYear - birthYear;
        System.out.println("I am " + age + " years old");
    }

    public static void main(String[] args) {
        age(1985);
    }
}
