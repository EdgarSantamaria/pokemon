
public abstract class Player {
	//variables
	protected Pokemon pokemon;
	protected Item item;
	
	public Player(Pokemon p, Item i) {
		pokemon = p;
		item = i;
	}
	
	//abstract method
	public abstract void run();

	//accessor methods for pokemon and item
	public Pokemon getPokemon() {
		return pokemon;
	}

	public Item getItem() {
		return item;
	}
	
}
