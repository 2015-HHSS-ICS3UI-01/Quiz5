
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner to get input
        Scanner input = new Scanner(System.in);

        //Start of loop
        while (true) {

            //ask user for word
            System.out.println("Please enter a word(Type quit! to end the program):");

            //String word is on the next line
            String word = input.nextLine();

            //String amrcn is equal to word
            String amrcn = word;

            //if the word is quit! the program stops
            if (amrcn.equals("quit!")) {

                //stops program is quit! is entered
                break;
            }

            //if the word is greater than 4 letter and ends with "or" then it is changed
            if (word.length() > 4 & word.endsWith("or")) {

                //looks for "or" at the end of a word
                int orFound = amrcn.indexOf("or");

                //uses whole word until the "or" and stores it in the string
                String first = amrcn.substring(0, orFound);

                //Replaces last which is or with our
                amrcn = first + "our";

                //Outputs word translated from American to Canadian
                System.out.println("The word translated to Canadian is " + amrcn);
            }
            //stop program
            break;
        }
    }
}
