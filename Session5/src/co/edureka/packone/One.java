package co.edureka.packone; // Package Statement : Define Below class and Program will be in which package :)

// One is public
public class One {
	
	private void pvtShow() {
		System.out.println(">> This is private show of One");
	}
	
	void defShow() {
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of One");
	}
	
}

// Two is default
class Two{
	
	private void pvtShow() {
		System.out.println(">> This is private show of Two");
	}
	
	void defShow() {
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of Two");
	}
	
}

/*
private class Three{
	
}

protected class Four{
	
}
*/

/* if class is public name of source file should be Five.java
public class Five{
	
}*/

// 1. Classes can either be public or default
// 2. if a class is public, name of source file should be same name as that of class name
//    public class One{} -> means name of source file should be One.java
//    Hence, in 1 source file we can have only 1 public class
// 3. We can have multiple default classes