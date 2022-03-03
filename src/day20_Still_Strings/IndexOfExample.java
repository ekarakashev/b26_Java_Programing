package day20_Still_Strings;

public class IndexOfExample {
    public static void main(String[] args) {


        String word = "banana";
        // index       012345

        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex);
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);
        int secondIndex = word.indexOf('a', firstIndex + 1); //starts to look from 2
        System.out.println(secondIndex);
        int thirdIndex = word.indexOf('a', secondIndex + 1);
        System.out.println(thirdIndex);


    }
}
