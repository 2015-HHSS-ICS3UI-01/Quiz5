
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a word
        System.out.println("Please enter a word.");
        String merican = input.nextLine();

        //If the user puts quit
        if (merican.equalsIgnoreCase("quit")) {
            System.out.println("See ya brohemasaurusrex.");
            System.exit(0);
        }
        
        //If the word is longer than 64 letters
        if (merican.length() >= 64) {
            System.out.println("Word too long. Buhbye.");
            System.exit(0);
        }
        
        //If the word is longer than for and ends with or
        if (merican.length() >= 4) {


            if (!merican.endsWith("aor")
                    || !merican.endsWith("oor")
                    || !merican.endsWith("eor")
                    || !merican.endsWith("uor")
                    || !merican.endsWith("yor")){
                     
                merican = merican.replace("r", "ur");

                System.out.println("In Canadian: " + merican);
            }else{
                System.out.println("Already Canadian spelling.");
            }
            //if the word has less than 4 letters
        } else {
            System.out.println("Already Canadian spelling. Buhbye.");
        }
    }
}
