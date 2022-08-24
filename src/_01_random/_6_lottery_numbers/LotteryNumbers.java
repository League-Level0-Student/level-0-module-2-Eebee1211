package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random ran = new Random(); 
		int lottery = 0; 
		int number = 0;
		String numbers = ""; 
		String space = " ";
        for ( lottery=0; lottery<6; lottery++ ) {
        	number = ran.nextInt (69-1+1)+1; 
        numbers = number + space + numbers + space; 
        }
		JOptionPane.showMessageDialog(null, numbers);
		
		
		
		
		
		
		
	}

}
