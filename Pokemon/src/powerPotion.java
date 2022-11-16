
public class powerPotion implements Item{
	//variable to count potions
	private int count;
	//this item adds +30 pp to a pokemon
	//constructor
	public powerPotion(int c) {
		count = c;
	}
	@Override
	public void use(Pokemon p) {
		// TODO Auto-generated method stub
		//checks if there are enough potions
		if(count > 0) {
			System.out.println("+30 PP");
			p.setPowerPoints(p.getPowerPoints()+30);
			count--;	
		}
		else {
			System.out.println("No more potions");
		}
	}
}
