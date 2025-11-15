package org.ycpait.demolambda;



public class DemoLamda {
	 public static void main(String[] args) {
		// Printable p = () -> {System.out.println("Printable");};
		 Printable p = () -> System.out.println("Printable");
		 
		 
		/* Taxable t= (double income)->{return income*0.2;};*/
		  //Taxable t= (income)->{return income*0.2;};
		  //Taxable t= income->{return income*0.2;};
		  Taxable t= income->income*0.2;
		
		 
		// StringJoiner s= (String s1, String s2)->{return s1+s2;};
		 //StringJoiner s= (s1,s2)->{return s1+s2;};
		 StringJoiner s= (s1,s2)-> s1+s2;
		 
		 //Searchable sc = (String data)->{ return true;};
		// Searchable sc = (data)->{ return true;}; 
		//Searchable sc = data->{ return true;}; 
		 Searchable sc = data-> true;
		 
		 //CalculateLenght count = (String data)->{ return data.length();};
		 //CalculateLenght count = (data)->{ return data.length();};
		 CalculateLenght count = data -> data.length();
		p.print();
		System.out.println(t.calculate(5200));
		System.out.println(s.join("anjali", "saini"));
		System.out.println(count.countLenght("anjali"));
		
	}
}
