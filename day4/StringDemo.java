
public class StringDemo {

	public static void main(String[] args) {
		String city = new String("Mumbai");// constructor
		 System.out.println(city);// invoke toString() of String class
		 System.out.println(city.length());
		 System.out.println(city.charAt(0));
		 System.out.println(city.equals("Mumbai"));
		 System.out.println(city.equals("mumbai"));
		 System.out.println(city.equalsIgnoreCase("mumbai"));
		 System.out.println(city.substring(2));// index
		 System.out.println(city.substring(2,4)); // 2 index include 4 index exclude
		 city.replace('M','P');
         String newcity = city.replace('M','P');
         System.out.println(newcity);
		 System.out.println(city);
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println("===============");
		 System.out.println(s1.equals(s2)); // true
		 System.out.println(s1 == s2);// refrences changing that why it return false
		 
		 
		 System.out.println("===============");
		 String s3 ="a";
	     String s4 = "a";
	     System.out.println(s1.equals(s2));//true
		 System.out.println(s1 == s2);//true
	
	
	}

}
