package guessing_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game {

	//プレイヤー
	private Player firstPlayer;
	private Player secondPlayer;

	//審判
	private Referee referee;

	//ターン
	private Turn turn;

	//プレイ人数
	private int nop;

	//ゲームの実行
	public void start() {
		//カードスタックの生成
		CardStack stack = new CardStack();
		
		//審判の選択
		while(true) {
			int refNum = selectReferee();
		if(refNum == 1) {
			referee = new StrictReferee(stack);
			break;
		}else if(refNum == 2) {
			referee = new GentleReferee(stack);
			break;
		}else {
			System.out.println("1か2の数字を入力してください");
			}
		}

		//答えのカードの設定
		referee.setAnswerCard();

		
		//プレイ人数の選択
		while(true) {
		nop = selectNOP();
		if(nop == 1) {
			firstPlayer = new Player();
			break;
		}else if(nop == 2) {
			firstPlayer = new Player("先攻");
			secondPlayer = new Player("後攻");
			break;
		}else {
			System.out.println("1か2の数字を入力してください");
			}
		}
		
		boolean judgement = false;
		Player player = firstPlayer;
		
		while(judgement == false) {
		//ターンの生成
		turn = new Turn(player);
		if(nop ==2 && player == firstPlayer) {
			System.out.print("先攻プレイヤーは");
		}else if(nop ==2 && player == secondPlayer) {
			System.out.print("後攻プレイヤーは");
		}
		//数字、スートの入力
		boolean canSelect = false;
		while(canSelect == false) {
		canSelect = turn.requestCard();
		}
		//判定
		Card card = turn.getCard();
		judgement = referee.judge(card);
		
		//プレイヤーの交代
		if (nop == 2 && judgement == false) {
			player = changePlayer(player);
			}
		}
		
		if (nop == 2) {
		showWinner(player);
			}
	}

	//審判を選ぶ
	public int selectReferee() {
		System.out.println("審判を選んで下さい ");
		System.out.println("---");
		System.out.println("* 入力例 : 1:厳しい審判, 2:やさしい審判 ");
		int ret;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
				ret = Integer.parseInt(input);
			return ret;

		}catch(Exception e) {
			ret = -1;
			return ret;
		}
	}

	//プレイ人数を選ぶ
	public int selectNOP() {
		System.out.println("プレイ人数を選んで下さい ");
		System.out.println("---");
		System.out.println("* 入力例 : 1:1人対戦, 2:2人対戦 ");
		int ret;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
				ret = Integer.parseInt(input);
			return ret;

		}catch(Exception e) {
			ret = -1;
			return ret;
		}
	}

	//プレイヤーの交代
	public Player changePlayer(Player player) {
		if (player == firstPlayer) {
			player = secondPlayer;
		}else {
			player = firstPlayer;
		}
		return player;
	}

	//勝者を表示
	public void showWinner(Player player) {
		System.out.println("勝者：" + player.getName());
		}
	}


