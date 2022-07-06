
public class Archer extends Character {
	
	public static final String klass = "Archer";
	public static int dmg = 7;
	public static int health = 75;
	
	
	Archer(){
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
