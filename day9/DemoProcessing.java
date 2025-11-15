import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
	 System.out.println("=========================================");
	 System.out.println("=================Declaretive ways========================");
	 Stream<String> streamCities= cities.stream();//1
	 Stream<String> filterrdStream = streamCities.
			 filter(c->c.startsWith("M"));//2
	 List<String> li = filterrdStream.toList();//3
	 System.out.println(li);
	 li=cities.stream()
			 .filter(c->c.startsWith("P"))
			 .toList();
	 System.out.println(li);
	 
	 //predicate
	 Stream<String> streamCity= cities.stream();//1
	 Stream<String> filterrdLenght = streamCity.
			 filter(c->c.length()>5);//2
	 List<String> list = filterrdLenght.toList();//3
	 System.out.println("lenght: "+list);
	 
	 list=cities.stream()
			 .filter(c->c.length()>=5)
			 .toList();
	 System.out.println("lenght: "+list);
	 
	 //function
	 streamCities = cities.stream();
	 Stream<Integer>lengthStream =  streamCities.map(s->s.length());
	 List<Integer> newListLength = lengthStream.toList();
	  System.out.println(newListLength);
	 
	 newListLength =cities.stream()
			              .map(s->s.length())
			              .toList();
	 System.out.println(newListLength);
			              
	  
	}
	

}
