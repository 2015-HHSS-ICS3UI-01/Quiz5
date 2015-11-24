
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Quiz5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merica = "hi";
        //The computer asks the user to input an American word.
        System.out.println("Enter an American word to be translated:");
        //If the user says quit, the program will stop.
        while (!merica.equalsIgnoreCase("quit")) {
            //The user inputs an American word or the word quit.
            merica = input.nextLine();
            //This sequence is used to aid the program to find the last "or" in the word.
            int length = merica.length();
            length = length - 2;
            //The program finds the "or" in the word.
            int r = merica.indexOf("or", length);

            //If the length of the word is greater than 4 and has an or at the end,
            //then these sequence of commands engage.
            if (merica.length() > 4 && r != -1) {
                //The program takes the part of the word that doesn't have the "or" and
                //makes it it's own section
                String constant = merica.substring(0, r);
                //The part with the "or" is seperated to a different section.
                String replace = merica.substring(r);
                //The section with the "or" is then replaced with "our".
                replace = replace.replace("or", "our");
                //The computer then spits out the new word.
                System.out.println(constant + replace);
                //If the word was shorter than 4 or didn't have an "or" in it, then the
                //word is returned to the user unchanged.
            } else {
                System.out.println(merica);
            }
        }
        //Once the user quits the program, the program says goodbye.
        System.out.println("Goodbye.");
    }
}
