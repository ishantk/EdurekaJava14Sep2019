package co.edureka.threads;

/*
class PrintingTask{
	void print() {
		for(int i=1;i<=10;i++) { 
			System.out.println("## PrintingTask Printing @@LearningPython.pdf@@ page no."+i);
		}
	}
}*/

//Lets optimize and create thread
// Thread is a built in class in Java. We inherit and override run method and execute start method from main
// run and start are methods of Thread class :)
class PrintingTask extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) { 
			System.out.println("## PrintingTask Printing @@LearningPython.pdf@@ page no."+i);
			try {
				Thread.sleep(1000); // Introduce a delay in execution of 2 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CA{
	
}

// class MyPriningTask extends CA, Thread{ // error : Java will not support multiple inheritance :)
// We can use Runnable interface also to create a Thread.
// When already inheritance is in place, you can use Runnable and create a Thread :)
class MyPriningTask extends CA implements Runnable{
	public void run() { // What thread should do we will write in run method here
		for(int i=1;i<=10;i++) { 
			System.out.println("^^ MyPriningTask Printing $$LearningAngular.pdf$$ page no."+i);
			try {
				Thread.sleep(1000); // Introduce a delay in execution of 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {

	// main method represents main thread of our program
	// whatever we write in main will be executed by main thread in a sequence
	public static void main(String[] args) {
		
		System.out.println(">> main started");

		//PrintingTask pRef = new PrintingTask();
		//pRef.print(); // if it goes to 100 or 500 or 100 this will become a blocking job
		
		// Object Construction when we extend Thread
		PrintingTask pRef = new PrintingTask(); // Is an object of Thread
		System.out.println(">> State after creating Thread is: "+pRef.getState());
		
		// Object Construction when we implement Runnable
		Runnable rRef = new MyPriningTask(); // Polymorphic Statement : Ref Var of Interface can point to the object which implements it
		Thread mRef = new Thread(rRef);		 // Direct Thread Object and pass Runnable in it :)
		
		
		// Change name and priorities of threads
		Thread.currentThread().setName("John");
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 10
		
		pRef.setName("Fionna");
		pRef.setPriority(Thread.NORM_PRIORITY);	// 5
		
		mRef.setName("Leo");
		mRef.setPriority(Thread.MIN_PRIORITY);  // 1
		
		// Priority here means requesting JVM to execute the thread in some low memory conditions or when JVM is highly occupied
		
		// start method will internally execute the run method to maintain some states of thread
		pRef.start();
		System.out.println(">> State after starting Thread is: "+pRef.getState());
		// immediately after start method execute join method
		try {
			pRef.join(); // command saying execute my jobs first and let other wait :)
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(">> State after joining Thread is: "+pRef.getState());
		
		mRef.start();	
		
		for(int i=1;i<=10;i++) {
			System.out.println(">> main Printing **LearningJava.pdf** page no."+i);
			
			try {
				Thread.sleep(1000); // Introduce a delay in execution of 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		// We are getting names and priorities of threads
		System.out.println(">> main thread name: "+Thread.currentThread().getName()+" and Priority: "+Thread.currentThread().getPriority());
		System.out.println(">> PrintingTask thread name: "+pRef.getName()+" and Priority: "+pRef.getPriority());
		System.out.println(">> MyPriningTask thread name: "+mRef.getName()+" and Priority: "+mRef.getPriority());
		
		System.out.println(">> main finished");
		
		System.out.println(">> State lastly is: "+pRef.getState());
		
	}

}

// After PrintingTask is a Thread, outputs are mixed up
// This is a proof that main and PrintingTask are executed together i.e. parallely :)
