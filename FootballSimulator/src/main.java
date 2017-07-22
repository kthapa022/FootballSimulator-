
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game gm= new Game(41,1);
		int team1=0;
		int team2=0;
		int i=0;
		System.out.println(gm.diff);
		System.out.println(gm.probability );
		
		while (i<1000){
		
		if(gm.whoWouldWinHomeAway() == 1){
			team1++;
		}else{
			team2++;
		}
		i++;
		}
		System.out.println("Home and away");
		System.out.println("team1: "+ team1);
		System.out.println("team2: "+ team2);

		
		i=0;
		team1=0;
		team2=0;
		while (i<1000){
			if(gm.whoWouldWinNeutral() == 1){
				team1++;
			}else{
				team2++;
			}
			i++;
		}
		System.out.println("Neutral");
		System.out.println("team1: "+ team1);
		System.out.println("team2: "+ team2);
		
	}
}
