/* StarGraph.java
 * Author: Alyssa Lagimoniere
 * Submission Date: 3/20/15
 * 
 * Purpose: To show a graphical representation of the sin 
 * function based of different values inputed by the user.
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		int n;
		double increment;
		int i = 0;
		
		//Get user input
		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt();
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		double[] x = new double[n];
		double[] y = new double[n];
		System.out.print("Enter a minimum value for x: ");
		double min = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//Get values
		System.out.println(""); System.out.println("Values");
		for (i = 0; i < n; i++) {
			x[i] = min;
			System.out.printf("x: " + "%.3f", x[i]); System.out.print(", ");
			y[i] = 20.0*(Math.sin(x[i]));
			y[i] = Math.abs(y[i]);
			System.out.print("y: "); System.out.printf("%.3f\n", y[i]);
			min += increment;
		}
			
		//Print graph
		System.out.println(""); System.out.println("Graph");
		for (i = 0; i < n; i++) {
			int number = (int)y[i];
			System.out.print(":");
				for (int j = 0; j < number; j++) {
					System.out.print("*");
				}	
			System.out.println("");
		}

		
	}

}
