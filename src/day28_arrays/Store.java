package day28_arrays;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};
       boolean inStock = false;
        //Do we have jackets in stock
        for (int i = 0; i< items.length; i++) {
            if (items[i].equalsIgnoreCase("jackets")) {
                System.out.println("We have jackets");
                inStock = true;
                break;
            }
        }


        //System.out.println(inStock ? "Jackets in stock": "Jackets out of stock ");



}

        //use Scanner to ask which item are we looking for. Check if we have it




   }

