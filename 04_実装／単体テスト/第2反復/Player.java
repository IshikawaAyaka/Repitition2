package guessing_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {
	private String name;

	public Player(String name) {
		this.setName(name);
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


	//カードを選ぶ
	public int[] selectCard() {
		System.out.println("数とスートを入力してください");
		System.out.println("---");
		System.out.println("* 入力例 : 数 [半角スペース] スート ");
		System.out.println("【スートの入力 】 0:スペード, 1:ハート, 2:ダイヤ, 3:クラブ ");
		System.out.println("---");
		int[] ret = new int[2];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			String[] numbersStr = input.split(" ");
			for (int i = 0; i < numbersStr.length; i++) {
				ret[i] = Integer.parseInt(numbersStr[i]);
			}
			return ret;
		}catch(Exception e) {
			ret[0] = -1;
			ret[1] = -1;
			return ret;
		}
	
	}

	//名前の取得
	public String getName() {
		return name;
	}

	//名前の設定
	public void setName(String name) {
		this.name = name;
	}
}
