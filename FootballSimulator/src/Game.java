import java.util.Random;

public class Game {
	
	int rank_team1;
	int rank_team2;
	
	public Game(int r1, int r2){
		rank_team1=r1;
		rank_team2=r2;
	}
	
	public void whoWouldWin(){
		System.out.println("I am assuming that team1 is the team that is playing at home");
		Random rand= new Random();
		//Playing at home gives the home team a 5% increase chance in winning
		if(rank_team1 < rank_team2){
			int whoWillWin= rand.nextInt(100);
			System.out.println(whoWillWin);
			
			if(whoWillWin > 45){
				System.out.println("No shock here! Team 1 has won ");
				//return 1;
			}else{
				System.out.println("In a shock here, team 2 has won!!");
				//return 2;
			}
			
		}else{
			//Since team 1 is a lower team than team2, but team1 is playing at home. 
			//So their probability will go from 55% to 50%
			
			int whoWillWin= rand.nextInt(100);
			if(whoWillWin > 50){
				System.out.println(" Team 2 has won ");
				//return 2;
			}else{
				System.out.println(" team 1 has won!!");
			//	return 1;

			}
	
		}
		//System.out.println("end");
	}
	
	
}
