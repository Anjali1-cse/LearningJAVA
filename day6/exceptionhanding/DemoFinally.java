package org.ycpait.exceptionhanding;

public class DemoFinally {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(1/0);
		} 
		catch(Exception e) {
			System.out.println("in catch");
			
			try {
			System.out.println(args[0]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("array index out of range");
				
				
			}
			
			
		}
		finally {
			System.out.println("in finally");
			try {
				String s = null;
				System.out.println(s.length());
				}
			catch(NullPointerException e) {
				System.out.println("Connot invoke method on null reference");
					
				}
		}
	}

}
