package guessing_game;

public class CardStackStab extends CardStack{
		public CardStackStab() {
		}

		@Override
		public Card draw() {
			Card card = new Card();
			card.setNumber(5);
			card.setSuit(Suit.CLUB);
			return card;
		}
	

}
