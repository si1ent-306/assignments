package assign2;

import java.util.Scanner;

//Write a program Q2 that will ask for the user for 2 input lines and print out all words that occur 1 or more times on
//both lines (case sensitive).
public class Q2 {
    public static <allWords> void main(String[] args) {
        //iNPUT
        int counter = 0;
        Scanner inputline = new Scanner(System.in);

        System.out.print("Enter one input Line: ");
        String input1 = inputline.nextLine();

        System.out.print("Enter another input Line: ");
        String input2 = inputline.nextLine();
        int count;
        String longInput = input1 + input2;
        //Converts the string into lowercase
        longInput = longInput.toLowerCase();


        //Split the string into words using built-in function
        String allWords[] = longInput.split(" ");


    }
}