	package guessing_game;

	public class Card {
		
		private static int MIN = 1;

		private static int MAX = 13;

		private int cardNumber;

		private Suit cardSuit;

		public Card() {

		}

		//数字を取得する
		public int getNumber() {
			return cardNumber;
		}

		//スートを取得する
		public Suit getSuit() {
			return cardSuit;
		}

		//数字の最大値を取得
		public int getMAX() {
			return MAX;
		}

		//数字の最小値を取得
		public int getMIN() {
			return MIN;
		}

		//数字を設定する
		public void setNumber(int cardNumber) {
			this.cardNumber = cardNumber;

		}

		//スートを設定する
		public void setSuit(Suit cardSuit) {
			this.cardSuit = cardSuit;
		}

	}

