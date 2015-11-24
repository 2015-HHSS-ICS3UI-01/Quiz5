
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Enter the scanner, and question and string
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a word");
    String k = input.nextLine();
    
    //less then four letter thingy + code now
    int klength = k.length();{
        if (klength > 4){
            if (k.endsWith("or")){
       k = k.replace("or", "our");
       }
       
          }
}  
    //output the new word
    System.out.println("your canadian word is " + k);
  }
}