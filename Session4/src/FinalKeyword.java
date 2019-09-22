final class CA{ // cannot be extended
	
	final void show() { // final function cannot be overrided by anyone in child
		
	}
	
}

class CB{ //extends CA{
	
	/*
	void show() { // Overriding
		
	}*/
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		int x = 10;
		x = 100;
		
		final int y = 10; // final means you cannot modify it further | Kind of constant
		//y = 100; // error

	}

}
