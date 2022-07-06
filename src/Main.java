/*
 * This is a mini game called Pandasal
 * Created By: Preston Whittaker
 * Last Updated: 10/26/2021
 * 
 */

import java.util.Scanner;


public class Main {
	
static public Scanner sc = new Scanner(System.in);
static public int option = 0;
public static NewGame game = new NewGame();


	public static void main(String[] args) {
         
		System.out.println("\n\nWELCOME TO PANDASAL HERO");
		
		do {
			
		System.out.println("Options Choose: \n"
	    		+ "1: Start New Game\n"
	    		+ "2: Load Game\n"
	    		+ "3: Game Information\n"
	    		+ "4: In-game Store\n"
	    		+ "5: Exit\n");
		switch(option = sc.nextInt()) {
		case 1: 
			System.out.println("Starting Game........\n\n");
			game.startGame();
			break;
		case 2: 
			System.out.println("Load Game is a WIP\n\n");
			break;
		case 3: 
			System.out.println("Game Information is a WIP\n\n");
			break;
		case 4: 
			System.out.println("In-game store is currently closed\n\n");
			break;
		case 5: 
			System.out.println("Now Exiting Game.......\n\n");
			break;
			default:
				System.out.println("Please Choose an option between 1 and 5");
			
		}
		
		}while(option != 5);

	}

}
