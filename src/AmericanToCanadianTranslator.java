
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class AmericanToCanadianTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            //Program asks user for a word
            System.out.println("[Please enter a word");
            String word = input.nextLine();
            
            //To end the program
            if(word.equalsIgnoreCase("quit")) {
                System.out.println("Program ended");
                break;
            }
            //To calculate the length of the word
            int numChars = word.length();
        
            //Program responds with only a word that is larger than 5, and ends with "or"
        if (numChars >=5 && numChars < 50 && word.endsWith("or")){
            int Am = numChars -2;
            String first = word.substring(0, Am);
            String american = first + "our";
            //Prints out the translated word
            System.out.println(word + " translates to " + american + " in Canadian");
            
        }
        //If it does not exceed the number of 5 letters, and is already translated, the program will display it back to the user
        else{ System.out.println(word + " translates to " + word + " in Canadian");
        }
        }
        
    }
}
