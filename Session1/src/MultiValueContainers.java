// class is a way of creating a java program
// we need a class to create a java program. It is mandatory
public class MultiValueContainers {

	// In the block of class we need to have main method
	// main will execute our instructions written in it :)
	public static void main(String[] args) {
		
		// Population Counts for 5 Cities in a State with 100 Cities
		int city1Population = 12345;
		int city2Population = 32123;
		int city3Population = 42467;
		int city4Population = 52312;
		int city5Population = 24566;
		
		int statePopulation = city1Population + city2Population + city3Population + city4Population + city5Population;
		
		System.out.println("State Polulation is: "+statePopulation);
		
		// Challenge:
		// For developer this will become more complex as we have to now write 100 single value containers and have to add them to get the population count
		// As data grows Single value Container Creation is a laborious job for developer
		
		// Solution:
		// Arrays : Multi Value Container (Homogeneous)
		
		// Arrays can store lot of data in a single line of code
		// Indexing:		 0		 1		2      3       4
		int[] population = {12345, 32123, 42467, 52312, 24566};
		
		System.out.println("city1Population is: "+city1Population);
		System.out.println("population[0] is: "+population[0]);
		
		System.out.println("population array is: "+population);
		// population is a reference variable which holds HashCode of Array created in the Heap Area
		// HashCode is some memory mapping :)
		
		System.out.println("All Elements i.e. Data in Array");
		System.out.println("population[0] is: "+population[0]);
		System.out.println("population[1] is: "+population[1]);
		System.out.println("population[2] is: "+population[2]);
		System.out.println("population[3] is: "+population[3]);
		System.out.println("population[4] is: "+population[4]);
		
		// Loops and Arrays :)
		
		
		
	}

}
