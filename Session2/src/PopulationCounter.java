
public class PopulationCounter {

	public static void main(String[] args) {
		
		int[] population = {12345, 32123, 42467, 52312, 24566};
		
		int count = 0; // count with initial value as 0
		
		for(int element : population) {
			System.out.println(">> "+element);
			count = count + element;	// we are adding value of element in count in the loop
		}

		System.out.println(">> Population Count is: "+count);
		
		// For Complex Data i.e. lot of values we can use Arrays and Loops to solve Problems by saving our development time
		
		// PS: below Statement will cause an error at RUN TIME as we have no index 11 in population
		//	   Error at RUN TIME is called EXCEPTION and name of Exception is: ArrayIndexoutOfBoundsException
		System.out.println(">> population[11] is: "+population[11]);
	}

}
