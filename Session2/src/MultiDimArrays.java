
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Array of Arrays : Multi Dimensional Array
		// as of now we have 3 arrays in an array with elements :)
		// Dimension : 2
		int[][] population = {
								// 0       1	 2	    3	  4
								{65342, 26431, 54331, 87764, 31321},	// 0
								// 0       1	 2	    3	  4
								{12342, 22341, 67331, 44764, 36781},	// 1
								// 0       1	 2	   
								{12321, 67835, 77331}					// 2
						     };
		

		System.out.println(">> population is "+population+" and length is: "+population.length); 		  // HashCode and 3
		
		System.out.println(">> population[0] is "+population[0]+" and length is: "+population[0].length); // HashCode and 5
		System.out.println(">> population[1] is "+population[1]+" and length is: "+population[1].length); // HashCode and 5
		System.out.println(">> population[2] is "+population[2]+" and length is: "+population[2].length); // HashCode and 3
		
		System.out.println(">> population[1][2] is: "+population[1][2]);  // 67331
		
		System.out.println("************************");
		
		
		for(int i=0;i<population.length;i++) {	// i : 0 1 and 2
			
			for(int j=0;j<population[i].length;j++) {	// when i is 0 : population[0].length -> 5 | j : 0 1 2 3 and 4  * when i is 1 : population[1].length -> 5 | j : 0 1 2 3 and 4 * when i is 2 : population[2].length -> 3 | j : 0 1 and 2    
				
				System.out.print(population[i][j]+"  "); // print prints in the same line
				
			}
			
			System.out.println(); // empty print line
		}
		
		System.out.println("************************");
		
		// Real Time Example for Multi Dim Arrays
		// {120, 200, 101} | RGB Value
		int[][] image = {
							{120, 200, 101},
							{220, 230, 151},
							{320, 100, 201}
						};
		// Mega Pixel
		// 1 Pixel means 1-D Arrays i.e. {120, 200, 101}
		// 2 MP Image -> 2 * 10 pow 6 pixels 
		
		// 3-D Array : Array of Array of Arrays
		int[][][] arr = {
							{
								{120, 200, 101},
								{220, 230, 151},
								{320, 100, 201}
							},
							{
								{120, 200, 101},
								{220, 230, 151},
								{320, 100, 201}
							}
				
						};
		
		
		System.out.println();
		
		// 10 1-D Arrays with each Array having 5 elements and all elements will be 0's
		int[][] votes = new int[10][5];
		
		votes[0][2] = 555;
		
		System.out.println("************************");
		
		
		for(int i=0;i<votes.length;i++) {	
			
			for(int j=0;j<votes[i].length;j++) {    
				
				System.out.print(votes[i][j]+"  ");
				
			}
			
			System.out.println(); // empty print line
		}
		
		System.out.println("************************");
		
		
		// HW: Iterate in 2-D Arrays with Enhanced For Loop :)
	}

}
