package guessing_game;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Cardtest {
	
	@Test
	public void test1(){
		Card card =new Card();
		card.setNumber(1);
		
		assertThat(card.getNumber(),is(1));
	}
	
	@Test
	public void test2(){
		Card card =new Card();
		card.setSuit(Suit.HEART);
		
		assertThat(card.getSuit(),is(Suit.HEART));
	}

}
