import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCreation {
public Character player1, player2, player3, player4, player5;
public ArrayList<Character> arList = new ArrayList<Character>();



public Character create(int p, Scanner sc) {
	
	arList.add(this.player1 = new Warrior());
	arList.add(this.player2 = new Mage());
	arList.add(this.player3 = new Archer());
	arList.add(this.player4 = new Assassin());
	arList.add(this.player5 = new Priest());
	
	
	//binding Character to a name
	Character newToon = arList.get(p-1);
	
	//clearing the token
	String a = sc.nextLine();

accountSync(newToon, setUserInput(sc));
return newToon;
};

public Character accountSync(Character toon, String userName) {
	toon.setName(userName);
	return toon;
};

public String setUserInput(Scanner sc) {
	System.out.print("\nInput a Username: ");
	String username = sc.nextLine();
	return username;
};

}
