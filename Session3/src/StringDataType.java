
public class StringDataType {

	public static void main(String[] args) {
		
		// String is built in class with so many methods :)
		
		// Interned Way
		String s1 = "Hello";
		String s2 = "HeLLO";
		
		// Object Way
		String s3 = new String("Hello");
		String s4 = new String("HEllo");
		
		// s1, s2, s3 and s4 are reference variables
		
		// We know String is a Reference Type i.e. data shall be stored with HashCodes
		// But, Printing Strings will not Print HashCodes rather it will print data directly
		
		System.out.println(">> s1 is: "+s1); // even if we dont execute toString it gets executed automatically
		System.out.println(">> s2 is: "+s2);
		System.out.println(">> s3 is: "+s3);
		System.out.println(">> s4 is: "+s4);
		
		// Why we don't see HashCodes: toString a built in method is executed automatically while printing reference variables
		
		System.out.println(">> s1.toString() is: "+s1.toString());
		System.out.println(">> s2.toString() is: "+s2.toString());
		System.out.println(">> s3.toString() is: "+s3.toString());
		System.out.println(">> s4.toString() is: "+s4.toString());
		
		// Proof of Concept : References and HashCodes
		// == operator compares references and hence gives us different results
		
		if(s1 == s2) {
			System.out.println(">> s1 == s2");
		}else {
			System.out.println(">> s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println(">> s3 == s4");
		}else {
			System.out.println(">> s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println(">> s1 == s3");
		}else {
			System.out.println(">> s1 != s3");
		}
		
		System.out.println("equals method - to compare content");
		
		// How we will compare Data ?
		
		if(s1.equals(s2)) {
			System.out.println(">> s1 equlas s2");
		}else {
			System.out.println(">> s1 not equals s2");
		}
		
		if(s3.equals(s4)) {
			System.out.println(">> s3 equlas s4");
		}else {
			System.out.println(">> s3 not equals s4");
		}
		
		if(s1.equals(s3)) {
			System.out.println(">> s1 equlas s3");
		}else {
			System.out.println(">> s1 not equals s3");
		}
		
		System.out.println("cpmpareTo method - to compare content");

		if(s3.compareTo(s4) == 0) {
			System.out.println(">> s3 compared to s4");
		}else {
			System.out.println(">> s3 not compared to s4");
		}
		
		// If we wish to compare case sensitive data
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println(">> s3 equlas s4");
		}else {
			System.out.println(">> s3 not equals s4");
		}
		
		if(s3.compareToIgnoreCase(s4) == 0) {
			System.out.println(">> s3 compared to s4");
		}else {
			System.out.println(">> s3 not compared to s4");
		}
		
	}

}
