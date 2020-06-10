package guessing_game;

public class Game {

	private Player player;

	private Referee referee;

	private Turn turn;

	public void start() {
		//カードスタックの生成
		CardStack stack = new CardStack();
		
		//プレイヤーの生成
		player = new Player("A");
		
		//審判の選択
		while(true) {
			int refNum = player.selectReferee();
		if(refNum == 1) {
			referee = new StrictReferee(stack);
			break;
		}if(refNum == 2) {
			referee = new GentleReferee(stack);
			break;
		}else {
			System.out.println("1か2の数字を入力してください");
		}
		}
		
		//答えのカードの設定
		referee.setAnswerCard();
		
		boolean judgement = false;
		
		
		while(judgement == false) {
		//ターンの生成
		turn = new Turn(player);
			//数字、スートの入力
		boolean canSelect = false;
		while(canSelect == false) {
		canSelect = turn.requestCard();
		}
		//判定
		Card card = turn.getCard();
		judgement = referee.judge(card);
		}
		}
		
	}

}
