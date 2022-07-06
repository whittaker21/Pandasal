
public class Priest extends Character {
	
	public static final String klass = "Priest"; 
	public static int dmg = 5;
	public static int health = 100;
	
	
	Priest(){
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
