

import java.util.*; 
import java.io.*; 

public class Computer {

	private String wordString; 
	private ArrayList<Character> wordArray; 
	private ArrayList<Character> toDisplay; 
	private int misses; 
	private int missesAllowed; 
	private boolean stop; 
	private ArrayList<Character> missedChars; 
	
	public Computer(String w, int allowed) {

		wordString = w; 
		makeArrays(w); 
		misses = 0; 
		stop = false; 
		missedChars = new ArrayList<Character>(); 
		missesAllowed = allowed; 
	}

	public void turn(Character guess) {

		if (wordArray.contains(guess)) {
			// do stuff 
			
			for (int i = 0; i < wordArray.size(); i++) {
				if (wordArray.get(i).equals(guess)) {
					toDisplay.set(i, guess); 
				}
			}
			if (!toDisplay.contains('_')) {
				stop = true; 
				System.out.println("the word was \"" + wordString + "\""); 
				System.out.println("congratulations.. you have managed to live another day..");
			} else {
				System.out.println("hmm, got lucky this time..."); 
			}

		} else {
			
			missedChars.add(guess);
			misses ++; 
			if (misses >= missesAllowed) {
				stop = true; 
				System.out.println("the word was \"" + wordString + "\""); 
				System.out.println("you ded!!!!!!! lol!!");
			} else {
				System.out.println("you were wrong!! one step closer to death");
				System.out.println("wrong guesses left: " + (missesAllowed-misses)); 
			}
		}
		
	}

	private void makeArrays(String w) {

		wordArray = new ArrayList<Character>(w.length()); 
		toDisplay = new ArrayList<Character>(w.length()); 
		for (int i = 0; i < w.length(); i++) {
			wordArray.add(w.charAt(i));
			toDisplay.add('_');
		}

	}

	public void printCurrent() {

		String toPrint = Character.toString(toDisplay.get(0));
		for (int i = 1; i < toDisplay.size(); i++){

			toPrint += (" " + toDisplay.get(i));

		}
		System.out.println(toPrint);

	}

	public void printMisses() {

		if (missedChars.size() > 0) {
			String toPrint = Character.toString(missedChars.get(0));
			for (int i = 1; i < missedChars.size(); i++){
				toPrint += (" " + missedChars.get(i));
			}
			System.out.println("incorrect guesses: " + toPrint);
		}
	}

	public int getMisses() {
		return misses;
	}

	public boolean checkStop() {
		return stop; 
	}

}