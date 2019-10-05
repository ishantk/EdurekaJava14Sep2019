package co.edureka;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapApi {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, Product> cart1 = new HashMap<Integer, Product>();
		
		HashMap<Product, Integer> cart2 = new HashMap<Product, Integer>();
		
		// 1. Add Data in HashMap
		map.put(101, "John");
		map.put(111, "Jennie");
		map.put(321, "Mike");
		map.put(765, "Leo");
		map.put(543, "Fionna");
		
		map.put(321, "Kia"); // Re-Using the same key shall update the value
		// Map has UNIQUE KEYS But VALUES may be DUPLICATE
		
		// Map supports null key and null values
		map.put(null, "Harry");
		map.put(333, null);
		
		// PS: Explore Hashing Algorithm if not clear :)
		
		// Printing Map
		System.out.println(">> map is: "+map);
		
		if(map.containsKey(111)) {
			System.out.println(">> 111 is in the map");
		}
		
		if(map.containsValue("Leo")) {
			System.out.println(">> Leo is in the map");
		}
		
		System.out.println(">> size of map is: "+map.size());
		
		System.out.println(">> Keys in map are: "+map.keySet()); // All the Keys in the Map
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(">> "+key+"\t"+value);
		}
		
		System.out.println("---------------");
		
		Set<Entry<Integer, String>> set1 = map.entrySet(); // Gives us a Set of Entry Objects
		Iterator<Entry<Integer, String>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println("** "+entry.getKey()+"\t"+entry.getValue());
		}

		// Hashtable is THREAD-SAFE i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(111, "Jennie");
		table.put(321, "Mike");
		table.put(765, "Leo");
		table.put(543, "Fionna");
		//table.put(null, "Sia"); 	// null key not supported
		//table.put(212, null);		// null value not supported
		
		System.out.println(">> table is: "+table);
		
		String value = table.get(101);
		System.out.println(">> Value is: "+value);
		
		
	}

}
