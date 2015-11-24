
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make scanner
        Scanner input = new Scanner(System.in);
        
        //Make String
        System.out.println("Please enter the word your would like to convert from American to Canadian");
        String word = input.nextLine();
        
        
        //If word is less then 4
        int numChar = word.length();
        
        //If word > 64 it will break < 4
        while(true){
        if(numChar < 4 || numChar > 64){
           break;
           
        //if they print out quit
        }else if(word.equals("quit!")){
           break;
           
        //Convert from american to canadian
        }else if(word.endsWith("or")){
        String newWord = word.replace("or", "our");
            System.out.println(word + " Translates to " + newWord + " in Canadian");
           break;
        }
            
        
        } 
        
       
        
      
        
        
        
        
            
            
        
        
        
    }
            
}
