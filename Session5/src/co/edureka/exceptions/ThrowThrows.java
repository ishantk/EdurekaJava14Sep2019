package co.edureka.exceptions;

// Any Exception which is Child of RuntimeException is UNCHECKED Exception
// User Defined UNCHECKED Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message); // pass the message to Parent's Constructor
	}
}

//Any Exception which is Child of Exception is CHECKED Exception
//User Defined CHECKED Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message); // pass the message to Parent's Constructor
	}
}

class BankAccount{
	
	int balance = 10000;
	int minBalance = 2000;
	
	int attempts = 0;
	
	void withdraw(int amount) throws MyBankingException, YourBankingException{ // throws for Checked Exception
		
		balance = balance - amount;
		
		if(balance <= minBalance) {
			balance = balance + amount; // we will not deduct when balance is low
			System.out.println("## Withdraw Failed !! Balance is LOW: \u20b9"+balance);
			
			attempts++;
			
		}else {
			System.out.println(">> Withdraw Success !! New Balance is: \u20b9"+balance);
		}
		
		
		if(attempts == 3) {
			// Throw : ArithmethicException : UNCHECKED EXCEPTION
			// we are creating object of Exception and will crash the program 
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts: "+attempts);
			//throw aRef; // Throwing an Exception with throw keyword
			
			//MyBankingException mRef = new MyBankingException("Illegal Attempts: "+attempts);
			//throw mRef;
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts: "+attempts);
			throw yRef; // error here : throwing a checked exception compiler generates error
			// We will use throws keyword in method's signature
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println(">> Banking Started");
		
		BankAccount account = new BankAccount();
		//account.withdraw(3000);
		
		try {
			for(int i=1;i<=500;i++) { // having attempts as 500 we are gaining nothing !! what is the loss ?? // Loss: Occupying Banks Resources
				account.withdraw(3000);
			}
		}catch (Exception e) {
			System.out.println(">> Exception: "+e);
		}
		
		
		System.out.println(">> Banking Finished");
		

	}

}
