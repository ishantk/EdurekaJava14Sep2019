package co.edureka.lang;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive Type : Stores Value
		int i = 10;
		char ch = 'A';
		double d = 2.2;
		
		// Create Object of Integer Class and pass i in constructor
		// BOXING : Converting Primitive to Object | Wrapping Primitive to an Object
		Integer iRef = new Integer(i);
		Character chRef = new Character(ch);
		Double dRef = new Double(d);
		
		// UNBOXING : Getting Primitive Back from Object
		i = iRef.intValue();
		ch = chRef.charValue();
		d = dRef.doubleValue();
		
		// AUTO-BOXING : Converting Primitive to Object | Wrapping Primitive to an Object
		// Syntatically it is more easy. We write incomplete statement which is completed by compiler on our behalf
		
		Integer iRef1 = i; // Automatically Converted to -> Integer iRef1 = new Integer(i);
		Character chRef1 = ch;
		Double dRef1 = d;
		
		// AUTO-UNBOXING
		i = iRef1;			// Automatically Converted to -> i = iRef1.intValue();
		ch = chRef1;
		d = dRef1;
		
		
		

	}

}
