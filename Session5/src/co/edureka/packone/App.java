package co.edureka.packone;

public class App {

	public static void main(String[] args) {
		
		// We can create Objects within the same package
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();

		System.out.println();
		
		//tRef.pvtShow(); error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
	}

}

// 1. private 	: not accessible outside the class :)
// 2. default 	: accessible within the same package
// 3. protected : accessible within the same package
// 4. public 	: accessible within the same package