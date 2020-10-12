/* The program will generate two random integers between 1 and 20 
 * and then ask a series of math questions. Each question will be evaluated 
 * as to whether it is the right or wrong answer. 
 * In the end a final score should be reported for the user.
 * @author KATRINA B
 */

import java.util.Scanner;
import java.util.Random;

public class FunWithBranching {
	public static void main(String[] args) {	
	     Scanner keyboard = new Scanner(System.in);
	     System.out.print("Enter a random number seed: ");
	     int seed = Integer.parseInt(keyboard.nextLine());
	    	    
	     System.out.print("Enter your name: ");
	     String name = keyboard.nextLine();
	     System.out.println("Hello " + name + "!");
	     System.out.println("Please answer the following questions:");
	     System.out.println("");
	     
	     Random rnd = new Random(seed);
	     int computerNum1 = rnd.nextInt(20) + 1;  // computerNum will be between 1 and 20
	     int computerNum2 = rnd.nextInt(20) + 1;  // computerNum will be between 1 and 20
	     int scoreTrack = 0;
	     	     
	     // Addition
	     System.out.print(computerNum1 + " + " + computerNum2 + " = ");
	     int guess = keyboard.nextInt();
	     
	     if (guess == (computerNum1 + computerNum2)) {
	        	System.out.println("Correct!");
	        	scoreTrack++;
	     } else  {
	        	System.out.println("Wrong!");
	        	System.out.println("The correct answer is: " + (computerNum1 + computerNum2) );
	     }
	     
	     // Subtraction
	     System.out.print(computerNum1 + " - " + computerNum2 + " = ");
	     int guess2 = keyboard.nextInt();
	     
	     if (guess2 == (computerNum1 - computerNum2)) {
	        	System.out.println("Correct!");
	        	scoreTrack++;
	     } else  {
	        	System.out.println("Wrong!");
	        	System.out.println("The correct answer is: " + (computerNum1 - computerNum2) );     	
	     }

	     // Multiplication
	     System.out.print(computerNum1 + " * " + computerNum2 + " = ");
	     int guess3 = keyboard.nextInt();
	     
	     if (guess3 == (computerNum1 * computerNum2)) {
	        	System.out.println("Correct!");
	        	scoreTrack++;
	     } else  {
	        	System.out.println("Wrong!");
	        	System.out.println("The correct answer is: " + (computerNum1 * computerNum2) );
	     }

	     // Division
	     System.out.print(computerNum1 + " / " + computerNum2 + " = ");
	     int guess4 = keyboard.nextInt();
	     
	     if (guess4 == (computerNum1 / computerNum2)) {
	        	System.out.println("Correct!");
	        	scoreTrack++;
	        	
	     } else  {
	        	System.out.println("Wrong!");
	        	System.out.println("The correct answer is: " + (computerNum1 / computerNum2) );
	     }
	     
	     // Modulus
	     System.out.print(computerNum1 + " % " + computerNum2 + " = ");
	     int guess5 = keyboard.nextInt();
	     
	     if (guess5 == (computerNum1 % computerNum2)) {
	        	System.out.println("Correct!");
	        	scoreTrack++;
	     } else  {
	        	System.out.println("Wrong!");
	        	System.out.println("The correct answer is: " + (computerNum1 % computerNum2) );
	     }
	     	     
	     //Total Score
	     System.out.println("You got " + scoreTrack + " correct answers!");
		
	     //Quotient 
	     double percentage;
	     int questions;
	     questions = 5;
	     percentage = (scoreTrack*100)/questions;
	     System.out.println("That's " + percentage + "%");
		
	}
}
