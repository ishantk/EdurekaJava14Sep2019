
public class StringBuiltInMethods {

	public static void main(String[] args) {
					//  0123456789.........
		String quote = "Be Exceptional in whatever you do";
		
		//int length = quote.length();
		//System.out.println(">> Length of "+quote+" is: "+length);
		System.out.println(">> Length of "+quote+" is: "+quote.length()); // 33
		
		//char ch = quote.charAt(3);
		//System.out.println(">> char at 0 is "+ch); // B
		//System.out.println(">> char at 3 is "+ch); // E
		
		char ch = quote.charAt(quote.length()-1);
		System.out.println(">> ch is: "+ch);  // o
		
		int idx = quote.indexOf('E');
		System.out.println(">> index of E is: "+idx);
		idx = quote.lastIndexOf('e'); // look for the index of e which comes lastly
		System.out.println(">> Last idx of e is: "+idx);
		
		idx = quote.indexOf("whatever"); // gives the index of w i.e. from where whatever will start
		System.out.println(">> idx of whatever is: "+idx);
		
		// We get -1 if not found :)
		
		char[] chArr = quote.toCharArray(); // we can convert String to Array of Characters
		for(char c : chArr) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		String quote1 = quote.toUpperCase();
		System.out.println(">> quote now is: "+quote); // No Change in String
		System.out.println(">> quote1 is: "+quote1);   // Modified String
		
		// Strings are IMMUTABLE. i.e. when we perform manipulation operation, we get a new String and old String remains same
		// We cannot modify a String.  :(
		
		String names = "John, Jennie, Jim, Jack, Joe";
		//String name = names.substring(5); 	// remove before 5 and give till end
		String name = names.substring(6,12 );	// from 6 till 11 i.e. less than 12
		System.out.println(">> name is: "+name);
		
		String[] nameArr = names.split(",");
		for(String nm : nameArr) {
			System.out.println(nm.trim()); // trim removes leading and trailing white spaces and not in between
		}
		
		String modifiedNames = names.replace('J', 'K');
		System.out.println(">> names: "+names);
		System.out.println(">> modifiedNames: "+modifiedNames);
		
		String email = "john@example.com";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println(">> A Valid Email");
		}else {
			System.out.println(">> Invalid Email");
		}
		
		String fileName = "Hello.mp3";
		if(fileName.endsWith(".mp3")) { // startsWith (majorly for searching)
			System.out.println(">> Its an Audio File");
		}else {
			System.out.println(">> Not an Audio File");
		}

		// PS: Explore more methods on String Class
		//names. :)
		
	}

}
