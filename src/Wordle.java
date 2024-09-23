import java.util.*;
import java.io.*;
public class Wordle
{
    public static void main(String[] args) throws IOException
    {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new FileReader("src/words5.txt"));

        String line = bf.readLine();
        while (line != null)
        {
            if(line.length() == 5)
            {
                listOfStrings.add(line);
            }
            line = bf.readLine();
        }
        bf.close();

        /* TODO:
        Improve Wordle to do the following:
        Let the user guess up to 6 times
        User color coding to give the user feedback
        If the user guesses correctly, finish the loop
        */

        // get a random word from the list of words
        String word = listOfStrings.get((int)(Math.random() * listOfStrings.size()));

        System.out.println("Enter a 5 letter word");

        String input = scanner.nextLine();

        if(input.equals(word))
        {
            System.out.println("Well done You guessed the word!");
        }

    }
}