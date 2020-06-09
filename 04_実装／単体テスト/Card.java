package guessing_game;

public class Card {
	
	private static int MIN = 1;

	private static int MAX = 13;

	private int cardNumber;

	private Suit cardSuit;

	public Card() {

	}

	public int getNumber() {
		return cardNumber;
	}

	public Suit getSuit() {
		return cardSuit;
	}

	public int getMAX() {
		return MAX;
	}

	public int getMIN() {
		return MIN;
	}

	public void setNumber(int cardNumber) {
		this.cardNumber = cardNumber;

	}

	public void setSuit(Suit cardSuit) {
		this.cardSuit = cardSuit;
	}

}
