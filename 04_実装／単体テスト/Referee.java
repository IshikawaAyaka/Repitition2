package guessing_game;

abstract class Referee{
	protected Card answerCard;
	private CardStack cardStack;
	

	public Referee(CardStack cardStack) {
		this.cardStack = cardStack;
	}

	//答えのカードを設定
	public void setAnswerCard() {
		answerCard = cardStack.draw();
	}

	//判定する（抽象メソッド）
	abstract boolean judge(Card card);

}
