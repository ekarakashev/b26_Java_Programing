package day17_strings;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        //how to compare String values --> use.equals()
        System.out.println(name.equals("james"));  //true james = james

        System.out.println("cat".equals("dog")); //"cats" is not equal to "dogs"
        System.out.println(name.equals("James")); //false james != James (uppercase)

        System.out.println(name.equalsIgnoreCase("James")); // TRUE. it ignores the case sensitivity

        String a = new String("hello");
        String b = new String("hello");
        String x = new String("HELLO");
        System.out.println(a.equals(b));  // TRUE -> it checks if characters are same. This method compares characters
        System.out.println(x.equals(b)); //this line is FALSE - characters of x are upper case and b lowercase
        System.out.println(name.length()); /*gives an int(INTEGER) of how many characters are in the String name
        |james| have 5 characters so line 21 will give result =>5
*/
        String last="today was fun";
        String c=new String(last);
        System.out.println(last == c);  //this one is FALSE bcs both strings are in different locations |last| is in the pool |c| is in the heap
        System.out.println(c.equals("today was fun")); //this one is TRUE
        System.out.println(last.length()); /* this will give result 13 for String last. It also includes the space characters  today was fun  => 13
                           1234567891111
                                    0123
        */
    }
}
