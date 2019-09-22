/*
class LEDTV{
	int pid;
	String name;
	String brand;
	int price;
	String technolgy;
	int size;
}

class Shoe{
	int pid;
	String name;
	String brand;
	int price;
	int shoeSize;
	String color;
}

class MobilePhone{
	int pid;
	String name;
	String brand;
	int price;
	String os;
	int ram;
	int memory;
	int screenSize;
}
*/

class Product{
	int pid;
	String name;
	String brand;
	int price;
}

class LEDTV extends Product{ // LEDTV IS A Product
	String technolgy;
	int size;
}

class Shoe extends Product{ // Shoe IS A Product
	int shoeSize;
	String color;
}

class MobilePhone extends Product{ // MobilePhone IS A Product
	String os;
	int ram;
	int memory;
	int screenSize;
}

// Product is Parent and LEDTV, Shoe, MobilePhone are Children
// Hierarchy

public class WhyInheritance {

	public static void main(String[] args) {
		

	}

}
