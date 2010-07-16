import org.junit.Test;
import static org.junit.Assert.*; 
import static org.hamcrest.CoreMatchers.*;

public class TestPokerHandComparison {
	
	// Input: Two strings for five-card hands
	// where each card is "<rank><suit> ".
	@Test 
	public void testFirstHandHigherCards() {
		Game game = new Game();
		assertFirstHandWins(game,"9H 8C 7S 6H 4C","2S 3H 4C 5D 7C");		
	}
	
	@Test
	public void testSecondHandHigherCards(){
		Game game = new Game();
		assertSecondHandWins(game, "2S 3H 4C 5D 7C","9H 8C 7S 6H 4C");
	}
	
	@Test
	public void testFirstHandWinsWithADifferentOrdering()
	{
		Game game = new Game();
		
		assertFirstHandWins(game, "6H 7S 8C 9H 4C", "7C 2S 3H 4C 5D");
	}
	
	@Test
	public void testHighCardCompare() {
		Game game = new Game();
		assertSecondHandWins(game, "6H 7S 8C 3H 4C", "2H 9S 8C 4S 5C");
	}
	
	@Test
	public void testCardsWithTheSameRankButDifferentSuitsTie(){
		assertThat(new Game().compareHands("6D 7H 8D 3S 4D", "6H 7S 8C 3H 4C"), is("tie"));
	}
	
	public void assertFirstHandWins(Game game,String firstHand,String secondHand){
		assertThat(game.compareHands(firstHand,secondHand), is("first wins"));
		assertThat(game.compareHands(secondHand,firstHand), is("second wins"));
	}
	
	public void assertSecondHandWins(Game game, String firstHand, String secondHand) {
		assertThat(game.compareHands(firstHand,secondHand), is("second wins"));
		assertThat(game.compareHands(secondHand,firstHand), is("first wins"));
	}
}
