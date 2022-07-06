
public class Assassin extends Character {
	
	public static final String klass = "Assassin"; 
	final public static int dmg = 11;
	final public static int health = 60;
	
	
	Assassin(){
		super(health, dmg, klass);
	};

	@Override
	public int attack(int dmg) {
		int newDmg = 0;
		newDmg = newDmg + dmg;
		return newDmg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

}
