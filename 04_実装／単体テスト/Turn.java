public class Turn {

	private Player playerName;

	private int numberX;

	private int suitX;

	private Player player;

	private Card card;

	public Turn(Player player) {

	}

	public boolean requestCard() {
		return false;
	}

	public boolean changeSuit(int x) {
		return false;
	}

	public boolean checkNumber(int y) {
		return false;
	}

}
