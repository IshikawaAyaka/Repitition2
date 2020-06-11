package guessing_game;

public class StrictReferee extends Referee{
	
	public StrictReferee(CardStack cardStack) {
		super(cardStack);
	}


	//判定する
	public boolean judge(Card card) {
		boolean result = false;
		//数の判定を行う
		if(answerCard.getNumber() == card.getNumber()) {
			System.out.println("数：一致");
		}else {
			System.out.println("数：不一致");
		}
		//スートの判定を行う
		if(answerCard.getSuit() == card.getSuit()) {
			System.out.println("スート：一致");
		}else {
			System.out.println("スート：不一致");
		}
		
		//数・スートともに一致の場合trueを返す
		if(answerCard.getNumber() == card.getNumber() && answerCard.getSuit() == card.getSuit()) {
			result = true;
		}
		return result;
	}

}
