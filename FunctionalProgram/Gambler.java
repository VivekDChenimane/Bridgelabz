package FunctionalProgram;
import java.util.Scanner;
public class Gambler {
		public static void Gambling(int stake, int goal, int trials){
			int loss=0;
			int bets=0;
			int wins=0;
			for (int t = 0 ; t < trials ; t++) {						
				int cash = stake;					
				while (cash > 0 && cash < goal) {
   					bets++;		
					if (Math.random() < 0.5)
						cash++;
					else							
						cash--;            
				}
				if (cash == goal)
					wins++;							
				else	        	
					loss++;
							
			}
			System.out.println(wins + " wins of " + trials);
			double won= ( 100.0 * wins )  / trials;			
			System.out.println("Percent of games won = "+ won);
			System.out.println(loss +" loss of " + trials );
			double lose =( 100.0 * loss ) / trials;
			System.out.println("Percent of games lose = "+ lose);
			System.out.println("Number of bets: "+ bets);	
			}
		
		public static void main (String[] args){ 
	    	 Scanner scan = new Scanner(System.in);	     
	    	 System.out.print("enter player's stake");	     
	    	 int stake= scan.nextInt();
	    	 System.out.print("enter player's goal");	     
	    	 int goal= scan.nextInt();	     
	    	 System.out.print("enter player's trials");	     
	    	 int trials= scan.nextInt();	     
	    	 Gambling(stake,goal,trials);
	    	 scan.close();
	}
}
