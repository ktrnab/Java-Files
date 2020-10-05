/**
 * A very basic program that takes two integers and 
 * and prints the answer to the arithmetic
 * @author KATRINA B
 * @version JANUARY 18, 2020
 **/
import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
        int firstNumber;   
        int secondNumber; 
        
        System.out.print("Enter the first number: ");
        firstNumber = scnr.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scnr.nextInt();
     
        System.out.print(firstNumber + " + " + secondNumber + " = ");
        System.out.println(firstNumber + secondNumber);
        
        System.out.print(firstNumber + " - " + secondNumber + " = ");
        System.out.println(firstNumber - secondNumber);
        
        System.out.print(firstNumber + " * " + secondNumber + " = ");
        System.out.println(firstNumber * secondNumber);
        
        System.out.print(firstNumber + " / " + secondNumber + " = ");
        System.out.println(firstNumber / secondNumber);
        
        System.out.print(firstNumber + " % " + secondNumber + " = ");
        System.out.println(firstNumber % secondNumber);
        
        System.out.println("The average of your two numbers is: " + (firstNumber + secondNumber)/2);
       
    }
}
