
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author butlj9437
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and American word and I will give you it in canadian.");
        String word = input.nextLine();
        boolean wordL = word.length() < 64;
        if (word.endsWith("or")
                && word.length() > 4
                && wordL) {
            String newWord = word.substring(word.length() - 3);
            if (newWord.startsWith("a")
                    || newWord.startsWith("e")
                    || newWord.startsWith("i")
                    || newWord.startsWith("o")
                    || newWord.startsWith("u")
                    || newWord.startsWith("y")) {
            } else {
                word = word.substring(0, word.length() - 2) + "our";
            }
            System.out.println("Your word in Canadian is " + word + ".");
        } else if (!wordL) {
            System.out.println("Invald lenght.");
        } else {
            System.out.println("Your word in Canadian is " + word + ".");
        }
    }
}
