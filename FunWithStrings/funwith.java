/**
 * FUN WITH STRINGS
 * Practicing string methods
 * @author KATRINA B
 * @version 20200120
 * 
 */

import java.util.Scanner;

public class funwith {
	
	public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
        String longString;
        String subString;
        String replaceString;
        int stringPosition;
        char characteratPosition;
        
        //Enter a long string
        System.out.print("Enter a long string: ");
        longString = scnr.nextLine(); // Gets entire line up to ENTER
     
        // Enter a substring
        System.out.print("Enter a substring: ");
        subString = scnr.nextLine(); // Gets entire line up to ENTER
               
        // Length of your string
        System.out.println("Length of your string: " + longString.length());
        
        // Length of your substring
        System.out.println("Length of your substring: " + subString.length());
              
        // Starting position of your substring
        System.out.println("The starting position of your substring: " + longString.indexOf('j'));
              
        // String before your substring
        System.out.println("The string before your substring: " + longString.substring(0,19));
            
        //String after your substring
        System.out.println("The string after your substring: " + longString.substring(27,44));
                
        //Enter a position between 0 and 43
        System.out.println("Enter a position between 0 and 43: ");
        stringPosition = scnr.nextInt();
                
        //The character at position 
        characteratPosition = longString.charAt(stringPosition);
        System.out.println("The character at position " + stringPosition + " is " + characteratPosition);
                
        //Enter a replacement string
        System.out.println("Enter a substring: ");
        replaceString = scnr.nextLine(); // Gets entire line up to ENTER
              
        //Your new string is
        System.out.println(longString); 
       
        //Print Goodbye
        System.out.println("Goodbye!");
       
    }

}
