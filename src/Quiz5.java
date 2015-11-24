
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Create loop
        while (true) {

            //Get user input
            System.out.println("Enter an american word to transate into Canadian: ");
            String american = input.nextLine();
            //Checks if american is equal to quit, if not then it runs the program.
            if (!american.equals("quit!")) {
                //Count the length of the word
                int length = american.length();
                //If the length is greater than 4 and ends with or then calculate translation
                if (length > 4 && american.endsWith("or")) {
                    //Cut or off of word
                    String canadian = american.substring(0, american.length() - 2);
                    //Give user canadian translation
                    System.out.println(american + " translates to " + canadian + "our in Canadian");
                    //else if it cannot be translated return them the original word
                } else {
                    System.out.println(american + " translates to " + american + " in Canadian");
                }
                //If american does equal quit, end the program
            } else if (american.equals("quit!")) {
                break;
            }
        }
    }
}