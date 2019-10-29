package com.Diamond.CodeX.Diamond;

import java.util.Scanner;

/**
 * Create a diamond design
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Scanner object
    			Scanner myObj = new Scanner(System.in);
    			// User has to decide how many number of lines 
    			System.out.println("Please enter the number of lines or diamond diagonal length");
    			int n = myObj.nextInt();
    			myObj.close();
    			Diamond.diamondDesign(n);
    }
}
