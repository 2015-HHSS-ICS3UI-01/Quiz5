
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

        Scanner input = new Scanner(System.in);

        while (true) {
            //asks user for american word to be translated
            System.out.print("Please enter a word to translate(Type quit! to end the program): ");
            String word = input.nextLine();

            String american = word;
            //program ands if quit! is entered
            if (american.equalsIgnoreCase("quit!")) {
                break;
            }
            if (american.length() < 4) {
                System.out.println(american + " in Canadian is the same!");
            }
            for (int i = 0; i < american.length(); i++) {
                char o = american.charAt(i);                              
                if (o == 'o') {
                    if (american.contains("or")) {
                        int oFound = american.indexOf(o);                      
                        String first = american.substring(0, oFound);
                        String middle = american.substring(oFound);
                        american = first + "our";                       
                        System.out.println(american);
                        break;
                    }
                }
            }
        }
    }
}
