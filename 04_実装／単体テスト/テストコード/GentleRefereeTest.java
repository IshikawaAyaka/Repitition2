package guessing_game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GentleRefereeTest {
	GentleReferee g;
	
	@Test
	public void test1_1() {
		CardStackStab stab = new CardStackStab();
		g = new GentleReferee(stab);
		g.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(5);
		card.setSuit(Suit.CLUB);
		
		boolean test_1_1 = g.judge(card);

		// 検証
		assertThat(test_1_1, is(true));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test1_2() {
		CardStackStab stab = new CardStackStab();
		g = new GentleReferee(stab);
		g.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(3);
		card.setSuit(Suit.DIAMOND);
		
		boolean test_1_2 = g.judge(card);

		// 検証
		assertThat(test_1_2, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test2_1() {
		CardStackStab stab = new CardStackStab();
		g = new GentleReferee(stab);
		g.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(5);
		card.setSuit(Suit.CLUB);
		
		boolean test_2_1 = g.judge(card);

		// 検証
		assertThat(test_2_1, is(true));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test2_2() {
		CardStackStab stab = new CardStackStab();
		g = new GentleReferee(stab);
		g.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(4);
		card.setSuit(Suit.SPADE);
		
		boolean test_2_2= g.judge(card);

		// 検証
		assertThat(test_2_2, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}
	
	@Test
	public void test2_3() {
		CardStackStab stab = new CardStackStab();
		g = new GentleReferee(stab);
		g.setAnswerCard();
		// 実行
		Card card = new Card();
		card.setNumber(8);
		card.setSuit(Suit.DIAMOND);
		
		boolean test_2_3= g.judge(card);

		// 検証
		assertThat(test_2_3, is(false));
		// （必要であれば）後処理
		System.out.println("");
	}

}
