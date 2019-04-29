package fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int rn = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(rn);
		// 4. Get the user to enter a question for the 8 ball
		String question = JOptionPane.showInputDialog("Ask a question");
		// 5. If the random number is 0
		if(rn==0) {
			System.out.println("yes");
		}else if(rn==1) {
			System.out.println("no");
		}else if(rn==2) {
			System.out.println("google it");
		}else if(rn==3) {
			System.out.println("oh no! i didnt know i had to put an answer here");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer

	}
	
}
