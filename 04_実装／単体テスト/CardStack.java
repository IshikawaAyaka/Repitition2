package guessing_game;

public class CardStack {
	private Card[][] cards = new Card[4][13];

	public CardStack() {

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = new Card();
			}
		}

		// suitì¬
		// number‚ðì¬
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {
				switch (i) {
				case 0:
					cards[i][j].setSuit(Suit.SPADE);
					cards[i][j].setNumber(j);
				case 1:
					cards[i][j].setSuit(Suit.HEART);
					cards[i][j].setNumber(j);
				case 2:
					cards[i][j].setSuit(Suit.DIAMOND);
					cards[i][j].setNumber(j);
				case 3:
					cards[i][j].setSuit(Suit.CLUB);
					cards[i][j].setNumber(j);

				}
			}
		}

	}

	public Card draw() {
		int x = (int) ((Math.random() * 3) + 1);
		int y = (int) ((Math.random() * 13) + 1);

		return cards[x][y];
	}

}

