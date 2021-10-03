
public class SnakeAndLadder {

	public static final int ladder=1;
	public static final int snake=2;
	
	public static void main(String[] args) {
	
		int POSITION=0;
		int diceCount=0;

	while (POSITION != 100) {       //repeat till reaches 100

		int dice=(int)Math.floor(Math.random() * 10)%6+1;  //to get random dice number

		if(dice>0) {
			diceCount++;         //gets nmuber of times dice is played
		}

                int options=(int)Math.floor(Math.random() * 10)%3;  //to get random 3 options to play

                System.out.println("Random dice number is " + dice);

        switch(options) {

        case ladder:
                System.out.println("Ladder");
                                POSITION+=dice;  //position is increased by random dice number

		if(POSITION>100){
		   POSITION-=dice;              //keeps on same position if greater than 100
		
		}
                                break;
        case snake:
                System.out.println("Snake");
                                POSITION-=dice;  //position is decresed by ramdom dice number
                                
                if (POSITION <0) {
                        POSITION=0;		//if value is less than zero sets to zero
                }
                                break;
        default:
                System.out.println("No Play");   //position remains same

                                break;

                                        }
        System.out.println("Players current position is " + POSITION );   //current position of player after play


	      }
	System.out.println();
	System.out.println("WooHoo!! you won the game");

	System.out.println("The number of times dice played is "+diceCount);

       	}

 }
