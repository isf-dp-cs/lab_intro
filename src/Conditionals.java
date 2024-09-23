import java.util.*;
import java.io.*;
public class Conditionals {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.print("Are you having a good class so far? (y/n)");

        String input = scanner.nextLine(); // get the user input
        if (input.equals("y")){
            System.out.println("Good, I'm glad you're having a nice time!");
        }
        else if (input.equals("n")){
            System.out.println("I'm sorry to hear it :(");
        }
        else{
            System.out.println("Sorry, I didn't catch that.");

        }

        /* TODO:
        Create a new loop below that it will:
        ask the user for their name
        ask the user for their favorite color
        ask the user for their second favorite color
        print out the user's name, alternating between the two colors for each letter
        */



    }



}
