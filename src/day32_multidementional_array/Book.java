package day32_multidementional_array;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {


    /*
    Flow:
    How many chapters is there
    make a book with that many chapters
    write the chapters ont at a time
    break up each chapter by sentences
     */


        Scanner input = new Scanner(System.in);
        System.out.println("How many chapter is the book");
        String[][] book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter " + (i + 1)); //adding +1 bcs its starts from 0 so it starts from chapter 1
            String chapter = input.nextLine();
            String[] sentences = chapter.split("\\."); //why is \\. ....i dont know
            book[i] = sentences;
        }

        System.out.println(Arrays.deepToString(book));


    }



}
