
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inport new scanner
        Scanner in = new Scanner(System.in);
        while (true) {
            //ask user for a word
            System.out.println("Please enter the word you wish to translate:");

            //next input is the word being translated
            String american = in.nextLine();

            if (american.equals("quit!")) { //if the word is quit!
                break; //end the program
            } else { //if the word is not quit!
                int wordLength = american.length(); //find the length of the word
                if (wordLength > 3) { //if the word is longer than 3 letters
                    int findOr = wordLength - 2; //the value of the word - 2 letters
                    if (american.endsWith("or")) { //if the word ends with or
                        String first = american.substring(0, findOr); //the section of the word until the last or
                        System.out.println("The word in Canadian is: " + first + "our"); //output the word in Canadian
                        break; //end the program
                    }
                }
            }
        }
    }
}
