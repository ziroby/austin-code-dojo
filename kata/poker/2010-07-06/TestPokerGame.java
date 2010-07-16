import junit.framework.Assert;
import junit.framework.TestCase;


public class TestPokerGame extends TestCase {
	
	private static final int RIGHT_PLAYER_WINS = -1;
	private static final int LEFT_PLAYER_WINS = 1;
	// Input: "7C 5H 4D 3D 2S", "7C 5H 4D 3D 2S"
	// output: first hand wins = 1, second hand wins = -1, tie = 0
	
	public void testLeftHandWinsWithEightHighAgainstSevenHigh() throws Exception {
		Game game = new Game();
		Assert.assertEquals(LEFT_PLAYER_WINS, game.compareHands("8C 5H 4D 3D 2S", "7C 4D 3H 5H 2S"));
	}
	
	public void testRightHandWinsWithEightHighAgainstSevenHigh() throws Exception {
		Game game = new Game();
		Assert.assertEquals(RIGHT_PLAYER_WINS, game.compareHands("7C 4D 3H 5H 2S", "8C 5H 4D 3D 2S"));
	}
	
	public void testLeftHandWinsWithEightHighAgainstSevenHighInADifferentOrder() throws Exception {
		Game game = new Game();
		Assert.assertEquals(LEFT_PLAYER_WINS, game.compareHands("5H 8C 4D 3D 2S", "7C 4D 3H 5H 2S"));
	}
	
}
