package GuesserGame;

import java.util.*;

public class Guesser {	
		int guessedNum = 0;
		Random random = new Random();
		public int guesserNum() {
			guessedNum = random.nextInt(10)+ 1;
			return guessedNum;
		}
		
}
