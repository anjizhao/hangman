
import java.util.*; 
import java.io.*; 


public class HangmanTest {

	public static void main(String[] args) throws FileNotFoundException {

		HangmanGame game = new HangmanGame("words.txt"); 
		game.play(); 

	}



}