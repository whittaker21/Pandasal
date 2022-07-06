
public class Warrior extends Character {
	
	//variables
	final public static String klass = "Warrior";
	final public static int baseDmg = 3;
	final public static int health = 120;
	
	
	//constructor
	Warrior(){		
		super(health, baseDmg, klass);
	};
	
	//methods
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
	
	public void speak() {
		System.out.println("I am a Warrior");
	}



}
