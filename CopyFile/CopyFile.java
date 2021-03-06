/**
 * Program to copy one file into another, using command line arguments
 *
 * @author KATRINA B
 * @version MARCH 8, 2020
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {

    /**
     * Returns the reverse of the input String inString.
     *
     * @param inString
     *            the String to be reversed
     * @return the reverse of inString
     */
    public static String reverse(String inString) {
 
        String reverse="";

        for(int j=inString.length();j>0;--j){

            reverse = reverse+(inString.charAt(j-1)); 
        }
        return reverse.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fname = keyboard.nextLine();
        System.out.print("Enter an output file: ");
        String outputfname = keyboard.nextLine();

        try {
            File textFile = new File(fname);
            Scanner textScanner = new Scanner (textFile);

            File outputFile = new File(outputfname);
            PrintWriter output = new PrintWriter (outputFile);

            while(textScanner.hasNext()) {
                String str = textScanner.nextLine();

                String reversed = reverse(str);
                output.println(reversed);
            }

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open the file" + fname);
        }

        keyboard.close();

    }

}

