/**
 *  * @author KATRINA BUSGANO
 * @version 2-07-2020
 */
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
	 public static void main(String[] args) {
	      
		 Scanner keyboard = new Scanner(System.in);
	        System.out.print("Enter a random seed: ");
	        int seed = keyboard.nextInt();
	        
	        int guess;
	        int computerNum;
	        int counter = 1;
	        
	        
	        //Inputs
	        Random rnd = new Random(seed);
	        computerNum = rnd.nextInt(200) + 1;  // computerNum will be between 1 and 200
	        
	        System.out.print("Enter a guess between 1 and 200: ");
	        guess = keyboard.nextInt();
	        
	        
	        //Outputs
	        while (guess != computerNum) {
	           if (guess < 0) {
	        		counter++;
	        		System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
	        	    System.out.println("Your guess was too low - try again.");
	           }
	        	
	        	
	        	else if (guess > 200) {
	        		counter ++;
	        	    System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
	        	    System.out.println("Your guess was too high - try again.");
	        	}
	        	
	        	else if (guess <= 187 ) {
	        		counter ++;
	        		System.out.println("Your guess was too low - try again.");
	        	}
	        	
	        	else if (guess > 100 && guess <= 200) {
	        		counter ++;
	        		System.out.println("Your guess was too high - try again.");
	        		
	        	}
	        
	         System.out.println("");
	         System.out.print("Enter a guess between 1 and 200: ");
		     guess = keyboard.nextInt();
		    
		     
		
	        	
	        }
		     
		    System.out.println("Congratulations!  Your guess was correct!");
		    
		    
		    System.out.println("");
		    System.out.println("I had chosen " + computerNum + " as the target number.");
		    System.out.println("You guessed it in " + counter + " tries.");
		    
		    if (counter == 1) {
		    	System.out.println("That was impossible!");
		    }
	     
	     else
		    
		    
		    if (counter >= 2 && counter <= 3) {
		    	System.out.println("You're pretty lucky!");
		    	
		    }
		 else
		    
		    if (counter >= 4 && counter <= 7) {
		    	
		    	System.out.println("Not bad, not bad...");
		    	
		    }
		    	
		    	
		 else
			 
		    if (counter == 8) {
		    	System.out.println("That was not very impressive.");
		    	
		    }
		 else
			 
		    if (counter > 8 && counter <= 10) {
		    	System.out.println("Are you having any fun at all?");
		    }
		 else   
			 
		    if (counter >=11) {
		    	System.out.println("Maybe you should play something else.");
		    	
		    }    
	        
	        
	        keyboard.close();
	    }
	}





