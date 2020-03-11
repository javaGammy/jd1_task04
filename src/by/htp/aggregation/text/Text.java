package by.htp.aggregation.text;

public class Text {
	private String heading;
    private String text;

    public Text(Word word) {
    	heading = word.getWord();
    }

    public Text(Sentence sentence) {
    	heading = sentence.getSentence();
    }

    public String getHeading() {
        return heading;
    }

    public void addText(Word word) {
        text += " " + word.getWord();
    }

    public void addText(Sentence sentence) {
        text += " " + sentence.getSentence();
    }

    public String getText() {
        return text;
    }

}
