package guessing_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public int selectReferee() {
		System.out.println("�R����I��ŉ����� ");
		System.out.println("---");
		System.out.println("* ���͗� : 1:�������R��, 2:�₳�����R�� ");
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



	public int[] selectCard() {
		System.out.println("���ƃX�[�g����͂��Ă�������");
		System.out.println("---");
		System.out.println("* ���͗� : �� [���p�X�y�[�X] �X�[�g ");
		System.out.println("�y�X�[�g�̓��� �z 0:�X�y�[�h, 1:�n�[�g, 2:�_�C��, 3:�N���u ");
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
}
