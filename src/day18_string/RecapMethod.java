package day18_string;

public class RecapMethod {

    public static void main(String[] args) {
        String s = "pen";
        String s2 = new String("pen");
        System.out.println("Compare with == " + (s==s2));  /* Compare with == FALSE s and s2 have same characters but in different location
        */
        System.out.println("Compare with .equals() " + s.equals(s2)); /*Compare with .equals() --> TRUE
        this compares characters
        */
        System.out.println("compare with .equals() " + s.equals("Pen"));  //Compare with .equals() --> FALSE
        System.out.println("compare with .equalsIgnoreCase() " + s.equalsIgnoreCase("Pen")); //Compare with .equalsIgnoreCase() -> TRUE
         boolean isSame = s.equalsIgnoreCase("PEN");

         if(s.equals("pen")){
         }
         int len = s.length();  //this will give the length of String |s| =3
        System.out.println("long word");

        if(s.length() > 4){    //if 3>4 -> will print "long word"
            System.out.println("long word");
        }else{   //else will print "short word"
            System.out.println("short word");
        }


    } //end main method
} //end class
