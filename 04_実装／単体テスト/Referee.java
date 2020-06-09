public abstract class Referee {

	protected Card answerCard;

	private CardStack cardStack;

	public Referee() {

	}

	public void setAnswerCard(Card card) {

	}

	public abstract boolean judge(Card card);

}
