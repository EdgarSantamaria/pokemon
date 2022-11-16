
public class healthPotion implements Item{
	//variable to count how many potions
	private int count;
	//this item will add +20 hp to a pokemon
	//constructor
	public healthPotion(int c) {
		count = c;
	}

	@Override
	public void use(Pokemon p) {
		// TODO Auto-generated method stub
		//checks if there are potions
		if(count > 0) {
			System.out.println("+20 HP");
			p.setHitPoints(p.getHitPoints()+20);
			count--;	
		}
		else {
			System.out.println("No more potions");
		}
	}

}
