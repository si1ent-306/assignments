package assign2;

import java.util.Scanner;

//Write a program that will ask for a line of text and report the number of words that are of length 2, 3, 4, 5, or 6 and
//words that are greater than six characters in length (separate report lines for each of the word lengths).
public class Q3 {
    public static void main(String []args){
        int counter = 0;
        Scanner inputline = new Scanner(System.in);

        System.out.print("Enter one input Line: ");
        String input = inputline.nextLine();

        String words[] = input.split(" ");
        for(int i = 0; i <= input.length(); i++){

        }
    }
}
