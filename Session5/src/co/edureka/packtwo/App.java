package co.edureka.packtwo;

import co.edureka.packone.One;	 // Import the class if we wish to access it outside the package
//import co.edureka.packone.Two; // error : default classes cannot be accessed outside the package

// Package Level Inheritance
class CA extends One{
	
	void show() {
		//pvtShow(); // err
		//defShow(); // err
		protShow();  // Child outside the package can access protected and public of Parent :)
		//pubShow(); // Child outside the package can access protected and public of Parent :)
	}
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();  error
		//oRef.defShow();  error
		//oRef.protShow(); error
		oRef.pubShow();
		
		CA cRef = new CA();
		cRef.show();
		
	}

}

// 1. Classes which needs to be accessed outside the package must be public so that they can be imported
// 2. Outside the package only public is accessible
// 3. default and protected accessible only within the same package and not outside the package
//    protected can be inherited outside the package