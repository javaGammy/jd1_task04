package by.htp.aggregation.text;

public class Sentence {
	private String sentence;
	
	
	public void addWord(Word word) {
		sentence += " " + word.getWord();
		
	}
	public String getSentence() {
		return sentence;
	}

}
