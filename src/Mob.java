
public class Mob extends Character {
	
	public static final String klass = "Trash";
	public static int dmg = 3;
	public static int health = 25;
	
	Mob(){
		super(health, dmg, klass);
	};
	
	@Override
	public int attack(int dmg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
