
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class LanguageTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);

        
    String lowerInput = ""; //Have the variable to work outside the loop

    while (!lowerInput.equals("quit"))
    {
      System.out.print ("Please enter a sentence to translate (Enter 'quit' to leave)");
      String input = in.nextLine ();

      lowerInput = input.toLowerCase(); //if the user types "quit", the program will end

      Translate newSentence = new Translate(input);
      String output = newSentence.getOutput();

      System.out.println (output); // printing the output
    }
  }
}


class Translate
{
  // placing the variables for the program
  private String word = "";
  private String newWord = "";
  private String line = "";
  private String output = "";
  private char lastLetter;
  private char secondLastLetter;
  private int wordLength;

  Translate(String l)
  {
    line = l;
    Translation();
    getOutput(); 
  }


  private void Translation()
  {
    Scanner freader = new Scanner(line);
    StringBuffer newPhrase = new StringBuffer ("");

    while (freader.hasNext())
    {
      String word = freader.next();
      wordLength = word.length(); // gets the length of each word

      int wordLength = word.length();
if(wordLength >= 5)
{ 
        lastLetter = word.charAt(wordLength - 1);
        secondLastLetter = word.charAt(wordLength - 2);

        if (secondLastLetter == 'o' && lastLetter == 'r') // last two letters must be "or"
        {
          String word2 = word.substring(0, wordLength - 2); //The program extracts all letters but the "OR"
          newWord = word2.concat("our"); // adds "our" to the end of the word
        }
        else
        {
          newWord = word; // keeps the word the same
        }
      }
      else
      {
        newWord = word;
      }

      newPhrase.append(newWord);
      newPhrase.append(' '); 
      output = newPhrase.toString(); //converting it back to a string
    }
  }

  String getOutput()
  {
    return output;
  }


        
    }


