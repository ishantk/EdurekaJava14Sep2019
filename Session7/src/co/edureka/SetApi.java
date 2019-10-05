package co.edureka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetApi {

	public static void main(String[] args) {
		
		// ArrayList can have duplicates :)
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Fionna");
		list.add("Jennie");
		list.add("John");
		list.add("Leo");
		list.add("Mike");
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>(); // TreeSet sorts the data for us automatically :)
		
		// data isn't added on indexes. We have Hashing Algorithm which shall work :)
		// Due to HashCodes we will be having output as un-ordered
		// HashSet will not have duplicates
		set.add("John");
		set.add("Fionna");
		set.add("Jennie");
		set.add("John");
		set.add("Leo");
		set.add("Mike");
		
		System.out.println(">> list is: "+list);
		System.out.println(">> set is: "+set);
		
		// Set will have no indexes, hence we cannot put up a loop on it
		// We have to use Iterator API
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(">> "+name);
		}
		
		if(set.contains("John")) {
			System.out.println(">> John is in the set");
		}
		System.out.println(">> set is: "+set+" and size is: "+set.size());
		set.remove("Mike");
		System.out.println(">> set now is: "+set+" and size is: "+set.size());
		
		// HashSet : Use it to have unique data :)

	}

}
