package guessing_game;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Before;

public class TurnTest {

	@Test
	public void test1_1(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkNumber(0);
		assertThat(a,is(false));
	}
	
	@Test
	public void test1_2(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkNumber(14);
		assertThat(a,is(false));
	}
	
	@Test
	public void test1_3(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkNumber(1);
		assertThat(a,is(true));
	}
	
	@Test
	public void test1_4(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkNumber(13);
		assertThat(a,is(true));
	}
	
	@Test
	public void test2_1(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkSuit(-1);
		assertThat(a,is(false));
	}
	
	@Test
	public void test2_2(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkSuit(4);
		assertThat(a,is(false));
	}
	
	@Test
	public void test2_3(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkSuit(0);
		assertThat(a,is(true));
	}
	
	@Test
	public void test2_4(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.checkSuit(3);
		assertThat(a,is(true));
	}
	
	@Test
	public void test4_1(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.requestCard();
		assertThat(a,is(false));
	}
	
	@Test
	public void test4_2(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.requestCard();
		assertThat(a,is(false));
	}
	
	@Test
	public void test4_3(){
		Player player=new Player("Player");
		Turn turn=new Turn(player);
		boolean a=turn.requestCard();
		assertThat(a,is(true));
	}
}
