
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a word ");
        String American = input.nextLine();
        
        if (American.length() >=4){
        if (American.length()<=64){ 
        if (American.endsWith("or")){
            American = American.replace("or", "our");
            System.out.println("In Canadian: " + American);
        }else{ 
            if (!American.endsWith("or")){
                American = American;
                System.out.println("In Canadian: " + American);
            }     
        }
            }
        else{
            System.out.println("In Canadian Already");
        }
        }else
            System.out.println("In Canadian Already");
        }
            }
            
            
    
    


    
