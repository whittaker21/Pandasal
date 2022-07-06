
public class Mage extends Character{
	
	public static final String klass = "Mage"; 
	public static int baseDmg = 10;
	public static int health = 70;
	
	
	Mage(){
		super(health, baseDmg, klass);
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
	
	public void speak() {
		System.out.println("I am a Mage");
	}
	

}
