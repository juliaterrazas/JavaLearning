import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class VariableTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int ent;
        double dob;
        String st;

        /* Read and save an integer, double, and String to your variables.*/


        ent = Integer.parseInt(scan.nextLine());
        dob = Double.parseDouble(scan.nextLine());
        st = scan.nextLine();




        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+ent);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + dob);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+st);
        scan.close();

    }
}