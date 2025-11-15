package org.ycpait.collection.arrylist;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> city ;
       city= new Vector<String>();
       System.out.println("Initial size: " + city.size());
       city.add("Jhajjar");
       city.add("Mumbai");      
       city.add("Chandigarh");
       city.add("Pune");
       System.out.println("Before sorting: " + city);
       Collections.sort(city);  
       System.out.println("After sorting: " + city);
       System.out.println("Size after adding integer: " + city.size());
       System.out.println("List after adding integer: " + city);
       System.out.println("Element at index 2: " + city.get(2));
       city.remove(1);          
       System.out.println("After removal: " + city);

       
       city.set(0, "Faridabad");
       System.out.println("After update: " + city);
	}

}
