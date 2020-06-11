package guessing_game;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class GameTest {

	Game game;
	@Test
	public void test1_1() {
		game = new Game();
		int actual = game.selectReferee();
		int expected = 1;
		assertThat(actual, is(expected));
		
	}

	@Test
	public void test1_2() {
		game = new Game();
		int actual = game.selectReferee();
		int expected = -1;
		assertThat(actual, is(expected));
		
	}

	@Test
	public void test2_1() {
		game = new Game();
		int actual = game.selectNOP();
		int expected = 1;
		assertThat(actual, is(expected));
		
	}

	@Test
	public void test2_2() {
		game = new Game();
		int actual = game.selectNOP();
		int expected = -1;
		assertThat(actual, is(expected));
		
	}
}
