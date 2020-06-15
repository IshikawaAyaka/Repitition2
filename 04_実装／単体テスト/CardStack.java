package guessing_game;

public class CardStack {
	private Card[][] cards = new Card[4][13];

	public CardStack() {

		//カード作成
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = new Card();
			}
		}

		// suit,numberを設定
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {
				switch (i) {
				case 0:
					cards[i][j].setSuit(Suit.SPADE);
					cards[i][j].setNumber(j+1);
					break;
				case 1:
					cards[i][j].setSuit(Suit.HEART);
					cards[i][j].setNumber(j+1);
					break;
				case 2:
					cards[i][j].setSuit(Suit.DIAMOND);
					cards[i][j].setNumber(j+1);
					break;
				case 3:
					cards[i][j].setSuit(Suit.CLUB);
					cards[i][j].setNumber(j+1);
					break;

				}
			}
		}
	}

	//カードを引く
	public Card draw() {
		int x = (int) ((Math.random() * 3) );
		int y = (int) ((Math.random() * 12) );
		return cards[x][y];
	}

}
