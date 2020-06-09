package guessing_game;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	
	@Test
	public void test1_1() {
		Player player = new Player("A");
		int actual = player.selectReferee();
		int expected = 1;
		assertThat(actual,is(expected));
	}

	@Test
	public void test1_2() {
		Player player = new Player("A");
		int actual = player.selectReferee();
		int expected = -1;
		assertThat(actual,is(expected));
	}

	@Test
	public void test2_1() {
		Player player = new Player("A");
		int[] actual = player.selectCard();
		int[] expected = {1,1};
		assertThat(actual,is(expected));
	}

	@Test
	public void test2_2() {
		Player player = new Player("A");
		int[] actual = player.selectCard();
		int[] expected = {-1,-1};
		assertThat(actual,is(expected));
	}
}
