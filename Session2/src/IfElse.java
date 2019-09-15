
public class IfElse {

	public static void main(String[] args) {
		
		int orderAmount = 150;
		
		// 3 promo codes applicable as per below rules:
		
		// promoCode10 for amount greater than or equal to 300 and less than 500
		// 10% Off
		int promoCode10 = 10;
		
		// promoCode20 for amount greater than or equal to 500 and less than 1000
		// 20% Off
		int promoCode20 = 20;
		
		// promoCode30 for amount greater than or equal to 1000
		// 30 %Off
		int promoCode30 = 30;
		
		// 1. Rule Validation : Can User Use a Promo Code ?
		// Basic if/else
		/*
		if(orderAmount>=300) { // orderAmount>=300 -> gives true | if block statements will be executed
			System.out.println(">> You are eligible to apply Promo Code");
		}else { 			   // orderAmount>=300 -> gives false | else block statements will be executed
			System.out.println(">> Add \u20b9"+(300-orderAmount)+" value of more food items to get discounts");
		}*/
		
		// 2. Rule Validation : Which Promo Code should User Use ? Suggest the User !!
		// Ladder if/else
		if(orderAmount>=300 && orderAmount<500) {
			System.out.println(">> You are eligible to apply Promo Code : promoCode10");
		}else if(orderAmount>=500 && orderAmount<1000) {
			System.out.println(">> You are eligible to apply Promo Code : promoCode10 or promoCode20");
		}else if(orderAmount>=1000) {
			System.out.println(">> You are eligible to apply Promo Code : promoCode10 or promoCode20 or promoCode30");
		}else {
			System.out.println(">> Add \u20b9"+(300-orderAmount)+" value of more food items to get discounts");
		}
		
		// 3. Rule Validation : Check for Internet and GPS in phone !!
		boolean internet = false;
		boolean gps = false;
		// Nested if/else | if else within the if else
		if(internet) {
			if(gps) {
				System.out.println(">> Uber App Available to Book Cab");
			}else {
				System.out.println(">> Please Enable GPS for Location Access");
			}
		}else {
			System.out.println(">> Please connect to Internet and Try Again !!");
		}
		
		
		int olaMini = 1;
		int olaSedan = 2;
		int olaBike = 3;
		
		int baseFare = 100;
		
		int userChoice = 0;
		
		/*
		if(userChoice == olaMini) {
			baseFare+=50;
			System.out.println(">> OLA Mini Cab Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
		}else if(userChoice == olaSedan) {
			baseFare+=100;
			System.out.println(">> OLA Sedan Cab Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
		}else if(userChoice == olaBike) {
			baseFare+=20;
			System.out.println(">> OLA Bike Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
		}else {
			System.out.println(">> Please Select the Cab and than Proceed :)");
		}
		*/
		
		switch(userChoice) {
			case 1:
				baseFare+=50;
				System.out.println(">> OLA Mini Cab Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
				break;
				
			case 2:
				baseFare+=100;
				System.out.println(">> OLA Sedan Cab Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
				break;
				
			case 3:
				baseFare+=20;
				System.out.println(">> OLA Bike Booked !! Arriving Soon !! Please Pay Base Fare of: \u20b9"+baseFare);
				break;
				
			default:
				System.out.println(">> Please Select the Cab and than Proceed :)");
				break;
		}
		

	}

}
