import java.util.ArrayList;
import java.util.Scanner;

public class PokemonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner object
		Scanner input = new Scanner(System.in);
		//Create a set of attacks for Charmander
		ArrayList<Attack> cAttack = new ArrayList<Attack>();
		cAttack.add(new Attack("Punch", "Normal", 0, 5));
		cAttack.add(new Attack("Cut", "Normal", 5, 12));
		cAttack.add(new Attack("Fire Spin", "Fire", 10, 20));
		cAttack.add(new Attack("Inferno", "Fire", 20, 40));
		
		//Create a set of attacks for Bulbasaur
		ArrayList<Attack> bAttack = new ArrayList<Attack>();
		bAttack.add(new Attack("Punch", "Normal", 0, 5));
		bAttack.add(new Attack("Cut", "Normal", 5, 12));
		bAttack.add(new Attack("Seed Bomb", "Grass", 10, 24));
		bAttack.add(new Attack("Solar Beam", "Grass", 25, 50));
		
		//create our pokemons and send their movesets
		Pokemon Char = new Charmander(cAttack);
		Pokemon Bulb = new Bulbasaur(bAttack);
		
		//create our items
		Item hpPotion = new healthPotion(1);
		Item ppPotion = new powerPotion(1);
		
		//Initialize our player and computer
		Player player1 = new HumanPlayer(Char, hpPotion);
		Player comp = new ComputerPlayer(Bulb, ppPotion);
		
		//print player1's pokemon and item
		System.out.println("\nPlayer 1's Pokemon: " + player1.getPokemon().getName());
		System.out.println("Player 1's Item: Health Potion");
		
		//print computer's pokemon and item
		System.out.println("Computer's Pokemon: " + comp.getPokemon().getName());
		System.out.println("Computer's Item: Power Potion");
		
		//Start our game, loop until one of the pokemon faint
		while(player1.getPokemon().getHitPoints() > 0 && comp.getPokemon().getHitPoints() > 0) {
			//print out our players stats
			System.out.println("Player 1's stats");
			System.out.println("HP: " + player1.getPokemon().getHitPoints());
			System.out.println("PP: " + player1.getPokemon().getPowerPoints());
			
			System.out.println("Computer's stats");
			System.out.println("HP: " + comp.getPokemon().getHitPoints());
			System.out.println("PP: " + comp.getPokemon().getPowerPoints());
			
			//option menu
			System.out.println("What will " + player1.getPokemon().getName() + " do?");
			System.out.println("Attack(1)\nUse Item(2)\nRun(3)");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.println("What attack will you use?");
				int i = 0;
				for(Attack a: cAttack) {
					System.out.println(i+ ") " + a.getName() + " Type: " + a.getType() + " Dmg: " + a.getBaseDamage() + " Cost: " + a.getCost());
					i++;
				}
				player1.getPokemon().attack(comp.getPokemon(), input.nextInt());
			}
			else if(choice == 2) {
				System.out.println("Player 1 uses Health Potion!");
				player1.getItem().use(player1.getPokemon());
			}
			else if(choice == 3){
				player1.run();
			}
			
			//computers turn
			System.out.println("\nComputer's Turn!");
			//variable that randomly picks computer's move 0-2
			int c = (int) (Math.random() * 3);
			if(c == 0) {
				//picks random attack size of attack set
				c = (int) (Math.random() * bAttack.size());
				comp.getPokemon().attack(player1.getPokemon(), c);
			}
			else if(c == 1) {
				System.out.println("Comp uses Power Potion!");
				comp.getItem().use(comp.getPokemon());
			}
			else if(c == 2){
				comp.run();
			}
		}
	}

}
