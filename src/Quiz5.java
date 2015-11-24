
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        //ask for a word
        System.out.println("Enter an American word to translate into Canadian(type quit! to quit the program): ");
        String word = input.nextLine();
        //changed word is called canadian
        String canadian = word;

        //make program loop
        while (word.length() > 0) {

            //end if quit! is entered
            String end = "quit!";
            if (word.equalsIgnoreCase(end)) {
                break;
            }

            //translate from american to canadian if the word ends with "or" and has 4 or more letters
            if ((word.endsWith("or")) && (word.length() > 4) && (word.endsWith("bor")
                    || word.endsWith("cor")
                    || word.endsWith("dor")
                    || word.endsWith("for")
                    || word.endsWith("gor")
                    || word.endsWith("hor")
                    || word.endsWith("jor")
                    || word.endsWith("kor")
                    || word.endsWith("lor")
                    || word.endsWith("mor")
                    || word.endsWith("nor")
                    || word.endsWith("por")
                    || word.endsWith("qor")
                    || word.endsWith("ror")
                    || word.endsWith("sor")
                    || word.endsWith("tor")
                    || word.endsWith("vor")
                    || word.endsWith("wor")
                    || word.endsWith("xor")
                    || word.endsWith("yor")
                    || word.endsWith("zor"))) {
                //replace "r" with "ur"
                canadian = word.replace("r", "ur");
                System.out.println(word + " translates to " + canadian + " in Canadian");
            } //if the word doesnt end with "or" or isnt 4 letters or longer
            else {
                //tell them that their word doesnt change
                System.out.println(word);
                System.out.println("Your word is the same in Canadian");
            }

            //ask for a word again
            System.out.println("Enter an American word to translate into Canadian(type quit! to quit the program): ");
            word = input.nextLine();

            //loop until the program is ended
        }
    }
}
