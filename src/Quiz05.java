
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Quiz05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner
        Scanner in = new Scanner(System.in);


        // Continusly asks for what word the user wants translated 
        while (true) {

            System.out.println("Enter a American word to translate into Canadian: ");
            String word = in.nextLine();

            // If user enters quit then the program stops
             if(word.startsWith("quit")) {
                break; 
            } 
            // Variable used to find the length of the word 
            int numchar = word.length();

            // If word is less than 5 letters long then word remains the same
            if (numchar < 5) {
                System.out.println(word + " translates to " + word + " in Canadian");
            } else 
                
               // If word ends with "or" and exceeds 4 letters than word translates 
            if (word.endsWith("or") && numchar > 4) {
                String American = word.replace("or", "our");
                System.out.println(word + " translates to " + American + " in Canadian");

                // If it doesnt meet requirments as above than translates to same word
            } else {
                System.out.println(word + " translates to " + word + " in Canadian");
            } 
            
            
             
            
           
       
        }


        
    }
}
