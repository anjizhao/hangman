

import java.util.*; 
import java.io.*; 

public class Computer {

	private String wordString; 
	private ArrayList<Character> wordArray; 
	private ArrayList<Character> toDisplay; 
	
	public Computer(String w) {

		wordString = w; 
		makeArrays(w); 
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

}