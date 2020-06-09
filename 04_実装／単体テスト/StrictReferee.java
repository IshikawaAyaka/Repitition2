public class StrictReferee extends Referee {

	public StrictReferee(CardStack card) {

	}

	public boolean judge(Card card) {
		return false;
	}

}
