
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //make scanner
        Scanner in = new Scanner(System.in);       
        //create string for the word
        String word = "";
        //Create while loop to ask which words to translate
        while (!word.equals("quit!")) {
            System.out.println("Enter an American word to translate into canadian");
            word = in.nextLine();
         
        //find length of word
        int length = word.length();
       //check if there is a vowel before "or"  
       String noend = word.replace("or", "");
               
            if (word.endsWith("or") && (length > 4) && 
               (!noend.endsWith("a")||
               !noend.endsWith("e")||
               !noend.endsWith("i")||
               !noend.endsWith("o")||
               !noend.endsWith("u")||
               !noend.endsWith("y"))){
                
              //replave or with our if necessary
              String canadian = word.replace("or", "our");
              
              //output translated word
                System.out.println(word + " translates to " + canadian + " in canadian");
            }else{
                System.out.println(word + " translates to " + word + " in canadian");
            }
        }
    }
}
