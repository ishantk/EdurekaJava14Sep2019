
public class BreakAndContinue {

	public static void main(String[] args) {
		
		int[] population = {12431, 35451, 34312, 64322, 21342};
		
		// Assuming max is population[0]
		int max = population[0];
		
		// Get the maximum element
		for(int i=1;i<population.length;i++) {
			if(population[i] > max) {
				max = population[i];
			}
		}
		
		System.out.println(">> Max Population is: "+max);

		System.out.println();
		
		// Find element in Array
		int find = 34312;
		for(int i=0;i<population.length;i++) {
			if(population[i] == find) {
				System.out.println(">> Value Found at "+i);
				break; // break shall terminate the loop 
			}
			
			System.out.println(">> Finsihed Looking for "+i);
		}
		
		System.out.println();
		
		// Do some computation on populations with even numbers
		for(int i=0;i<population.length;i++) {
			
			if(population[i]%2 != 0) {
				continue; // skipping the statements below and take the loop in next iteration
			}
			
			System.out.println("Lets do some computation on "+population[i]);
		}
		
		// we can use labels with break and continue statements :)
		outer:
		for(int i=1;i<=5;i++) {
			inner:
			for(int j=1;j<=3;j++) {
				if(j>2) {
					break outer; // breaks inner loop and not outer loop
				}
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
