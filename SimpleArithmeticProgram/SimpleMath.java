/**
 * ENTER A DESCRIPTION OF YOUR PROJECT HERE!
 * @author KATRINA BUSGANO
 * @version JANUARY 18, 2020
 **/
import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        // TO DO: Enter your code here between the curly braces
    	Scanner scnr = new Scanner(System.in);
        int firstNumber;   // First Number
        int secondNumber; // Second Number
        

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