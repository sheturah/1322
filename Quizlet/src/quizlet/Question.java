package quizlet;

public class Question {

	private String text;
	private String answer;
	private int difficulty;

	public Question() {

	}

	public Question(String text, String answer, int difficulty) {
		super();
		this.text = text;
		this.answer = answer;
		this.difficulty = difficulty;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public String toString()
	{
		return getText() + " " + getAnswer() + " " + getDifficulty(); 
	}
}
