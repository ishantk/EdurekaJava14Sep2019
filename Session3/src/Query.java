
public class Query {

	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3}, {3, 4, 5}, {5, 6, 7} };
		
		for(int[] a : arr) {
			for(int e : a) {
				System.out.print(e+" ");
			}
			System.out.println();
		}

	}

}
