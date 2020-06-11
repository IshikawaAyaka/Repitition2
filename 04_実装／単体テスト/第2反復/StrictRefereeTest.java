package guessing_game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StrictRefereeTest {
	StrictReferee s;
	
	@Test
	public void test1_1() {
		CardStackStab stab = new CardStackStab();
		s = new StrictReferee(stab);
		s.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(5);
		card.setSuit(Suit.CLUB);
		
		boolean test_1_1 = s.judge(card);

		// 検証
		assertThat(test_1_1, is(true));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_2() {
		CardStackStab stab = new CardStackStab();
		s = new StrictReferee(stab);
		s.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(5);
		card.setSuit(Suit.DIAMOND);
		
		boolean test_1_2 = s.judge(card);

		// 検証
		assertThat(test_1_2, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_3() {
		CardStackStab stab = new CardStackStab();
		s = new StrictReferee(stab);
		s.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(3);
		card.setSuit(Suit.CLUB);
		
		boolean test_1_3 = s.judge(card);

		// 検証
		assertThat(test_1_3, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_4() {
		CardStackStab stab = new CardStackStab();
		s = new StrictReferee(stab);
		s.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(3);
		card.setSuit(Suit.DIAMOND);
		
		boolean test_1_4 = s.judge(card);

		// 検証
		assertThat(test_1_4, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}

}
