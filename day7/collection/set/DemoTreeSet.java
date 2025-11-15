package org.ycpait.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		Set<String> cities ;
		cities= new TreeSet<String>();
	       System.out.println(cities.size());
	       cities.add("Mumbai");
	       cities.add("Pune");
	       cities.add("Mumbai"); // no dublicate add in sets     
	       cities.add("Chandigarh");
	       cities.add("Faridabad");
	       //using this for loop we can iterate over collection from beginning to end sequentially
			//we cannot modify collection and while iteraring if we want to remove some specific element we should use iterator operator
			// if we want iterate over collection object and while iterating
	       for(String c: cities) {
	    	   System.out.println(c);
	       }
	       
	       Iterator<String> i = cities.iterator();
	       
	       while(i.hasNext()) {
	    	   String city = i.next();
	    	   System.out.println(city);
	    	   if(city.equals("Pune"))
	    	     i.remove();
	       }
	       System.out.println();
	       System.out.println("after loop "+cities);
	   

	}

}
