
public class HumanPlayer extends Player{
	//constructor
	public HumanPlayer(Pokemon a, Item b) {
		super(a,b);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//player ran away
		System.out.println("Player 1 ran away!\nComputer Wins!");
		System.exit(1);
	}
	
}
