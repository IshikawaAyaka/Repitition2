package guessing_game;

public class GentleReferee extends Referee{
	
	public GentleReferee(CardStack cardStack) {
		super(cardStack);
	}
	
	//判定する
	public boolean judge(Card card) {
		boolean result = false;
		
		getHint(card);
		
		//数・スートともに一致の場合trueを返す
		if(answerCard.getNumber() == card.getNumber() && answerCard.getSuit() == card.getSuit()) {
			result = true;
		}
		return result;
	}

	//ヒントを出す
	private void getHint(Card card) {
		//数の判定を行う
		if(answerCard.getNumber() == card.getNumber()) {
			System.out.println("数：一致");
		}else if(answerCard.getNumber() < card.getNumber()){
			System.out.println("数：もっと小さい");
		}else {
			System.out.println("数：もっと大きい");
		}
		//スートの判定を行う
		//スートが一致していない場合、色が同じなら「惜しい」、色が異なるなら「不一致」と表示する。
		//SPADE,HEART,DIAMOND,CLUB
		if(answerCard.getSuit() == card.getSuit()) {
			System.out.println("スート：一致");
			System.out.println("");
		}else if(((answerCard.getSuit() == Suit.SPADE) ||(answerCard.getSuit() == Suit.CLUB)) && ((card.getSuit() == Suit.SPADE) || (card.getSuit() == Suit.CLUB)) ||
				((answerCard.getSuit() == Suit.HEART) || (answerCard.getSuit() == Suit.DIAMOND)) && ((card.getSuit() == Suit.HEART) || (card.getSuit() == Suit.DIAMOND))){
			System.out.println("スート:惜しい");
			System.out.println("");
		}else{
				System.out.println("スート:不一致");
				System.out.println("");
			}
		}
	}

