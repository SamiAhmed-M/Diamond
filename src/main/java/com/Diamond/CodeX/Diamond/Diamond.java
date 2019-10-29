package com.Diamond.CodeX.Diamond;

public class Diamond {
 public static void diamondDesign(int n)
 {
	// number of lines / rows & columns controller
			for (int i=1;i<=n;i++) {
				// number of space controllers
				for (int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				// number of symbols controller
				for (int z=1;z<=i;z++) {
					System.out.print("=");
				}
				/* print mirror image of the pattern starting the second line
				 * to do that start from 1 and end at i-1 or the reverse
				*/
				for (int x=i-1;x>=1;x--) {
					System.out.print("=");
				}
				// new line
				System.out.println();
			}
			
			/* number of lines / rows & columns controller for the inverted pyramid
			 * which has to be one line minus than the original pyramid to avoid double 
			 * line in the middle so i has to round to n-1
			 */
			for (int i=1;i<=n-1;i++) {
				// number of space controllers for the inverted pyramid
				for (int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				// number of symbols controllers for the inverted stair 
				for (int z=n-1;z>i-1;z--) {
					System.out.print("=");
				}
				/* creating mirror image on the symbol creation by extending
				 *  n-1 elements to its right
				*/
				for (int x=n-i-1;x>=1;x--) {
					System.out.print("=");
				}
				// new line
				System.out.println();
			}
 }
}
