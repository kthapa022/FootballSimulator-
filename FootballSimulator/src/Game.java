import java.util.Random;

public class Game {
	
	int rank_team1;
	int rank_team2;
	int diff;
	int probability;
	
	public Game(int r1, int r2){
		rank_team1=r1;
		rank_team2=r2;
		if(rank_team1 < rank_team2){
			diff= rank_team2- rank_team1;
		}else{
			diff= rank_team1- rank_team2;
		}
		
		if(diff<= 10){
			probability=50;
		}else if ((diff>10)&&(diff <=20) ){
			probability=45;
		}else if((diff > 20)&&(diff <= 30)){
			probability=40;
		}else if((diff > 30)&&(diff <= 40)){
			probability=35;
		}else if((diff > 40)&&(diff <= 50)){
			probability=30;
		}else if((diff > 50)&&(diff <= 60)){
			probability=25;
		}else if((diff > 60)&&(diff <= 70)){
			probability=20;
		}else if((diff > 70)&&(diff <= 80)){
			probability=15;
		}else if((diff > 80)){
			probability=10;
		}
		
	}
	
	public int whoWouldWinHomeAway(){		
		
		Random rand= new Random();
		//Playing at home gives the home team a 5% increase chance in winning
		int whoWillWin= rand.nextInt(100);

		
		if(rank_team1 < rank_team2){
			//team1 is home team and the better team
			
			//I take probability-5 because assuming difference is between 30 and 40.
			//probability will be 35, but since team1 has an advantage that number will go down to 30
			//Thus, the variable whoWillWIn has 70 chances to choose team1, and 30 chances for team2. 
			
			if(whoWillWin > (probability-5)){
			//	System.out.println("No shock here! Team 1 has won");
				return 1;
			}else{
				//System.out.println("In a shock here, team 2 has won!!");
				return 2;
			}
			
		}else{
			
			//Team2 is away team and the better team., i.e rank_team2<rank_team1
			
			
			//I take probability+5 because assuming difference is between 30 and 40.
			//probability will be 35, but since team1 has an advantage that number will go up to 40
			//Thus, the variable whoWillWIn has 40 chances to choose team1, and 60 chances for team2.
			
			if(whoWillWin < (probability+5)){
		//		System.out.println("Home advantage does count, and Team 1 has won");
				return 1;
			}else{
			//	System.out.println("Well good teams find a way to win and team 2 has won!!");
				return 2;

			}
	
		}
	}
	
	public int whoWouldWinNeutral(){
		Random rand= new Random();
		if(rank_team1 < rank_team2){
			int whoWillWin= rand.nextInt(100);
			//System.out.println("ream1<team2");
			if(whoWillWin > (probability)){
			//	System.out.println("Well team 2 has clinched the victory, somehow! ");
				return 1;
			}else{
			//	System.out.println("No surpise here, team 1 has won!");
				return 2;
			}
			
		}else{
			int whoWillWin= rand.nextInt(100);
			if(whoWillWin < (probability)){
			//	System.out.println("In a shock here, team 1 has won!!");

				return 1;
			}else{
			//	System.out.println("No shock here! Team 2 has won ");
				return 2;
			}
		}
	}
	
	
}
