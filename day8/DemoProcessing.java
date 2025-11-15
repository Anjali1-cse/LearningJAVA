import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoProcessing {
//Imperative programming
	public static void main(String[] args) {
	 List <String> cities=  new ArrayList<String>();
	 cities.add("Mumbai");
	 cities.add("Delhi");
	 cities.add("Pune");
	 cities.add("Mysore");
	 cities.add("Manglore");
    
	 cities.forEach(str->System.out.println(str.length()));
	 cities.forEach(str->System.out.println(str));
	 List <String> citiesWithM=  new ArrayList<String>();
	 for(String city: cities) {
		 if(city.startsWith("M")) {
			 citiesWithM.add(city);
		 }
	 }
	 System.out.println(citiesWithM);
	 
	 List <Integer> citiesWithL=  new ArrayList<Integer>();
	 for(String city: cities) {
		 citiesWithL.add(city.length());
	 }
	 System.out.println(citiesWithL);
	
	 
	}
	

}
