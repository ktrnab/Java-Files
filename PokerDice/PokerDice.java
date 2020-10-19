/*
 *   A program that plays and scores a round of the game Poker Dice.  In this game,
 *   five dice are rolled.  The player is allowed to select a number of those five dice
 *   to re-roll.  The dice are re-rolled and then scored as if they were a poker hand.
 *      * Highest value x
 *      * One pair
 *      * Two pair
 *      * Three of a kind
 *      * Straight
 *      * Full house
 *      * Four of a kind
 *      * Five of a kind
 *
 * @author KATRINA B
 * @version APRIL 3, 2020
 *
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PokerDice {

    /**
     * Replaces the zeroes in the array dice with random values between 1 and 6
     * chosen from the Random generator rnd. Then sorts the array so that the
     * values are in sorted order. NOTE: In order to pass the test cases, you
     * MUST fill in zeroes from the front of the array to the back. If you go
     * back to front, the test cases will not pass.
     *
     * @param rnd
     *            generator to pull values from
     * @param dice
     *            array to fill with values.
     */
    public static void rollDice(Random rnd, int[] dice) {
        // TODO - complete this method
    	
    	for(int i=0;i<dice.length;i++){
			if(dice[i]==0){
				dice[i] =  (int)(6 * Math.random()) + 1;
			}
		}
    	
    	Arrays.sort(dice); 

    }

    /**
     * Displays the array dice as the user's current set of die rolls and
     * prompts them to indicate the indices of dice to be re-rolled, one index
     * at a time. If the user enters a -1, the loop ends. If the user enters an
     * invalid index other than -1, the method displays an error message and
     * continues prompting until a valid index or -1 is entered.
     *
     * @param dice
     *            array to set dice to be rerolled
     * @param inScanner
     *            Scanner to provide input from user
     * @return 
     */
    public static int[] promptForReroll(int[] dice, Scanner inScanner) {
        // TODO - complete this method
    	
    	Random rnd = new Random();
    	System.out.print("Your current role: ");
    	System.out.println(Arrays.toString(dice));
    	System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
    	int reroll = Integer.parseInt(inScanner.nextLine()); 
    	
    	//Indexes: 0-4, error outside this scope
    	//-1 to keep current	
    	
    	while (reroll != -1) {
    		
    		if (reroll < -1 || reroll > 4) {
    			System.out.println("Error: Index must be between 0 and 4");
        		System.out.print("Your current role: ");
            	System.out.println(Arrays.toString(dice));
            	
            	System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
            	reroll = Integer.parseInt(inScanner.nextLine()); 
    		}
    		
    		else {
    			
   		for(int i=0;i<dice.length;i++){
			   if(dice[reroll]==0){
				   dice[reroll] =  (int)(6 * Math.random()) + 1;
			}
		}
   	
   			Arrays.sort(dice); 
   			System.out.print("Your current role: ");
  		    System.out.println(Arrays.toString(dice));
  		    System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
  		    reroll = Integer.parseInt(inScanner.nextLine()); 
  		    }
    		
    	}
    	//End of While Loop, statements for -1
    	System.out.println("Keeping remaining dice...");
		System.out.println("Rerolling...");
		System.out.print("Your final roll: ");
		
    		for (int i = 0; i<dice.length; i++) {
       		 	dice[i] = rnd.nextInt(5)+1;
    		}
   	
    		Arrays.sort(dice); 
    		System.out.print(Arrays.toString(dice));
    		return dice;
      	}   	
   
    /**
     * Prompts the user with a message passed into method and returns true if
     * the user enters a 'Y' and false if the user enters an 'N'. The method
     * should work if the user uses upper or lower case inputs. If the user
     * enters any other value, the method should display an error message and
     * continue prompting until a valid value is entered.
     *
     * @param inScanner
     *            Scanner to provide in put from user
     * @param msg
     *            message to display to prompt the user to enter a value
     * @return
     */
    public static boolean promptToPlay(Scanner inScanner, String msg) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	
    	System.out.print(msg);
    	char response = inScanner.nextLine().charAt(0);
    	
    	while (response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
			
		System.out.println("ERROR! Only 'Y' and 'N' allowed as input!");        
	        System.out.print(msg);
	        response = inScanner.nextLine().charAt(0);
	}
    	
    	if (response == 'Y' || response ==  'y') {
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    }

    /**
     * Scores the value of the array of dice as a poker hand. Returns a String
     * giving the rank of the hand. See the assignment write-up for details on
     * how the rank string should be formatted.
     *
     * @param dice
     *            die rolls in sorted order
     * @return String holding the rank of the roll in the array dice
     */
    public static String scoreDice(int[] dice) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	String hand = "";
		int[] count = getCounts(dice);
		int twoCounter = 0;
		
		for(int i=0; i<count.length; i++){
			if (count[i]==2){
				twoCounter++;
			}
			if(twoCounter==1){
				hand="One pair";
			}
			if(twoCounter==2){
				hand="Two pair";
			}
		}
		
		int threeCounter=0;
		for(int i=0;i<count.length;i++){
			if (count[i]==3){
				threeCounter++;
			}
		}
			if(threeCounter==1){
				hand="Three of a kind";
			}
			if(threeCounter==1 && twoCounter==1){
				hand="Full house";
			}
		int fourCounter=0;
		for(int i=0;i<count.length;i++){
			if (count[i]==4){
				fourCounter++;
			}
			if(fourCounter==1){
				hand="Four of a kind";
			}
		}
		int fiveCounter=0;
		for(int i=0; i<count.length; i++){
			if (count[i]==5){
				fiveCounter++;
			}
			if(fiveCounter==1){
				hand="Five of a kind";
			}
		}
		int highest = 0;
		if(hand.equals("")){
			for(int i=0; i<dice.length; i++){
				if(dice[i]>highest){
					highest=dice[i];
				}
			}
			hand = "Highest value "+highest;
		}
		return hand;
	}

    /**
     * Returns true if value is somewhere in the array, false otherwise
     *
     * @param array
     *            array to search for value
     * @param value
     *            item to look for in the array
     * @return true if value is in array, otherwise false
     */
    public static boolean contains(int[] array, int value) {
    	
    	for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }
	
    /**
     * Given a SORTED array in increasing order, returns true if the numbers
     * form an unbroken sequence, false otherwise. For example, [1,2,3,4,5]
     * would be true, but [1,2,3,4,6] would be false.
     *
     * @param dice
     *            array sorted in increasing order
     * @return true if values in dice are in an unbroken sequence, false
     *         otherwise
     */
    public static boolean inSequence(int[] dice) {
      
    	Arrays.sort(dice); 
    	
    	for (int i = 0; i < dice.length - 1; i++) {
            if (dice[i] > dice[i + 1] || dice[i] == dice[i+1])
                return false;
        }
        return true;
    }
    /**
     * Returns an array where each position represents the counts of a value in
     * the array dice. For example, if dice is [1, 2, 3, 3, 5], then this method
     * would return [1, 1, 2, 0, 1, 0] - where index 0 holds the number of 1s,
     * index 1 holds the number of 2s, index 2 holds the number of 3s, etc.
     *
     * @param dice
     *            die rolls to count
     * @return array holding counts of each value in the array dice
     */
    public static int[] getCounts(int[] dice) {    	

    	int[] counts = new int[6];
    	for (int i = 0; i < dice.length; i++) {
    	
    	   if (dice[i] == 1) {
               counts[0]++;
           } else if (dice[i] == 2) {
               counts[1]++;
           } else if (dice[i] == 3) {
               counts[2]++;
           } else if (dice[i] == 4) {
               counts[3]++;
           } else if (dice[i] == 5) {
               counts[4]++;
           } else if (dice[i] == 6) {
               counts[5]++;
           }
       }
	
    	return counts;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO - complete this method
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Enter a random seed: ");
    	int seed = Integer.parseInt(keyboard.nextLine());
        Random rnd = new Random(seed);
        
        System.out.println("Welcome to the Poker Dice game!");
        System.out.println("Roll 5 dice and try to assemble the best poker hand.");
        String msg = "Would you like to play [Y/N]? ";
        //call method prompttoplay (scnr, msg)
        boolean reply = promptToPlay (keyboard, msg);
        
        while (reply != false) {
        
        //method rolldice, your current roll, 
        int[] sixdigits = new int[6];
        System.out.println("");
        rollDice(rnd, sixdigits);
        
        //method promptforreroll
        int[] finalroll = promptForReroll(sixdigits, keyboard);
        
        //method getcount
        getCounts(finalroll);
        
        boolean straight = inSequence(finalroll);
        	if (straight == true) {
	        	System.out.println();
	            System.out.println("Straight");
        	}
        	else {
        		System.out.println();
        		System.out.println(scoreDice(finalroll));
        	}
        
        
        //prompttoplay again
        System.out.println("");
        String msg2 = "Would you like to play again [Y/N]? ";
        reply = promptToPlay (keyboard, msg2);
        
        }
        
        System.out.print("Goodbye!");     	

    }

}
