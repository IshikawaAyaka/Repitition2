package guessing_game;

abstract class Referee{
	protected Card answerCard;
	private CardStack cardStack;
	
	public Referee() {
		
	}
	
	public Referee(CardStack cardStack) {
		
	}
	
	public void setAnswerCard() {
		answerCard = cardStack.draw();
	}
	
	abstract boolean judge(Card card);

}
