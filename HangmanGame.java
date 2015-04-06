
import java.util.*; 
import java.io.*; 

public class HangmanGame {

	private WordList wordList; 
	private Computer computer; 

	public HangmanGame(String fileName) throws FileNotFoundException {

		wordList = new WordList(fileName); 

	}

	public void play() {
		
		String word = wordList.pickWord(); 
		System.out.println(word); 
		computer = new Computer(word); 
		computer.printCurrent(); 
	}


}