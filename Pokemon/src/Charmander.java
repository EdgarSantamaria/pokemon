import java.util.ArrayList;

public class Charmander extends Pokemon{
	
	//construct charmander
	public Charmander(ArrayList<Attack> attacks) {
		super("Charmander", "Fire", 100, 70, attacks);
	}

	@Override
	public void attack(Pokemon other, int attackIndex) {
		// TODO Auto-generated method stub
		//checks if pokemon has enough pp
		if(attacks.get(attackIndex).getCost() <= getPowerPoints()) {
			System.out.println(getName() + " used " + attacks.get(attackIndex).getName() + ".\n");
			setPowerPoints(getPowerPoints() - attacks.get(attackIndex).getCost());
			//check for very effective 
			if(other.getType().equals("Bug") ||other.getType().equals("Grass")|| other.getType().equals("Ice")) {
				System.out.println("It's super effective!");
				System.out.println("-" + attacks.get(attackIndex).getBaseDamage()*2);
				other.setHitPoints(other.getHitPoints()-(attacks.get(attackIndex).getBaseDamage()*2));
			}
			//checks for not very effective
			else if(other.getType().equals("Rock") || other.getType().equals("Water")){
				System.out.println("Not very effective.");
				System.out.println("-" + attacks.get(attackIndex).getBaseDamage()/2);
				other.setHitPoints(other.getHitPoints()-(attacks.get(attackIndex).getBaseDamage()/2));
			}
			//else normal dmg, fire does not have 'no effect' against any type
			else {
				System.out.println("-" + attacks.get(attackIndex).getBaseDamage());
				other.setHitPoints(other.getHitPoints()-(attacks.get(attackIndex).getBaseDamage()));
			}
		}
		else {
			System.out.println("Charmander does not have enough power points!\n");
		}
		//checks if the other pokemon has fainted
		if(other.getHitPoints() <= 0) {
			System.out.println(other.getName() + " has fainted.\n" + getName() + " wins!.");
			System.exit(1);
		}
	}

	//pokemon speaks
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

}
