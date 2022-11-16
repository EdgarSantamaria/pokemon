import java.util.ArrayList;

public abstract class Pokemon {
	
	//variables
	protected String name;
	protected String type;
	protected int hitPoints, powerPoints;
	protected ArrayList<Attack> attacks =  new ArrayList<Attack>();
	
	//constructor
	public Pokemon(String n, String t, int hp, int pp, ArrayList<Attack> a) {
		name = n;
		type = t;
		hitPoints = hp;
		powerPoints = pp;
		attacks = a;
	}
	
	//abstract methods
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public int getPowerPoints() {
		return powerPoints;
	}
	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}
	
	
	
}
