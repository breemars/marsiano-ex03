/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution03 {
    /*
    Prints out a quote with quotation marks
    - ask user for a quote
    - input line as string
    - ask user who said the quote
    - input name as string
    - output the quote and the person who said it
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //IN - Input user's quote
        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        //IN - Input who said the quote
        System.out.print("Who said it? ");
        String person = input.nextLine();

        //OUT - Prints out the quote and who said it
        System.out.println(person + " says, \"" + quote + "\"");

    }

}
