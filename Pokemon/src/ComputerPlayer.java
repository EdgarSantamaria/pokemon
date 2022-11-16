
public class ComputerPlayer extends Player{
	
	//constructor
	public ComputerPlayer(Pokemon a, Item b) {
		super(a,b);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//computer ran away
		System.out.println("Computer ran away!\nPlayer 1 Wins!");
		System.exit(1);
	}

}
