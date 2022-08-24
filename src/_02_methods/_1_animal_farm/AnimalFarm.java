//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {

		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/			 
	String animal = " ";
	while(!animal.equalsIgnoreCase("Exit")) {
		/* 2. Make it so that the user can keep entering new animals. */
 animal = JOptionPane.showInputDialog("Choose an animal on the animal farm if you would like to end, write exit."); 
 if(animal.equalsIgnoreCase("Cow")) {
	    JOptionPane.showMessageDialog(null, "The cow is an animal in the animal farm.");
	    moo(); 
}
 if(animal.equalsIgnoreCase("Duck")) {
	    JOptionPane.showMessageDialog(null, "The duck is an animal in the animal farm.");
	    quack(); 	    

 }
 if(animal.equalsIgnoreCase("Dog")) {
	    JOptionPane.showMessageDialog(null, "The dog is an animal in the animal farm.");
	    woof(); 
 }
	    if(animal.equalsIgnoreCase("Cat")) {
	    	JOptionPane.showMessageDialog(null,"The cat is an animal in the animal farm."); 
	    	meow(); 
	    }
	if(animal.equalsIgnoreCase("Llama")) {
		JOptionPane.showMessageDialog(null,"The llama is an animal in the animal farm.");
		llamaScream(); 
	}
	}
	
	}

	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}
	

	void quack() {
		playNoise(quackFile);
		showImage(duckIcon);
	}

	void woof() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
	
	void meow() {
		playNoise(meowFile);
		showImage(catIcon);
	}
	
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
	ImageIcon cowIcon;
	
	private void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}