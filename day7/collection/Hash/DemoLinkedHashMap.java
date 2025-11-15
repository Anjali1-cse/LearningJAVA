
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer, String> cities = new LinkedHashMap<Integer, String>();
		cities.put(22,"Mumbai");// add element in last
		cities.put(11,"Pune");
		cities.put(33,"Kolkata");
	    System.out.println(cities);
	    System.out.println(cities.size());
	    System.out.println(cities.get(11));
	    System.out.println(cities.containsKey(11));
	    System.out.println(cities.containsValue("Mumbai"));
	    // duplicate key not allow
	    cities.put(33,"Delhi");// overwrite
	    System.out.println(cities);
	    cities.remove(11);
	    System.out.println(cities);
//	    cities.clear();

	}

}
