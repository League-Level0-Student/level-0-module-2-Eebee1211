//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10);
		
				if (randomNumber == 0) { 
			JOptionPane.showMessageDialog(null, "You are wonderful(ly annoying)" );
		}
		else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are amazing (at nothing)");
		}
		else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are kind");
		}
		else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You look very nice (compared to a rat)");
		}
		else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are very loyal (to the people I don't like)");
		}
		else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null,"You rule (like a tyrant)");
		}
		else if (randomNumber == 6) {
			JOptionPane.showMessageDialog(null,"You Rock!(I am implying that you are literally a rock)");
		}
		else if (randomNumber == 7) {
			JOptionPane.showMessageDialog(null, "You are awesome");
		}
		else if (randomNumber == 8) {
			JOptionPane.showMessageDialog(null, "You are very lucky ");
		}
		else if (randomNumber == 9) {
			JOptionPane.showMessageDialog(null, "You have good taste in furniture");
		}
		JOptionPane.showInputDialog("Ask a yes or no question to the magical 8 ball"); 		
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
