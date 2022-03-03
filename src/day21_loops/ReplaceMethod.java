package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "Java is a language";
        s = s.replace('a' , 'e');  //we need to assinhg  new value to the s
        System.out.println(s);

        String day = "Today is Monday. we will Monday. It is Monday";
        day = day.replace("Monday", "Friday");
        System.out.println(day);

        String str = "Today is Monday. we will Monday. It is Monday";
        System.out.println(str.replaceFirst("Monday", "Friday"));

        String target = "Today is Monday. we will Monday. It is Monday";
        int firstIndex = target.indexOf(".");
        int secondIndex = target.lastIndexOf(".");
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("Monday" , "Friday");

        System.out.println(target.substring(0, firstIndex) + middleStr + target.substring(secondIndex));
    }
}
