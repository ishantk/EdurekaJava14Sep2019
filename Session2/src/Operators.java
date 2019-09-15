
public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		// +, -, *, /, %
		int num1 = 10;
		int num2 = 3;
		
		int num3 = num1 / num2;
		int num4 = num1 % num2; // Remainder
		System.out.println(">> num3 is: "+num3);	// 3
		System.out.println(">> num4 is: "+num4);	// 1

		double amount = 120;
		double taxes = 0.18;
		double amountWithTaxes = amount + taxes * amount;
		System.out.println(">> Amount to be paid with taxes is: "+amountWithTaxes);
		
		// Unary Operators
		int salary = 10000;
		salary++;	// salary = salary + 1	| POSTFIX
		++salary;	// salary = salary + 1  | PREFIX
		System.out.println(">> salary is: "+salary); // 10002
		
		
		// Assignment Operators
		// =, +=. -=, *= /=, %=
		salary += 2000; // salary = salary + 2000
		System.out.println(">> salary now is: "+salary);
		
		int i = 10;
		++i;			// 11
		i++;			// 12
		System.out.println(i);	// 12
		System.out.println(++i);// 13	| i is incremented first and than printed
		System.out.println(i++);// 13	| i is printed first and later incremented
		System.out.println(i);
		
		// Relational or Conditional
		// >, <, >=, <=, ==, !=
		
		int johnsMarks = 90;
		int fionnasMarks = 97;
		int annasMarks = 95;
		
		boolean result = johnsMarks==fionnasMarks;
		
		System.out.println(">> Is John 1st? " + (johnsMarks>fionnasMarks) );
		System.out.println(">> Is John 2nd? " + (johnsMarks<fionnasMarks) );
		System.out.println(">> Is John and Jennie on same score? " + result );
		
		// Logical Operators
		// && || !
		
		//boolean topped = (annasMarks>johnsMarks) && (annasMarks > fionnasMarks) ;
		boolean topped = (annasMarks>johnsMarks) || (annasMarks > fionnasMarks) ;
		System.out.println(">> Has Anna Topped? "+ topped);
	}

}
