package day28_arrays;


import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {


        //normal variables
        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        //declare array with values
        String[] cities2 = {cityOne, cityTwo, cityThree,  cityFour, cityFive};
        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"};
         // System.out.println(cities); -- This doesnt print the array
       //How to access each element in the array
        System.out.println(cities[0]); //this will print 1st city in the array - Chicago
        System.out.println(cities[1]); //ths will print 2nd city in the array - New York
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        System.out.println("reverse order of the cities " + cities[4] + ", " +  cities[3] + ", " + cities[2]);
// print array at one time
        System.out.println(Arrays.toString(cities)); //this method from Array class lets you print the array fully. Prints -> [Chicago, New York, Houston, Denver, Pittsburgh]

        //numbers of element
        System.out.println(cities.length);


    }

}
