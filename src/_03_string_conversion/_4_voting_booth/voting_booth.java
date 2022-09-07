package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String age = JOptionPane.showInputDialog("How old are you in years? (Don't you dare try to figure out seconds or minutes or even hours!!!");
int ageAsInt = Integer.parseInt(age); 
if(ageAsInt >= 18) {
	JOptionPane.showMessageDialog(null,"Soooooooo... Who do you think deserves to be president?"); 
	
	
}
else {
	JOptionPane.showMessageDialog(null,"Well,well,well... You tryin' to vote early aren't ya? Now scram! "); 
}
		
		
	}

}
