

import java.util.*; 
import java.io.*; 

public class WordList {

	private File wordFile; 
	private Scanner wordReader; 
	private ArrayList<String> words; 
	private int n; 
	private Random random; 

	public WordList(String fileName) throws FileNotFoundException {

		wordFile = new File(fileName); 
		wordReader = new Scanner(wordFile); 
		words = new ArrayList<String>(); 
		loadWords(); 
		n = words.size(); 
		random = new Random(); 
	}

	private void loadWords() {

		while (wordReader.hasNextLine()) {
			words.add(wordReader.nextLine().trim());
		}

	}

	public String pickWord() {

		int index = random.nextInt(n); 
		return words.get(index); 
	
	}



}