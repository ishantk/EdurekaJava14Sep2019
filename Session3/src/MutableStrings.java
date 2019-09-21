
public class MutableStrings {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String s = str.concat(" World"); // Concatenate World
		
		// Strings are IMMUTABLE. Manipulation generates a new String
		System.out.println(">> str is: "+str);  // Hello
		System.out.println(">> s is: "+s); 		// Hello World

		// StringBuffer is MUTABLE. Manipulation happens in the same String and no new String is generated in memory
		// IS THREAD SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println(">> buffer is: "+buffer);
		
		//StringBuffer buf = "Hello"; // error: Cannot be Used as Interned String
		
		// Exactly the same way we have StringBuffer
		// But is not THREAD SAFE
		StringBuilder builder = new StringBuilder("Hello"); // Performance is a bit better as it is not Thread Safe
		builder.append(" World");
		System.out.println(">> builder is: "+builder);
		
		// PS: Please explore methods of these 2 classes :)
	}

}
