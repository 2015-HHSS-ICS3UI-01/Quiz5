
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generates scanner
        Scanner in = new Scanner(System.in);
        // a continious infinite while loop
        while (true) {
            // asks for words to translate and stores it as "word"
            System.out.println("Enter an American word to translate into Canadian");
            String word = in.nextLine();

            // If user input quit, program breaks! (stops)
            if (word.equalsIgnoreCase("quit!")) {
                System.out.println("You quit the program!");
                break;
            }
            // obtains length of word
            int numChars = word.length();

            // If word is 5 or more letter long and ends with OR
            if (numChars >= 5 && numChars < 64 && word.endsWith("or")) {
                // removes the or out of word
                int withoutOR = numChars - 2;
                //substring the whole word leaving OR behind 
                String first = word.substring(0, withoutOR);
                // and prints it with an ending of "our"
                String american = first + "our";
                System.out.println(word + " translates to " + american + " in Canadian");
                
            } // otherwise print out whatever the user inputs back to him
            else {
                System.out.println(word + " translates to " + word + " in Canadian");
            }
        }
    }
}
