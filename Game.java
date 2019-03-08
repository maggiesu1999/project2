import java.util.Scanner;
import java.util.Random;

public class Game {
	Scanner scan = new Scanner(System.in);
	Random randGen = new Random();
	int userChoice;
	int round = 1;
	
	public static void main(String[] args) {
		System.out.println("Welcome to TTY Golf!");
		System.out.println("Please select a course:" + "\n" + "1. Genesee Valley Park North Course" + 
				   "2. The Old Course at St.Andrews");
		userChoice = scan.nextInt();
		System.out.println("Your choice [1-2]: " + userChoice);
		if (userChoice == 1){
			System.out.println("You are playing at Genesee Valley Park North Course");
		}
		else{
			System.out.println("You are playing at The Old Course at St.Andrews");
		
			
	        if (round = 1){
		System.out.println("You are at the 1st tee." + )
		}
		
	}

}
