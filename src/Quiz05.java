
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Quiz05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for user input
        Scanner input = new Scanner(System.in);
        
        //tell user to enter a word
        System.out.println("Enter an American word to translate into Canadian");
        String word = input.nextLine();
        
        //create variable to tell how long the word is
        int wordLength = word.length();
        
        //translate word to American
        if(wordLength > 4){
            if(word.endsWith("or")){
                word = word.replace("or", "our");
            }
        }
        //tell user what word in Canadian is
        System.out.println("Your word in Canadian is " + word);
    }
}
