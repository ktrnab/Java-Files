package highorlowagainstarandomnumber;
/**
 * Brainstorm how to write a program that will prompt the user for a random number seed 
 * and then generate a random number (see below for more details on this).  
 * It should then ask the user for a number and compare it to the random number it generated.  
 * If the user's number is larger, it should report "Your number is larger!".  
 * Otherwise it should report "Your number was not larger!"  
 * The program must prompt for the numbers as int values. 
 * @author KATRINA BUSGANO
 * @version 1-28-2020
 */
import java.util.Scanner;
import java.util.Random;

public class highorlow {
	 public static void main(String[] args) {
	      
		 Scanner keyboard = new Scanner(System.in);
	        System.out.print("Enter a random seed: ");
	        int seed = keyboard.nextInt();
	        
	        Random rnd = new Random(seed);
	        int computerNum = rnd.nextInt(10) + 1;  // computerNum will be between 1 and 10
	        
	        System.out.println("Im thinking of a number between 1 and 10");
	        
	        System.out.print("What is your guess?");
	        int guess = keyboard.nextInt();
	        
	        System.out.println ("My number was: " + computerNum);
	        
	        
	        //If the user's number is larger, it should report "Your number is larger!". 
	        //Oherwise it should report "Your number was not larger!" 
	        if (guess > computerNum) {
	        	System.out.print("Your number was larger!");
	        }
	        
	        else  {
	        	System.out.print("Your number was not larger!");
	        }
	        
	        
	        keyboard.close();
	    }
	}


