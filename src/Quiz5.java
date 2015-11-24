
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
        Scanner input = new Scanner (System.in);
        String merica = "hi";
        //The computer asks the user to input an American word.
        System.out.println("Enter an American word to be translated:");
        //If the user says quit, the program will stop.
        while (!merica.equalsIgnoreCase("quit")){
            //The user inputs an American word or the word quit.
        merica = input.nextLine();
        //The program finds the "or" in the word.
        int r = merica.indexOf("or");
        //If the length of the word is greater than 4 and has an or at the end,
        //then these sequence of commands engage.
        if (merica.length() > 4 && r != -1){
            //The program takes the part of the word that doesn't have 
            String constant = merica.substring(0, r);
            String replace = merica.substring(r);
            replace = replace.replace("or", "our");
            System.out.println(constant + replace);
        }else{
            System.out.println(merica);
        }
    }
        System.out.println("Goodbye.");}
}
