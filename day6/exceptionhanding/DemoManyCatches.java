package org.ycpait.exceptionhanding;

public class DemoManyCatches {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Connot divide by zero");
			//e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of range");
			
			
		}
		catch(NullPointerException e) {
			System.out.println("Connot invoke method on null reference");
			
			
		}
		catch(Exception e) {
			System.out.println("Generic");
		}
		System.out.println("After");

	}

}
