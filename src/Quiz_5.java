
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Quiz_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called input
        Scanner input = new Scanner(System.in);
        //everything inside this statement will loop until told to break
        while (true) {
        //makes the computer print "Enter an American word to translate into Canadian" 
        //onto the screen     
            System.out.println("Enter an American word to translate into Canadian");
        //created a new variable called "word" that is equal to whatever word the user entered    
            String word = input.nextLine();
        //created a new variable called "wordlength" and made it equal to the length of "word"
            int wordlength = word.length();
        //if the word is quit, the program breaks out of the while loop
            if (word.equalsIgnoreCase("quit")) {
                break;
            }


            //created a variable called aFound that calculates where a is in the word 
            int aFound = word.indexOf("a");

            //created two variables called first and last and made them blank for now
            String first = "";
            String last = "";
            //if "aFound" is less than or equal to -1, then first and last will be the word
            if (aFound <= -1) {
                first = word;
                last = word;
                //if aFound isn't less than or equal to -1, then first will be equal to 
                //everything before the a, and last will be equal to everything after    
            } else {
                first = word.substring(0, aFound);
                last = word.substring(aFound);

            }
            //created a variable called eFound that calculates where e is in the word
            int eFound = word.indexOf("e");
            //created two variables called secondfirst and secondlast and made them blank for now
            String secondfirst = "";
            String secondlast = "";
            //if "eFound" is less than or equal to -1, then secondfirst and secondlast will be the word
            if (eFound <= -1) {
                secondfirst = word;
                secondlast = word;
                //if eFound isn't less than or equal to -1, then secondfirst will be equal to 
                //everything before the e, and secondlast will be equal to everything after    
            } else {
                secondfirst = word.substring(0, eFound);
                secondlast = word.substring(eFound);
            }
            //created a variable called iFound that calculates where i is in the word
            int iFound = word.indexOf("i");
            //created two variables called thirdfirst and thirdlast and made them blank for now
            String thirdfirst = "";
            String thirdlast = "";
            //if "iFound" is less than or equal to -1, then thirdfirst and thirdlast will be the word
            if (iFound <= -1) {
                thirdfirst = word;
                thirdlast = word;
                //if iFound isn't less than or equal to -1, then thirdfirst will be equal to 
                //everything before the i, and thirdlast will be equal to everything after    
            } else {
                thirdfirst = word.substring(0, iFound);
                thirdlast = word.substring(iFound);
            }
            //created a variable called oFound that calculates where o is in the word
            int oFound = word.indexOf("o");
            //created two variables called fourthfirst and fourthlast and made them blank for now
            String fourthfirst = "";
            String fourthlast = "";
            //if "oFound" is less than or equal to -1, then fourthfirst and fourthlast will be the word
            if (oFound <= -1) {
                fourthfirst = word;
                fourthlast = word;
                //if oFound isn't less than or equal to -1, then fourthfirst will be equal to 
                //everything before the o, and fourthlast will be equal to everything after    
            } else {
                fourthfirst = word.substring(0, oFound);
                fourthlast = word.substring(oFound);
            }
            //created a variable called uFound that calculates where u is in the word
            int uFound = word.indexOf("u");
            //created two variables called fifthfirst and fifthlast and made them blank for now
            String fifthfirst = "";
            String fifthlast = "";
            //if "uFound" is less than or equal to -1, then fifthfirst and fifthlast will be the word
            if (uFound <= -1) {
                fifthfirst = word;
                fifthlast = word;
                //if uFound isn't less than or equal to -1, then fifthfirst will be equal to 
                //everything before the o, and fifthlast will be equal to everything after    
            } else {
                fifthfirst = word.substring(0, uFound);
                fifthlast = word.substring(uFound);
            }
            //created a variable called yFound that calculates where y is in the word
            int yFound = word.indexOf("y");
            //created two variables called sixthfirst and sixthlast and made them blank for now
            String sixthfirst = "";
            String sixthlast = "";
            //if "yFound" is less than or equal to -1, then sixthfirst and sixthlast will be the word
            if (yFound <= -1) {
                sixthfirst = word;
                sixthlast = word;
                //if yFound isn't less than or equal to -1, then sixthfirst will be equal to 
                //everything before the o, and sixthlast will be equal to everything after    
            } else {
                sixthfirst = word.substring(0, yFound);
                sixthlast = word.substring(yFound);
            }


            //if aFound is equal to -1, it then equals 1000
            if (aFound == -1) {
                aFound = 1000;
            }
            //if eFound is equal to -1, it then equals 1000
            if (eFound == -1) {
                eFound = 1000;
            }
            //if iFound is equal to -1, it then equals 1000
            if (iFound == -1) {
                iFound = 1000;
            }
            //if oFound is equal to -1, it then equals 1000
            if (oFound == -1) {
                oFound = 1000;
            }
            //if uFound is equal to -1, it then equals 1000
            if (uFound == -1) {
                uFound = 1000;
            }
            //if yFound is equal to -1, it then equals 1000
            if (yFound == -1) {
                yFound = 1000;
            }
            //if the wordlength is more than or equal to 4, ends with "or", and 
            //does not have a,e,i,o,u or y in the third last placement in the word, 
            //it will replace the "or" with "our"
            if (wordlength >= 4) {
                if (word.endsWith("or")) {
                    if (wordlength - 3 != aFound
                            || wordlength - 3 != eFound
                            || wordlength - 3 != iFound
                            || wordlength - 3 != oFound
                            || wordlength - 3 != uFound
                            || wordlength - 3 != yFound) {

                        String newword = word.replace("or", "our");
             //prints word + " translates to " + newword + " in Canadian" onto the screen           
                        System.out.println(word + " translates to " + newword + " in Canadian");
                        //if the word does have a a,e,i,o,u or y in the third last position, 
                        //then word + " translates to " + word + " in Canadian" will be printed onto the screen
                    }else{
                        System.out.println(word + " translates to " + word + " in Canadian");
                    }
                   //if the word does not have an "or" at the end, then 
                    //word + " translates to " + word + " in Canadian" will be printed onto the screen
                }else{
                    System.out.println(word + " translates to " + word + " in Canadian");
                }
                //if the word has less than 4 letters, then 
                //word + " translates to " + word + " in Canadian" will be printed onto the screen
            } else {
                System.out.println(word + " translates to " + word + " in Canadian");
            }
            


        }
    }
}
