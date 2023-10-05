package assign2;

import java.util.Random;
import java.util.Scanner;

//Write a program Q1 that prompts the user to enter the name of 3 cities, each on separate lines and then prints them out
//in alphabetical order.
public class Q1 {
    public static void main(String[]args) {
        //Decloration
        int pos;
        String city1;
        String city2;
        String city3;
        //input
        System.out.println("Please enter 3 different cities on three different lines");
        Scanner inputLine = new Scanner(System.in);
        city1 = inputLine.nextLine();
        city2 = inputLine.nextLine();
        city3 = inputLine.nextLine();
        //Proccessing
        //Put each city in an array, so we can compaRe the first index of each city
        char city1array[] = city1.toCharArray();
        char city2array[] = city2.toCharArray();
        char city3array[] = city3.toCharArray();
        //Find each citys first letter
        char firstLetter1 = city1array[0];
        char firstLetter2 = city2array[0];
        char firstLetter3 = city3array[0];
        //Determine the alphabetical value
        if( firstLetter1 < firstLetter2 ){
            if( firstLetter1 < firstLetter3 ){
                if(firstLetter2 < firstLetter3){
                    System.out.print( firstLetter1 );  System.out.print( firstLetter2 );  System.out.print( firstLetter3 );
                }else{
                    System.out.print(firstLetter1); System.out.print( firstLetter3 ); System.out.print( firstLetter2 );
                }
            }
            else {
                if(firstLetter2 < firstLetter3){
                    System.out.print( firstLetter2 );  System.out.print( firstLetter3 );  System.out.print( firstLetter1 );
                }else{
                    System.out.print( firstLetter3 );  System.out.print( firstLetter2 );  System.out.print( firstLetter1 );
                }
            }

        }
        else {
            // it means num2 is larger than num1

            if( firstLetter2 < firstLetter3 ){
                if(firstLetter1 < firstLetter3){
                    System.out.print( firstLetter2 );  System.out.print( firstLetter1 );  System.out.print( firstLetter3 );
                }else{
                    System.out.print( firstLetter2 );  System.out.print( firstLetter3 );  System.out.print( firstLetter1 );
                }
            }
            else {
                if(firstLetter3 < firstLetter1){
                    System.out.print( firstLetter3 );  System.out.print( firstLetter1 );  System.out.print( firstLetter2 );
                }else{
                    System.out.print( firstLetter1 );  System.out.print( firstLetter3 );  System.out.print( firstLetter2 );
                }
            }

        }
    }
}
