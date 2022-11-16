
public class Attack {
	//variables
	private String name, type;
	private int cost, baseDamage;
	
	//constructor
	public Attack(String n, String t, int c, int bd) {
		name = n;
		type = t;
		cost = c;
		baseDamage = bd;
	}
	
	//accessors
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}

	public int getCost() {
		return cost;
	}
	
	public int getBaseDamage() {
		return baseDamage;
	}
	
	
	
}
