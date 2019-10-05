package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Product{
	
	int pid;
	String name;
	int price;
	
	public String toString() {
		return "{"+pid+"\t"+name+"\t"+price+"}";
	}
}

public class ListApi {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList(); 						// Polymorphic Statement | Ref Var of List interface is pointing to object of ArrayList
		// Hetrogeneous : We can store any type of data in this list
		ArrayList list1 = new ArrayList();						// Direct Object Statement
		// Homogeneous : We can only store Strings
		ArrayList<String> list2 = new ArrayList<String>();		// Direct Object Statement
		// Homogeneous : We can only store Product Objects
		ArrayList<Product> cart = new ArrayList<Product>();		// Direct Object Statement
		
		Product p1 = new Product();
		p1.pid = 101;
		p1.name = "iPhone";
		p1.price = 70000;

		Product p2 = new Product();
		p2.pid = 201;
		p2.name = "Samsung LED";
		p2.price = 50000;
		
		Product p3 = new Product();
		p3.pid = 301;
		p3.name = "Adidas Alphabounce";
		p3.price = 5000;

		
		// 1. Add Data in List
		list1.add(10);			//0
		list1.add("John");		//1
		list1.add("Fionna");	//2
		list1.add(112.12);		//3
		list1.add(p1);			//4
		
		// In list2 we can only add Strings
		//list2.add(10);			// err
		//list2.add(112.12);		// err
		list2.add("John");		//0
		list2.add("Jennie");	//1
		list2.add("Jim");		//2
		list2.add("John");		//3   // We can repeat data in ArrayList | Duplicacy is supported
		list2.add("Jack");		//4
		list2.add("Joe");		//5
		
		cart.add(p1);
		cart.add(p2);
		
		// 2. Print Data in List
		System.out.println("===list1===");
		System.out.println(list1);
		
		System.out.println("===list2===");
		System.out.println(list2);
		
		System.out.println("===cart===");
		System.out.println(cart);
		
		cart.add(p3);
		
		// 3. Size of List
		System.out.println(">> list1 size is: "+list1.size());
		System.out.println(">> list2 size is: "+list2.size());
		System.out.println(">> cart size is: "+cart.size());
		
		// 4. Fetch Data from List | Single Element
		Object oRef = list1.get(4); // For Hetrogeneous we have Object as Parent Type
		String name = list2.get(3);
		Product pRef = cart.get(1);
		
		System.out.println(oRef);
		System.out.println(name);
		System.out.println(pRef);
		
		// 5. Remove Data from List
		list1.remove(1);
		list2.remove(1);
		//cart.remove(2);
		
		System.out.println(">> list1 size is: "+list1.size());
		System.out.println(">> list2 size is: "+list2.size());
		System.out.println(">> cart size is: "+cart.size());
		
		System.out.println(list2);
		
		// 6. Remove All
		//list2.clear();
		//System.out.println(">> list2 size is: "+list2.size());
		//System.out.println(list2);
		
		// 7. index and last indexof
		int idx = list2.indexOf("John");
		System.out.println(">> John is available on index: "+idx);
		
		list2.add("John");
		System.out.println(list2);
		
		idx = list2.lastIndexOf("John"); // Checks John form the end for the index
		System.out.println(">> John available on Last Index: "+idx);
		
		// In-between elements with indexes we need to trap with logic
		
		// 8. Check Elements in List
		if(list2.contains("John")) {
			System.out.println(">> John is in the list");
		}
		
		Collections.sort(list2);
		System.out.println(list2);
		
		// DO EXPLORE: Comparator and Comparable : Explore | For Custom Sorting :)
		
		// 9. Iterating in the List i.e. reading all the elements :)
		// 9.1 for loop
		System.out.println("===Basic For Loop===");
		System.out.println("***list1***");
		for(int i=0;i<list1.size();i++) {
			Object o = list1.get(i);
			System.out.println(o);
		}
		
		System.out.println("***list2***");
		for(int i=0;i<list2.size();i++) {
			String s = list2.get(i);
			System.out.println(s);
		}
		
		int total = 0;
		System.out.println("***cart***");
		for(int i=0;i<cart.size();i++) {
			Product p = cart.get(i);
			System.out.println(p);
			total+=p.price;
		}
		
		System.out.println(">> Total Amount to be Paid: "+total);
		
		// 9.2 Enhanced for loop | No Indexes, Direct Data :)
		System.out.println("===Enhanced For Loop===");
		System.out.println("***list1***");
		for(Object o : list1) {
			System.out.println(o);
		}
		
		System.out.println("***list2***");
		for(String s : list2) {
			System.out.println(s);
		}
		
		total = 0;
		System.out.println("***cart***");
		for(Product p : cart) {
			System.out.println(p);
			total+=p.price;
		}
		System.out.println(">> Total Amount to be Paid: "+total);
		
		// 9.3 Iterator API | Fetch the elements one by one
		System.out.println("===Iterator API===");
		Iterator itr1 = list1.iterator();
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		System.out.println(itr1.next()); // next gives the next element
		
		
		System.out.println(">> list2 before is: "+list2);
		Iterator<String> itr2 = list2.iterator();
		
		while(itr2.hasNext()) {
			String s = itr2.next();
			System.out.println(">> "+s);
//			if(s.equals("Jack")) {
//				itr2.remove(); // Iterator can help to remove data from list since we have no indexes
//			}
		}
		
		System.out.println(">> list2 now is: "+list2);
		
		// 9.4 ListIterator API | Work in both directions
		System.out.println("===ListIterator API===");
		ListIterator<String> listItr2 = list2.listIterator();
		while(listItr2.hasNext()) {
			String s = listItr2.next();
			System.out.println("** "+s);
		}
		System.out.println("------");
		
		while(listItr2.hasPrevious()) {
			String s= listItr2.previous();
			System.out.println("@@ "+s);
		}
		
		list2.remove("John");
		System.out.println(">> list2 after removing John is: "+list2);
		
		// 9.5 Enumeration
		Enumeration<String> enm = Collections.enumeration(list2); // Read Only operation with no indexes and no remove method to remove elements
		while(enm.hasMoreElements()) {
			String s = enm.nextElement();
			System.out.println(">> "+s);
		}
		
		// Vector is THREAD-SAFE i.e. SYNCHRONIZED version of ArrayList
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jim");
		vector.add("Sionna");
		vector.add("John");
		vector.add("Mike");
		vector.add("Leo");
		
		System.out.println(">> vector is: "+vector);
		
	}

}
