package Self_Practice;

public class Question {
    public static void main(String[] args) {
        boolean male = false;
        int age = 30;
        if(male)
            if (age<20)
                System.out.println("boy");
        else
                System.out.println("man");
        else
            if(age < 20)
                System.out.println("girl");
            else
                System.out.println("woman");



    }
}
