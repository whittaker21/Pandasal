
abstract class Character {
	private String name = "Empty";
	private String role = "Empty";
	private int health = 100;
	private int baseDmg = 5;
	
	// Constructor 
	Character(){	
	};
	
	Character(int health, int baseDmg, String role){
		this.role = role;
		this.health = health;
		this.baseDmg = baseDmg;
	};
	
	public void setName(String name) {
		this.name = name;
	};
	
	public String getName() {
		return this.name;
	};
	
	public String getRole() {
		return this.role;
	};
	
	
	// class/mob abilities 
	public abstract int attack(int dmg);
	public abstract void run();
	
	
	
	
}
