package day29_array;

public class Store {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 299.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

//print the catalog

        for (int i = 0; i< items.length; i++){

            System.out.println("Item Id: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }

        System.out.println("********");

        //task: find the index of gloves
        int indexOfGloves = -1; //we set -1 as the default, bcs 0 is valid index. And if gloves are not found in the array, it will give us -1

        for(int j = 0; j< items.length; j++){
            if(items[j].equalsIgnoreCase("gloves")) {
                indexOfGloves = j;
                break;
            }

        }
        System.out.println("index of gloves is "  + indexOfGloves);

        //Task: Find and print information of the most expensive item. Name price and ID
        System.out.println("***********");
       double mostExpensive = prices[0]; //we start from initial value
        int indexOfMostExpensive = 0;


        for (int i = 0; i<prices.length; i++){
            if (prices[i] > mostExpensive){ //prices[i] - current element
                mostExpensive = prices[i];
                indexOfMostExpensive = i;

            }

        }

        System.out.println("the most expensive item: ");
        System.out.println("Them: " + items[indexOfMostExpensive]);
        System.out.println("Item ID " + itemIds[indexOfMostExpensive]);
        System.out.println("Price of most expensive is " + prices[indexOfMostExpensive]);

















    }
}
