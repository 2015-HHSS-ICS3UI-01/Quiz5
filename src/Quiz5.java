
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Quiz5 {

    
    public static void main(String[] args) {

        //create scanner
        Scanner input = new Scanner(System.in);
        //loop until 'quit!'
        while (true) {
            //ask user to enter word
            System.out.println("Enter American word to translate to Canadian: ");
            //store input in amerWord
            String amerWord = input.nextLine();
            //end program if user types "quit!"
            if (amerWord.equals("quit!")) {
                System.exit(0);
            }
            //get word length, store in variable
            int amerLength = amerWord.length();
            //take off last 2 letters and add "our", then store in variable
            int amerLengthCut = amerLength - 2;
            String amerCut = amerWord.substring(0, amerLengthCut);
            String canWord = amerCut + ("our");
            //check if word is longer than four letters, if not, output american word
            if (amerLength < 4) {
                System.out.println(amerWord);
            //check if word ends with "or"    
            } else if (amerWord.endsWith("or")){

            //if word with last 2 letters cut off ends with a vowel, output american words
             if (amerCut.endsWith("a") || amerCut.endsWith("e") || amerCut.endsWith("i") || amerCut.endsWith("o") || amerCut.endsWith("u")) {
                System.out.println(amerWord);
            //output canadian word if third last letter is a consonant
            } else {
                System.out.println(canWord);
            }
        //if american word does not end with or, output american word
        }else{
                System.out.println(amerWord);
}
    
            
        }
    }
}
