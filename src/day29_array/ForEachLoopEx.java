package day29_array;

public class ForEachLoopEx {
    public static void main(String[] args) {


        int [] numbs = {30, 12, 159, 12};
        for (int i = 0; i<numbs.length; i++){
            System.out.println("Traditional " + numbs[i]);
        }

        for (int element :numbs){
            System.out.println("for each: " + element );
        }

        String [] classes = {"java", "soft skills", "selenium", "database"};
        //traditional
        for (int i = 0; i<classes.length; i++){
            System.out.println(classes[i]);
        }
        System.out.println("--------------");
        //for each

        for (String word: classes){
            System.out.println(word);
        }
        //double example
        System.out.println("-----");
        double[] price = {10.4, 40.2, 410.5};
        //for each

        for(double each :price){
            System.out.println("$" + each);
        }

    }
}
