package org.ycpait.collection.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {

        // Declare and initialize the list
        List<String> city ;
        city= new ArrayList<String>();

        // Print initial size (should be 0)
        System.out.println("Initial size: " + city.size());

        // Add elements to the list
        city.add("Jhajjar");
        city.add("Mumbai");       // Adds element at the end
        city.add("Chandigarh");
        city.add("Pune");
       // city.add(10);//boxing(primitive to wrapper)
        System.out.println("Before sorting: " + city);

        // Sort the list (based on ASCII values of first letters)// 
        Collections.sort(city); //it only accept list // Works only if all elements are mutually comparable
        System.out.println("After sorting: " + city);

        // Add an integer (autoboxing from primitive to wrapper)
       // city.add(10);             // Mixing types: String and Integer
        System.out.println("Size after adding integer: " + city.size());
        System.out.println("List after adding integer: " + city);

        // Add element at specific index
        city.add(1, "Delhi");     // Inserts at index 1, shifts existing elements
        System.out.println("Element at index 2: " + city.get(2));

        // Remove element at index 1
        city.remove(1);           // Removes "Delhi"
        System.out.println("After removal: " + city);

        // Replace element at index 0
        city.set(0, "Faridabad"); // Replaces "Chandigarh" or current element at index 0
        System.out.println("After update: " + city);

        // Uncomment to clear the entire list
        // city.clear();
    }
}