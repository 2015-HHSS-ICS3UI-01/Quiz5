
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);

       //while true
        while(true){

        //ask user to enter word to traslate 
        System.out.println("Please enter a word in American  to traslate into Canadian");
       //allow user to enter word 
        String word = input.nextLine();
        //check the lenght of the word 
        int length = word.length();
        //if the word is quit! then stop the program 
        if(word.equals("quit!")){
           break; 
        }
        //if the lengh of the word 4 or more and it ends in or
        if (length > 4 && word.endsWith("or")) {
            //remove last two letters of word  and store the rest in a variable 
            String lastTwo =word.substring(0, word.length() - 2);
            //take the new word and add "our" to the end of it and tell the user 
            System.out.println("Your word in candian is " + lastTwo + "our");
            //else if word does not end in or and is les than 4 letters than do not translate
           }else{
            //let user know their word (not tranlsated)
            System.out.println("Your word in canadian is " +word);
        }

    }
}
}