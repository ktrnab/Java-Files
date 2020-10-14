/**
 * Brainstorm a program that will ask the user for a number of digits to be stored.  
 * The program should then create an array of that size and then prompt the user 
 * for numbers to fill each position in the array. When all of the positions 
 * are filled, display the contents of the array to the user.
 * @author KATRINA B
 * @version FEBRUARY 17 2020
 */

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int elements; 
	      int count = 0;
	      int i;
	      
	      //prompt user for number
	      System.out.print("Please enter the number of digits to be stored: ");
	      elements = scnr.nextInt();
	     
	      //test if 0
	      while (elements !=0 ) {
	    	  //test if integer
	    	  
	    	if  (elements < 0) {
	    		   System.out.println("ERROR! You must enter a non-negative number of digits!");  
	    	} else { 
	        	
	        	 //declare array size
	  	      	int[]userarray = new int[elements];
	        	
	        	
	        	
	    		   for (i = 0; i < userarray.length; ++i) {
	    			     System.out.print("Enter integer " + count+ ": ");
	    			     ++count;
	    		         userarray[i] = scnr.nextInt();
	    		         
	    		         
	    		  }
	    		   System.out.println("");
	    		   System.out.println("The contents of your array:");
	    		   System.out.println("Number of digits in array: " + count);
	    		   // print the array
	    		   System.out.print("Digits in array: " );
	    		   for (i = 0; i < userarray.length; ++i) {
	    			     
	    		         System.out.print(userarray[i] + " " );
	    		   }
	        }
	    		   
	    		   //loop again
	    		   System.out.println("");
	    		   System.out.println("");
	    		   System.out.print("Please enter the number of digits to be stored: ");
	    		   elements = scnr.nextInt();
	 	    	  
	 	       
	      	}

	      
	    System.out.print("No digits to store? Goodbye!");
	    scnr.close();  
	}
	}
	
