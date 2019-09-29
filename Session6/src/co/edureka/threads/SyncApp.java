package co.edureka.threads;

class Printer{
	
	//synchronized void print(String docName, int copies) {  // A lock shall be acquired when method will start executing print method
	
	void print(String docName, int copies) {
		for(int i=1;i<=copies;i++) {
			System.out.println(">> Priniting "+docName+" Copy no."+i);
		}
	}	// lock will be released here automatically
	 
	void getPrinterStatus() {
		System.out.println(">> Printer OK");
	}
}

class Desktop extends Thread{
	
	Printer printer; // will have reference to Printer Object which we created in main
	
	void attachPrinter(Printer p) {
		printer = p;
	}
	
	public void run() {
		
		// synchronized block
		synchronized (printer) { // acquired lock over the entire object 
			
			try {
				printer.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer.print("**JohnsProfile.pdf**", 10);
			System.out.println("-------------");
			printer.getPrinterStatus();
			System.out.println("-------------");
		}	// release the lock on object
		
		
	}
}

class Laptop extends Thread{
	
	Printer printer; // will have reference to Printer Object which we created in main
	
	void attachPrinter(Printer p) {
		printer = p;
	}
	
	public void run() {
		synchronized (printer) {
			printer.print("##BloodReports.pdf##", 10);
			
			printer.notify();
			//printer.notifyAll();
		}
		
	}
}


public class SyncApp {

	public static void main(String[] args) {
		
		System.out.println(">> main started");
		
		// We have only 1 single object of Printer i.e. 1 Single Printer
		Printer pRef = new Printer();
		
		Desktop dRef = new Desktop();
		dRef.attachPrinter(pRef);
		
		Laptop lRef = new Laptop();
		lRef.attachPrinter(pRef);
		
		// Looking above we can see both Desktop and Laptop are using the same single Printer Object
		
		dRef.start();
		lRef.start();
		
		// PS: In the output we shall be seeing mixed statements coming up
		//     This is known as Asynchronous i.e. Parallel Execution
		
		// Why we needed Threads -> To run long running operations parallely to the main thread by reducing burden on main thread
		// What happens when multiple threads access the same object ? Multiple Thread they work together !! We want threads to execute synchronously !!
		
		System.out.println(">> main finished");
	}

}
