package guessing_game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CardStackTest {
	public static class testCardStack_乱数確認 {

		CardStack cardstack = new CardStack();

		@Test
		public void testCardStack_01乱数確認() {

			Card c1 = cardstack.draw();
			Card c2 = cardstack.draw();
			Card c3 = cardstack.draw();
			Card c4 = cardstack.draw();
			Card c5 = cardstack.draw();

			boolean actual;

			if (c1 != c2 && c2 != c3 && c3 != c4 && c4 != c5) {
				actual = true;
			} else {
				actual = false;
			}

			boolean expected_result = true;

			assertThat(actual, is(expected_result));

		}
	}

}
