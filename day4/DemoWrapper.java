package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		
		int i =10;
//		        primitive to wrapper
//		   Integer iObj = new Integer(i);//depracated in java - means it may be removed from new version
		    Integer iObj= i;//auto-boxing
//	           wrapper to primitive 
		   int j = iObj.intValue();

//	            string to wrapper
		   Integer o = Integer.valueOf("77");
//	            wrapper to string
		    String str = o.toString();
		    
//	            String to primitive	
		    int p = Integer.parseInt(str);
//		        primitive to String
            String data = Integer.toString(p);
			
	}

}
