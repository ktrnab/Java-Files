/**
 * HAILSTONE SERIES
 * write a program that will  prompt the user to enter a positive integer.  
 * Your program must then use a loop to compute a Hailstone Series, 
 * using that integer as a start point. 
 * @author KATRINA BUSGANO
 * @version 20200211
 * 
 */

import java.util.Scanner;

public class HailStone {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int value;
		
		
		System.out.print("Enter a starting value: ");
		value = scnr.nextInt();
		System.out.print(value+", ");
		
		while(value>1) {
			
			//Odd-Even Test
			if (value%2 == 0) {
				value = value/2;
			}
			
			else {
				value = (3*value)+1;
			}
			
			
			//Print without , for the last digit
			if(value!=1) {
				System.out.print(value+ ", ");
				}
				else {
				System.out.print(value);
				}
				
			
		}
		
		scnr.close();
		
	}

}
