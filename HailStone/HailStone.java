/**
 * HAILSTONE SERIES
 * This a program that will  prompt the user to enter a positive integer.  
 * This program must then use a loop to compute a Hailstone Series, 
 * using that integer as a start point. 
 * @author KATRINA B
 * @version 20200211
 * 
 */

import java.util.Scanner;

public class HailStone {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);		
		System.out.print("Enter a starting value: ");
		int value;
		value = scnr.nextInt();
		System.out.print(value + ", ");
		
		// Loop to compute a Hailstone Series
		while(value > 1) {
			//Odd-Even Test
			if (value % 2 == 0) {
				value = value/2;
			} else {
				value = (3*value)+1;
			}					
			//Print without , for the last digit
			if(value != 1) {
				System.out.print(value+ ", ");
				} else {
				System.out.print(value);
				}			
		}
		scnr.close();		
	}
}
