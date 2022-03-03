package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int colorPicked = 0;
        String uniqueColor = "";

        while(colorPicked <3){
            System.out.println("Pick a color");
            String color = input.nextLine();

           if (uniqueColor.contains(color)){
               System.out.println("you already picked that colo r");
           }else{
               uniqueColor += color + " ";
               colorPicked++;
           }//end if /else

        }//end while
        System.out.println(uniqueColor);



    }
}
