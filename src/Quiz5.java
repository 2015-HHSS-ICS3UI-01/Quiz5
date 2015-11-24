
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        
        //gets repeated until quit! is typed
        while (true) {
            //asks user for american word to be translated
            System.out.print("Please enter a word to translate(Type quit! to end the program): ");
            String word = input.nextLine();
            
            //asks for user to type a word with less than 63 characters
            while(word.length() > 63){
                System.out.print("Please enter a word with less than 63 characters: ");
                word = input.nextLine();
            }
            //users word is changed to american
            String american = word;

            //program ands if quit! is entered
            if (american.equalsIgnoreCase("quit!")) {
                break;
            }
            //if word doesnt contain or then it says that its the same
            if (!american.contains("or")) {
                System.out.println(word + " in Canadian is the same!");
            }
            //adds our at the end of the word
            for (int i = 0; i < american.length(); i++) {
                char r = american.charAt(i);
                if (american.endsWith("or")) {
                    if (r == 'r') {
                        int rFound = american.indexOf(r);
                        String first = american.substring(0, rFound);
                        String middle = american.substring(rFound);
                        american = first + "ur";
                        System.out.println(word + " translates to " + american + " in Canadian");
                        break;
                    }
                }
            }
        }
    }
}
