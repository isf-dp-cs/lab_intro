public class Strings {
    public static void main(String[] args){
        /*
        ANSI escape codes are special codes that can
         change the formatting when you print to the console
         You can find many more options to play around with
         at this url: gist.github.com/dominikwilkowski/60eed2ea722183769d586c76f22098dd
         */

        // ANSI codes
        String yellowBackground = "\u001b[43;1m";
        String greenBackground = "\u001b[42;1m";
        String reset = "\u001b[0m";

        // color can be added when printing like this
        System.out.println(yellowBackground + "the sun is yellow" + reset);
        System.out.println(greenBackground + "the grass is green" + reset);

        // you can print all in one line using System.out.print()
        System.out.print(yellowBackground + "w");
        System.out.print(greenBackground + "o");
        System.out.print(yellowBackground + "w");
        System.out.print(reset + " ");
        System.out.print(greenBackground + "f");
        System.out.print(yellowBackground + "a");
        System.out.print(greenBackground + "n");
        System.out.print(yellowBackground + "c");
        System.out.print(greenBackground + "y");
        System.out.print(yellowBackground + "!" + reset);
        System.out.print("\n"); // this \n will start a new line

        /* TODO:
        add in at least two more ANSI codes above
        then practice printing to the terminal using the codes you added
        */


        /* TODO:
        Edit the loop below so that it will give an example
        of every possible background color
        The formula is "\u001b[48;5;" + i + "m"
        where i is any number 0 - 255
        */

        for (int i = 0; i <= 10; i++) {
            String newFormat = "\u001b[48;5;" + 0 + "m";
        }

    }
}
