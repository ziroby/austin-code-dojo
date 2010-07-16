import java.util.Arrays;


public class Game {

	public String compareHands(String firstHand, String secondHand) {
		String[] firstCards = firstHand.split(" ");
		String[] secondCards = secondHand.split(" ");
		Arrays.sort(firstCards);
		Arrays.sort(secondCards);		
		if (firstCards[firstCards.length-1].compareTo(secondCards[secondCards.length-1]) < 0) 
		{
			return "second wins";
		}
		return "first wins";
	}

}
