package day19_strings;

public class SubStringMethod {
    public static void main(String[] args) {


        String str = "Sunday";
        //            012345
        System.out.println(str.substring(1)); //it will print from 1 to the rest => unday
        System.out.println(str.substring(3)); // it will print from 3 to the rest => day
        System.out.println("Satur" + str.substring(3)); // Satur+day

        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(0, 5));




    }
}
