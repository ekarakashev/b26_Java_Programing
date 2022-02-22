package Self_Practice;

import java.util.Scanner;

public class RAM {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("Select screen size:");
            String screen=input.next();
            double price=0;
            int storegeSize = 0;

            switch (screen){
                case "13.3":
                    price+=200; //price = price + 200
                    break;
                case "15.0":
                    price+=300;
                    break;
                case "17.3":
                    price+=400;

            } //end switch screen
            System.out.println("Select CPU type:");
            String cPU=input.next();
            switch (cPU){
                case "i3":
                    price+=150; //price = price + 150
                    break;
                case "i5":
                    price+=250;
                    break;
                case "i7":
                    price+=350;
                    break;
            } // end switch CPU
            System.out.println("Select RAM size:");
            int rAM=input.nextInt();
            price+=(rAM/4*50);


            System.out.println("Select storage type:");
            String storageType=input.nextLine();
            switch (storageType){

                case "HDD":
                    System.out.println("Select storage size:");
                    int storageHDD = input.nextInt();
                    price += 50 * storageHDD/500;
                    break;
                case "SSD":
                    System.out.println("Select storage size:");
                    int storageSSD = input.nextInt();
                    price += 100 * storageSSD/500;
                    break;
            } //end switch storageType

            System.out.println("Select screen resolution:");
            String screenResolution = input.nextLine();
            switch(screenResolution){
                case "FULLHD":
                    price+=100;
                    break;
                case "4K":
                    price+=200;
                    break;


            }
            System.out.println("Final price is: $"+price);





    } //end main bracket
} //end class bracket
