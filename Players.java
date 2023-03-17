package GuesserGame;

import java.util.Scanner;

public class Players {
	int numOfP1;
	int numOfP2;
	int numOfP3;
	
	Scanner scanner  = new Scanner(System.in);
	
	public int numOfP1() {
		System.out.println("Player 1, Guess the number");
		numOfP1 = scanner.nextInt();
		return numOfP1;
	}
	
	public int numOfP2() {
		System.out.println("Player 2, Guess the number");
		numOfP2 = scanner.nextInt();
		return numOfP2;
	}
	
	public int numOfP3() {
		System.out.println("Player 3, Guess the number");
		numOfP3 = scanner.nextInt();
		return numOfP3;
	}
}
