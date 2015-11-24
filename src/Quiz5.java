
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will translate American to Canadian
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        // create a variable to indicate when the translation should stop
        boolean translate = true;
        
        // continue translating when the user what's to continue
        while(translate){
            
            // ask the user to enter a american word and store this as a variable
            System.out.println("Enter an American word to translate into Canadian (type quit! to terminate): ");
            String americanWord = input.nextLine();
            
            // if the word entered is "quit!" then the user wants to stop
            if(americanWord.equals("quit!")){
                translate = false;
                
            // if the user enters a proper word continue translation
            } else{
                // convert the american word to lower case
                americanWord = americanWord.toLowerCase();
                
                // the canadian words starts off as equal to the american word
                String canadianWord = americanWord;
                
                // if the word is longer then 4 letters and ends with or then it may need changed
                if(americanWord.length() > 4 && americanWord.endsWith("or")) {
                    
                    // store the length of the word and subtract three from it to determine the letter before or
                    int vowelAt = americanWord.length();
                    vowelAt = vowelAt - 3;
                    
                    // if the american word does not have a vowel before "or" then convet or to "our"
                    if(americanWord.charAt(vowelAt) != 'a' 
                        && americanWord.charAt(vowelAt) != 'e'
                        && americanWord.charAt(vowelAt) != 'i'
                        && americanWord.charAt(vowelAt) != 'o'
                        && americanWord.charAt(vowelAt) != 'u'
                        && americanWord.charAt(vowelAt) != 'y'){
                            
                            // new canadian word is now "our" instead of "or"
                            canadianWord = americanWord.replace("or", "our" );
                    }
                }
                // output the translated word
                System.out.println(americanWord + " translates to " + canadianWord + " in Canadian");
            }
        }
        // close input scanner
        input.close();
    }
}
