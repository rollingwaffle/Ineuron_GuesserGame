package GuesserGame;

class Umpire {
	int numFromGuesser;
	 int numFromP1;
	 int numFromP2;
	 int numFromP3;
    public void validate() {
    	Guesser guesser = new Guesser();
		Players players = new Players();
		Umpire umpire = new Umpire();
		
		int numFromGuesser = guesser.guesserNum();
		System.out.println(numFromGuesser);
		
		int numFromP1 = players.numOfP1();
		umpire.numGOL(numFromP1,numFromGuesser);
		
		int numFromP2 = players.numOfP2();
		umpire.numGOL(numFromP2,numFromGuesser);
		
		int numFromP3 = players.numOfP3();
		umpire.numGOL(numFromP3,numFromGuesser);
		
		System.out.println(numFromP1);
		System.out.println(numFromP2);
		System.out.println(numFromP3);
		
		boolean correctAns = false;
		
		boolean bothWon = false;
		boolean bothLost = false;
			
			if (numFromP1 == numFromGuesser) {
				correctAns = true;
				if (numFromGuesser == numFromP2 && numFromGuesser == numFromP3) {
					System.out.println("All the players guessed right");
					
					System.out.println("Lets start again");
					
					validate();
					
				}else if (numFromP2 == numFromGuesser) {
					 bothWon = true;
					 bothLost = true;
					
					System.out.println("Player 1 and player 2 were both correct it's a tie, player 3 is out of the game");
					System.out.println("Let's start game between player 1 and player 2");
				
					while(bothWon == true || bothLost == true) {
					
					int numFromGuesser1 = guesser.guesserNum();
					System.out.println(numFromGuesser1);
					
					int numFromPlay1 = players.numOfP1();
					umpire.numGOL(numFromPlay1,numFromGuesser1);
					int numFromPlay2 = players.numOfP2();
					umpire.numGOL(numFromPlay2,numFromGuesser1);
					
					validate(numFromGuesser1, numFromPlay1, numFromPlay2, 1, 2);
					
					if (numFromPlay1 == numFromGuesser1 && numFromPlay2 == numFromGuesser1) {
						bothWon  = true;
						System.out.println("Both were correct, let's start again");
					}else if (numFromPlay1 != numFromGuesser1 && numFromPlay2 != numFromGuesser1) {
						bothLost = true;
						System.out.println("Both were incorrect, let's start again");
					}else {
						 bothWon = false;
						 bothLost = false;
					}
				}
					
					
					
				} else if (numFromP3 == numFromGuesser) {
					 bothWon = true;
					 bothLost = true;
					System.out.println("Player 1 and player 3 were both correct it's a tie, player 2 is out of the game");
					System.out.println("Let's start game between player 1 and player 3");
					
					while(bothWon == true || bothLost == true) {
						
						int numFromGuesser1 = guesser.guesserNum();
						System.out.println(numFromGuesser1);
						
						int numFromPlay1 = players.numOfP1();
						umpire.numGOL(numFromPlay1,numFromGuesser1);
						int numFromPlay2 = players.numOfP3();
						umpire.numGOL(numFromPlay2,numFromGuesser1);
						
						validate(numFromGuesser1, numFromPlay1, numFromPlay2, 1, 3);
						
						if (numFromPlay1 == numFromGuesser1 && numFromPlay2 == numFromGuesser1) {
							bothWon  = true;
							System.out.println("Both were correct, let's start again");
						}else if (numFromPlay1 != numFromGuesser1 && numFromPlay2 != numFromGuesser1) {
							bothLost = true;
							System.out.println("Both were incorrect, let's start again");
						}else {
							 bothWon = false;
							 bothLost = false;
						}
					}
					
					
				}else {
					System.out.println("player 1 won the match");
				}
				
			}
			
			if (numFromP2 == numFromGuesser && numFromP1 != numFromGuesser) {
				correctAns = true;
				if (numFromP3 == numFromGuesser) {
					 bothWon = true;
					 bothLost = true;
					System.out.println("Player 2 and player 3 were both correct it's a tie, player 1 is out of the game");
					System.out.println("Let's start game between player 2 and player 3");
					
					while(bothWon == true || bothLost == true) {
						
						int numFromGuesser1 = guesser.guesserNum();
						System.out.println(numFromGuesser1);
						
						int numFromPlay1 = players.numOfP2();
						umpire.numGOL(numFromPlay1,numFromGuesser1);
						int numFromPlay2 = players.numOfP3();
						umpire.numGOL(numFromPlay2,numFromGuesser1);
						
						validate(numFromGuesser1, numFromPlay1, numFromPlay2, 2, 3);
						
						
						if (numFromPlay1 == numFromGuesser1 && numFromPlay2 == numFromGuesser1) {
							bothWon  = true;
							System.out.println("Both were correct, let's start again");
						}else if (numFromPlay1 != numFromGuesser1 && numFromPlay2 != numFromGuesser1) {
							bothLost = true;
							System.out.println("Both were incorrect, let's start again");
						}else {
							 bothWon = false;
							 bothLost = false;
						}
					}
					
					
					
				}else {
					System.out.println("Player 2 won the match");

				}
			}
			
			if (numFromP3 == numFromGuesser && numFromP1 != numFromGuesser && numFromP2 != numFromGuesser ) {
				correctAns = true;
				System.out.println("Player 3 won the match");
			}
			if (correctAns == false) {
				System.out.println("No one gave the correct answer");
			}
		}
    
	     void numGOL(int num,int numFromGuesser) {
			if (num < numFromGuesser) {
				System.out.println("The number is bigger than guessed number");
			}else if (num > numFromGuesser) {
				System.out.println("The number is smaller than the guessed number");
			}
	    }
	     
	     
	    void validate(int numFromGuesser1,int numFromP1,int numFromP2,int i,int j) {
	    	if (numFromP1 == numFromGuesser1) {
	    		if (numFromP2 == numFromGuesser1) {
					System.out.println("player " + i + " and player " + j + " were both correct it's a tie");
				}else {
					System.out.println("player " + i + " won the match");
				}
			
			}
	    	
	    	else if (numFromP2 == numFromGuesser1) {
	    		System.out.println("player " + j + " won the match");
			}
	    }
	     
	     
	}
    
 
public class LaunchUmpire{
	public static void main(String[] args) {
		
		Umpire umpire = new Umpire();
		umpire.validate();
	}
}