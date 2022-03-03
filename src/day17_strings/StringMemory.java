package day17_strings;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //String literal, in string pool
        String second = new String("java"); //String object not in String pool, but directly in the  heap

        System.out.println(first == second);

        // == with String types gives you false. The == doesnt compare characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third); //this one is true

        String fourth = "Java"; // at this line how many objects are in the string pool:  -> 2 (java & Java)

        System.out.println(first == fourth);

        // at this point how many total object is there. 3 -> 2 in the String pool and 1 separate object directly in the heap
    }

}
