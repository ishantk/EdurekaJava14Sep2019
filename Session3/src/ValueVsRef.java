
public class ValueVsRef {

	
	void squareOfNumber(int number) {
		
		number = number * number;
		System.out.println(">> Square of number is: "+number);
		
	}
	
	// Method takes input HashCode of int array.
	// numbers passed here as input is a reference variable which will hold HashCode of int array :)
	void squareOfNumbers(int[] numbers) {
		System.out.println(">> HashCode for numbers of squareOfNumbers method is: "+numbers);
		
		// Updating indexes by squaring the value at it
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = numbers[i] * numbers[i];
		}
	}
	
	public static void main(String[] args) {
		

		ValueVsRef vRef = new ValueVsRef();
		
		//int num = 7;
		//vRef.squareOfNumber(num);  // Passing the Value i.e. 7 gets copied into number
		
		//System.out.println(">> number is: "+number); // error, as number is property of squareOfNumber method
		// Changes or Manipulation or Updation was done in number variable of squareOfNumber method and not on num
		//System.out.println(">> num is: "+num);		   // 7	
		
		
		int[] nums = {10, 20, 30, 40, 50};
		System.out.println(">> HashCode for nums of main method is: "+nums);
		
		vRef.squareOfNumbers(nums);
		
		for(int element : nums) {
			System.out.print(element+" ");	// 100 400 900 1600 2500  | was manipulated by numbers and is also manipulated for nums
		}
		
		
	}

}
