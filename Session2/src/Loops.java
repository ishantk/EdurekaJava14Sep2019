
public class Loops {

	public static void main(String[] args) {
		
		/*
		int number = 5;
		int i = 1;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		i++;
		
		System.out.println(number+" "+i+"'s are "+number*i);
		
		*/
		
		int number = 5;
		int i = 111;
		
		while(i<=10) { // Condition Check Happens at the Entry
			System.out.println(number+" "+i+"'s are "+number*i);
			i++;
		}
		
		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		number = 7;
		i = 111;
		
		// even condition will not satisfy do while will work once on a min
		do {
			System.out.println(number+" "+i+"'s are "+number*i);
			i++;
		}while(i<=10); // Condition Check Happens at the Exit

		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		/*
		number = 9;
		i = 1;
		
		for(;i<=10;i++) {
			System.out.println(number+" "+i+"'s are "+number*i);
		}
		*/
		
		for(int j=1,n=18;j<=10;j++) {
			System.out.println(n+" "+j+"'s are "+n*j);
		}	// when for loop will finish j and n will be destroyed from memory
		
	}

}
