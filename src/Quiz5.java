
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Put scanner for inputs
        Scanner input = new Scanner(System.in);

        while (true) {

            //Ask user for word to translate
            System.out.println("Enter an American word to translate into Canadian");
            String word = input.nextLine();

            //Determine how many letters are in the word
            int wordChar = word.length();

            //Quit once user enters 'quit!'
            if (word.equalsIgnoreCase("quit!")) {
                break;
            }

            //Translate the word into Canadian
            //if word is more than 4 letters long
            if (wordChar > 4) {
                String translated = word.replaceFirst("or", "our");
                System.out.println(word + " translates to " + translated + " in Canadian");

                //if the word is less than 4 letters long
            } else {
                System.out.println(word + " translates to " + word + " in Canadian");
            }
        }

    }
}
