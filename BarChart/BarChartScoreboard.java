import java.util.Arrays;
import java.util.Scanner;

public class BarChartScoreboard {

   //max score
   public static int max(int[] t) {
	    int maximum = t[0];   // start with the first value
	    for (int i=1; i<t.length; i++) {
	        if (t[i] > maximum) {
	            maximum = t[i];   // new maximum
	        }
	    }
	    return maximum;
	}
   
   //max string
   public static String maxstring(String[] t) {
		int index = 0; 
		int elementLength = t[0].length();
		for(int i=1; i< t.length; i++) {
		    if(t[i].length() > elementLength) {
		        index = i; 
		        elementLength = t[i].length();
		    }
		}
		return t[index];
	}
   

	
 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);

	      
	      //prompt the user for number of players
	      System.out.print("Enter the number of players: ");
	      String elements = scnr.nextLine();
	      int elementsnum = Integer.parseInt(elements);

	      // declare array size
	  	  int[]userarray = new int[elementsnum];
	  	  
	  	 
	  	  //declare another array for name
	  	  String[]namearray = new String[elementsnum];
	  	  
	  	  //declare another array for score
	  	  int[]scorearray = new int[elementsnum];
	  	  
	  	  if (elementsnum !=0) {
	  	  
	  	  
		  	  //if not 0, ask for name and score
		  	  for (int i = 0; i <userarray.length; ++i) {
		  		  
		  		  //ask name
			  	  System.out.print("Enter a player name: ");
		  	      String name = scnr.nextLine();
		  	      namearray[i] = name;
		  	      
		  	      //ask score
		  	      System.out.print("Enter the score for " + name +": ");
		    	  String score = scnr.nextLine();
		    	  int scorenum = Integer.parseInt(score);
		    	  scorearray[i] = scorenum;
		    	  
		    	  //spaces
		    	  System.out.println();
		        
		      }
		  	  
		  	  //find max
		  	  int maximum = max(scorearray);
		  	  if (maximum == 0) {
		  		  maximum = 1;
		  	  }
		  	  
		  	  
		  	  //find max string
			  String maximumstring = maxstring(namearray);
			  int maximumstringlength = maximumstring.length();
		  	  //System.out.print(maximumstringlength);
		  	  
		  	  
		  	  
		  	  //Current Scoreboard
		  	  System.out.println("Current Scoreboard");
		  	  System.out.println("------------------");
		  	  
		  	  
		  	  // print the array
		  	  for (int j = 0; j < userarray.length; ++j) {
		  		System.out.print(namearray[j] + " ");
		  			
		  			
		  				//spaces
		  				if(namearray[j].length() != maximumstringlength) {
		  				int sub = maximumstringlength - namearray[j].length();
		  				
		  				
		  					for(int r = 0; r<sub; r++) {
				  						System.out.print(" ");
				  						
				  					}
		  				}
		  				
		  			
		  				int stars = (scorearray[j]*50)/maximum;
			  			for (int i = 0; i<stars; i++) {
			  				System.out.print("*");
			  				}
		  			
			  			System.out.println();
		  	  }
	  	  
          } 
	  	  
	  	  else {
	  
		  	  //only if elements is 0 
		  	  System.out.println("No players to display?  Goodbye!");
	  	  }

scnr.close();

}
}
