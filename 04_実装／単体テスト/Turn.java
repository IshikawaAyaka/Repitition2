package guessing_game;

public class Turn {

	private Player player;

	private Card card;
	
	private Suit suit;

	public Turn(Player player) {
		this.player=player;
		card=new Card();
	}

	public boolean requestCard() {
		int a[]=player.selectCard();
		int x=a[0];
		int y=a[1];
		boolean i=checkNumber(x);
		boolean j=checkSuit(y);
		if(i == true && j == true) {
			card.setNumber(x);
			switch(y) {
			case 0:
				card.setSuit(suit.SPADE);
				break;
			case 1:
				card.setSuit(suit.HEART);
				break;
			case 2:
				card.setSuit(suit.DIAMOND);
				break;
			case 3:
				card.setSuit(suit.CLUB);
				break;
			}
			return true;
		}else{
			return false;
		}
	}

	public Card getCard() {
		return card;
	}

	public boolean checkSuit(int x) {
		if(0<=x&&x<=3) {
			return true;
		}else{
			System.out.println("カードのスートは0～3の値を入力してください。");
			return false;
		}
	}

	public boolean checkNumber(int x) {
		if(card.getMIN()<=x&&x<=card.getMAX()) {
			return true;
		}else {
			System.out.println("カードの数字は1～13の値を入力してください。");
			return false;
		}
	}

}
