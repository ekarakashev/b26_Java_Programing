package day33_void_methods;

public class LastCharacter2d {
    public static void main(String[] args) {

        String[][] words = {
                {"james", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        for(String[]eachArray:words){

            for (String eachWords:eachArray){
                System.out.println(eachWords.charAt(eachWords.length()-1));
            }

            System.out.println("*************");

        }






    }
}
