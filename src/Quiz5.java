
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner (System.in);

        while (true){
            
        //tell the user to enter a word ending with "or"
        System.out.println("Enter an American word to translate in Canadian.");
        
        //store the word the user entered in a string
        String word = input.nextLine();
        
        //determine how long the word is
        int length = word.length();

        //if the word has more than 4 cghracters
           if (length >4 && length <=64){
               
        //if the user wishes to quit       
                    if (word.equals("quit!")){
                      System.out.println("Have a nice day, eh?");
                      break;  
        
       //if the word ends with or               
                    }else if (word.endsWith("or")){
            
                        String our = word.replace("or", "our");
                
                        word = our;
                
                        System.out.println(word);
                        
        //if the word does not end with or        
                    }else if (!word.endsWith("or")){
                        System.out.println(word);
                    }
        //if the word is less then or equal to four characters        
            }else if (length <=4){
                System.out.println(word);
 
            } 
        }//close the scanner
        input.close();
    }
}
