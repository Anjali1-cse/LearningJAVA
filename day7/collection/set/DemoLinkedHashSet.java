package org.ycpait.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		Set<String> city ;
	       city= new LinkedHashSet<String>();
	       System.out.println(city.size());
	       city.add("Mumbai");
	       city.add("Pune");
	       System.out.println(city);
	       System.out.println("Size after adding integer: " + city.size());
	       city.add("Mumbai"); // no dublicate add in sets     
	       city.add("Chandigarh");
	       System.out.println("Size after adding integer: " + city.size());
	       System.out.println(city);
	       System.out.println(city.contains("Mumbai"));// return true if present otherwise false
	       city.add("Faridabad");
	       System.out.println("After update: " + city);
	       
	       
	}

}
