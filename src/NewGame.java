import java.util.Scanner;

public class NewGame {
	public static int number = 0;
	public CharacterCreation mainChar = new CharacterCreation();
	public Character toon;
	public Scanner sc = new Scanner(System.in);
	public IODriver drive;
	
	public void startGame() {
		
		do {
			IODriver.classChoice();
			number = sc.nextInt();
			
			if(number > 0 && number <= 5 ) {
				toon = mainChar.create(number, sc);	
				IODriver.preInfo(toon);
				IODriver.greeting();
			}else
				System.out.println("Please pick a number 1 thru 5 \n");
			
		}while(number < 0 || number > 5);
	}
	
}
