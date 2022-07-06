import java.util.concurrent.TimeUnit;

public class IODriver {

	public static void classChoice() {
		System.out.println("Choose your Class: \n"
	    		+ "1: Warrior \n"
	    		+ "2: Mage \n"
	    		+ "3: Archer \n"
	    		+ "4: Assassin \n"
	    		+ "5: Priest \n");
	};
	
	
	public static void preInfo(Character toon) {
		loadingDia();
		System.out.println("You have choosen: " + toon.getRole()+"\n" 
						  + "Your Name is: " + toon.getName() + "\n");
		loadingDia();
		System.out.println("\t" + toon.getName() + ", From the Northern land of ice. You start "
										  + "your never ending journey now!");
		System.out.println("\tAs an " + toon.getRole() + " You will find many advantages and disadvantages but, "
				                                     + "remember you are only as weak as your will!\n");
		};
	
	public static void greeting() {
		loadingDia();
		System.out.println("\tWelcome weary travler to the Island of Pandasal! \n"
				+ "\tDuring your adventure you will encounter numerous monsters and  find many hidden treasures \n"
				+ "\tTake your time and stay as long as you like! \n");
		
	};
	
	public static void loadingDia(){
		System.out.println("Loading...........");
		sleepyBig();
		System.out.println("..................\n");
		sleepyLil();
		System.out.println("..................\n");
		sleepyLil();
	    System.out.println("..................\n");
	    sleepyLil();
	};
	
	public static void sleepyLil() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	public static void sleepyBig() {
		try {
			TimeUnit.SECONDS.sleep(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}
