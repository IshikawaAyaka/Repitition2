package guessing_game;

abstract class Referee{
	protected Card answerCard;
	private CardStack cardStack;
	
	
	public Referee(CardStack cardStack) {
		this.cardStack = cardStack;
	}
	
	public void setAnswerCard() {
		answerCard = cardStack.draw();
	}
	
	abstract boolean judge(Card card);

}
