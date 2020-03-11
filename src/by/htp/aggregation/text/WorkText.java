package by.htp.aggregation.text;

public class WorkText {

	public static void main(String[] args) {
		Word word = new Word("qwerty");
        Text text = new Text(word);

        Word word1 = new Word("abc");       

        Sentence sentence = new Sentence();
        sentence.addWord(word1);       

        text.addText(sentence);

        System.out.println("Заголовок: "+text.getHeading());
        System.out.println("Текст: "+ text.getText());

	}

}
