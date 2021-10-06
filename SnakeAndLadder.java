public class SnakeAndLadder {

	public static void main(String[] args) {

		int POSITION1 = 0;
		int POSITION2 = 0;
		int diceCountTotal = 0;
		int player = 1;                  //counter to change the player
		int player1DiceCount = 0;
		int player2DiceCount = 0;

		System.out.println("Player1 starts the game");

		while ((POSITION1 != 100) && (POSITION2 != 100)) {
			int dice=(int)Math.floor(Math.random() * 10)%6+1;       /*getting random dice number*/
			System.out.println("Random dice number is " + dice);

			if(dice > 0) {
				diceCountTotal++;
			}
			int options=(int)Math.floor(Math.random() * 10)%3;      /*getting three options to play*/
			if (player == 1 ) {
				if(options == 0) {
					System.out.println("Ladder");
					POSITION1 += dice;
					if(POSITION1 > 100) {                        
						/*if position after adding dice
						 *  gets greater than 100 
						 *  player remains on same position*/ 
						POSITION1 -= dice;
						player1DiceCount++;
						player = 2;
					} 
					player1DiceCount++;
					player = 1;
				}
				else if(options == 1){
					System.out.println("Snake");
					POSITION1 -= dice;
					if (POSITION1 <0) {                            /*if value less than zero sets to zero*/
						POSITION1=0;
						player1DiceCount++;
						player = 2;
					}

					player1DiceCount++;
					player = 2;	
				}
				else if(options == 2){
					System.out.println("No Play");
					player1DiceCount++;
					player = 2;


				}
				System.out.println("Player1 current position is " + POSITION1 );
			}
			else if (player == 2) {
				if(options == 0) {
					System.out.println("Ladder");
					POSITION2 += dice;
					if(POSITION2 > 100) {
						POSITION2 -= dice;
						player2DiceCount++;
						player = 1;
					} 
					player2DiceCount++;
					player = 2;
				}
				else if(options == 1){
					System.out.println("Snake");
					POSITION2 -= dice ;
					if (POSITION2 <0) {              //if value less than zero sets to zero
						POSITION2 = 0;
						player2DiceCount++;
						player = 1;
					}
					player2DiceCount++;
					player = 1;

				}
				else if(options == 2){
					System.out.println("No Play");
					player2DiceCount++;
					player = 1;

				}
				System.out.println("Player2 current position is " + POSITION2 );
			}
		}
		if(POSITION1 == 100) {
			System.out.println("WooHoo!! Player1 won the game");
			System.out.println("The dice count required for player1 to win is "+ player1DiceCount);
		}
		else {
			System.out.println("WooHoo!! Player2 won the game");
			System.out.println("The dice count required for player2 to win is "+ player2DiceCount);
		}
		System.out.println("The total number of times dice played is "+diceCountTotal);

	}
}
