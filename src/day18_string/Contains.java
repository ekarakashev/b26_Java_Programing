package day18_string;

public class Contains {
    public static void main(String[] args) {
        String day = "Today it is above 70";
        System.out.println(day.contains("it is")); //TRUE
        System.out.println(day.contains("itis")); //FALSE it doesn't have the space between |it| and |is|
        System.out.println(day.contains("7"));  //TRUE string contains 7
        System.out.println(day.contains("today")); // FALSE bcs |Today| is with uppercase
        System.out.println(day.contains("T") && day.contains("i") && day.contains("7")); // TRUE -> it checks individually for each character
        System.out.println(day.contains("T") && day.contains("i") && day.contains("7 ")); //FALSE -> there is space after |7 |

    }

}
