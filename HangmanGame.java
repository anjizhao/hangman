
import java.util.*; 
import java.io.*; 

public class HangmanGame {

	private WordList wordList; 
	private Computer computer; 
	private Scanner input; 

	public HangmanGame(String fileName) throws FileNotFoundException {

		wordList = new WordList(fileName); 
		input = new Scanner(System.in); 
	}

	public void play() {

		boolean again = true; 
		
		while (again) {
			String word = wordList.pickWord(); 
			// System.out.println(word); 
			computer = new Computer(word, 7); 
			while (!computer.checkStop()) {
				playerGuess(); 
			}
			System.out.println("play again? (y/n)");
			Character againInput = input.next().charAt(0); 
			if (againInput.equals('y')) {
				// do nothing 
			} else {
				again = false; 
				System.out.println("remember that winners never quit and quitters never win.. goodbye..");
			}
		}
	}

	private void playerGuess() {
		System.out.println("========="); 
		computer.printMisses(); 
		computer.printCurrent(); 
		System.out.println("enter your guess (one character)"); 
		Character guess = input.next().toLowerCase().charAt(0); 
		computer.turn(guess); 
	}

}