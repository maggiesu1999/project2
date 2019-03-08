import java.util.Scanner;
import java.util.Random;

public class Game {
	
	public static void main(String[] args) {
		//set up scanner, random generator, and variables
		
		Scanner scan = new Scanner(System.in);
		Random randGen = new Random();
		int course, club;
		int round = 1;
		int power;
		int userDistance,putting;
		int trial = 0;
		int times = 1;
		
		Genesee[] geneseeHoles = Genesee.generateHoles();
		GolfClub[] clubArray = GolfClub.generateClub();
		Power[] powerArray = Power.generatePower();
		//choose course
		System.out.println("Welcome to TTY Golf!");
		System.out.println("Please select a course:" + "\n" + "1. Genesee Valley Park North Course" + 
				   "2. The Old Course at St.Andrews");
		System.out.print("Your choice [1,2]: ");
		course = scan.nextInt();
		if (course == 1){
			System.out.println("\n" + "You are playing at Genesee Valley Park North Course");
		}
		else{
			System.out.println("\n" + "You are playing at The Old Course at St.Andrews");
		}
		
	    for(int i =0; i>=0; ++i) {
	    	System.out.println("Hole No.1: shot No." + times + " " + geneseeHoles[0]);
	    	System.out.println("Choose your club [1-10]: ");
	    	club = scan.nextInt();
	    	
	    	System.out.println("Power [1-10]: ");
	    	power = scan.nextInt();
	    	userDistance = clubArray[club-1].nextDistance(power);
	    	System.out.println("You hit " + userDistance + " yards.");
	    	
	    	if (geneseeHoles[0].getYards()-userDistance > 20) {
	    		System.out.println(geneseeHoles[0].getYards()-userDistance + " yards to the hole.");
	    		System.out.println("You are in the fairway.");
	    		times++;
	    	}
	    	else if (1<(geneseeHoles[0].getYards()-userDistance)&&(geneseeHoles[0].getYards()-userDistance)<20) {
	    		System.out.println("Shot No." + times + " You are on the green");
	    		System.out.println("Power [1-10]: ");
		    	power = scan.nextInt();
		    	putting = powerArray[power-1].nextDistance();
		    	times++;
		    	if(Math.abs((geneseeHoles[0].getYards()-userDistance))<1) {
		    		System.out.println("It's in the hole!!!!!!!!");
		    		i = -1;
		    		times++;
		    	}
	    	}
	    }	
	    		
	    	
	    	
	    	
	    }
		
		//print 1st hole
		//choose club[1-10]
		//choose power[1-10]
		//"You hit the ball " + x yards. Nice!
		
		/* 
		 * if branch
		 * range "You are in the fairway"
		 * range "You are on the green"
		 * range "You made par on this hole"
		 *  
		 */
		
		//your score after the first hole is: par.
		
		//Type RETURN to continue to the next hole
		
		
		
	

}
