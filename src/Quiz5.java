
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("Enter an American word to translate into Canadian");
       String word = in.nextLine();
       
       int numChars = word.length();
       
       int real = numChars - 2;
       
            
       if(numChars > 5 && word.endsWith("or") ){
           int oFound = word.indexOf("or");
           String first = word.substring(0, oFound);
           String american = first + "our";
            System.out.println( word + " translates to "  +american+ " in Canadian");
           
          
       }if(word.equalsIgnoreCase("quit!")){
            System.out.println("You quit the program!");
            break;
       }if(numChars < 5){
            System.out.println(word+" translates to " + word + " in Canadian");
       }
                   
         
           }
       }
    }

