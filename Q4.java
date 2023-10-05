package assign2;

import java.util.Scanner;

//Write a program Q4 that prompts for a lower number and a higher number and prints out all odd numbers between the
//low and the high number except if they are divisible by 5.
public class Q4 {
    public static void main(String []args){
        Scanner inputline = new Scanner(System.in);

        System.out.print("Enter one input Line: ");
        int input1 = inputline.nextInt();

        System.out.print("Enter another input Line: ");
        int input2 = inputline.nextInt();


        for(int i = 0; i < input2; i++){
            System.out.println(input1);
            input1++;
        }
    }
}
