
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //ask for a word
        System.out.println("Enter an American word to translate into Canadian(type quit! to quit the program): ");
        String word = input.nextLine();
        //changed word is called canadian
        String canadian = word;

        //make program loop
        while (word.length() > 0) {

            //end if quit! is entered
            String end = "quit!";
            if (word.equalsIgnoreCase(end)) {
                break;
            }

            //translate from american to canadian if the word ends with "or" and has 4 or more letters
            if (word.endsWith("or") && word.length() >= 4) {
                //replace "r" with "ur"
                canadian = word.replace("r", "ur");
                System.out.println(word + " translates to " + canadian + " in Canadian");
            }
            //if the word doesnt end with "or" or isnt 4 letters or longer
            else {
                //tell them that their word doesnt change
                System.out.println(word);
                System.out.println("Your word is the same in Canadian");
            }

            //ask for a word again
            System.out.println("Enter an American word to translate into Canadian(type quit! to quit the program): ");
            word = input.nextLine();

            //loop until the program is ended
        }
    }
}
