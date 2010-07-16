import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Game {


	public int compareHands(String leftHand, String rightHand) {
		Character leftBest = findHighCardInHand(leftHand.split(" "));
		Character rightBest = findHighCardInHand(rightHand.split(" "));
		return leftBest.compareTo(rightBest);
	}

	private char findHighCardInHand(String[] leftList) {
		int i;
		char leftBest = 0;
		for (i=0; i<leftList.length; ++i)
			if (leftList[i].charAt(0) > leftBest)
				leftBest = leftList[i].charAt(0);
		return leftBest;
	}
	

}
