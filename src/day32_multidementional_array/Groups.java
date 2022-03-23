package day32_multidementional_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][]; //4 array elements, each have size 2
        // [  [null, null],   [null, null],    [null, null],    [null, null]  ]
        System.out.println(Arrays.deepToString(cydeo));

        String [] grOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = grOne;

        System.out.println(Arrays.deepToString(cydeo));
       // [ [Emre, Yasir, Eda], null, null, null]]

        String [] grTwo = {"Basri", "Demet", "Shina", "Ismayl"};
        cydeo [1] = grTwo;
        System.out.println(Arrays.deepToString(cydeo));
        //[ [Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayl],       null,       null    ]
         //    cydeo[0]              cydeo[1]                     cydeo[2]      cydeo[3]
        System.out.println("Addinf group 3");
        cydeo[2] = new String[]{"Mustafa", "Sandal"};
        System.out.println(Arrays.deepToString(cydeo));
        //[[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayl], [Mustafa, Sandal],     null]
        //    cydeo[0]        |      cydeo[1]                 |   cydeo[2]       |   cydeo[3]
        System.out.println("Adding group 4 same as 3");
        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));
        //[  [Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayl],   [Mustafa, Sandal],     [Mustafa, Sandal]   ]
        //    cydeo[0]          |      cydeo[1]                  |   cydeo[2]         |    cydeo[3]
        System.out.println("************");
        for (String[] innerArray : cydeo){  //loops through the 2ns array, cydeo

            for (String eachWord : innerArray){ //loops through every String element in each 1d inner array
                System.out.println(eachWord);

            }

        }


    }
}
