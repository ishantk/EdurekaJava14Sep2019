
public class Problem {

	public static void main(String[] args) {
		
		int[][] votes = {
						//   0	  1   2   3   4	
							{126, 230, 32, 21,  200},			// 0 index -> Democratic Party
							{152, 85, 121, 215, 313}			// 1 index -> Republican Party
					    };
		
		int demVoteCount = 0;
		int repVoteCount = 0;
		
		for(int i=0;i<5;i++) {
			demVoteCount = demVoteCount + votes[0][i];
			repVoteCount = repVoteCount + votes[1][i];
			
		}
		

		System.out.println(">> Democratic Party Vote Count: "+demVoteCount);
		System.out.println(">> Republican Party Vote Count: "+repVoteCount);
		
		if(demVoteCount > repVoteCount) {
			System.out.println(">> Democratic Party Won by "+ (demVoteCount-repVoteCount)+" votes");
		}else {
			System.out.println(">> Republican Party Won by "+ (repVoteCount - demVoteCount)+" votes");
		}
		
	}

}
