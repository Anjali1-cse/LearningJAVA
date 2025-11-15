package org.ycpait.exceptionhanding;

public class DemoExceptionHanding {
	
	public static void main(String[] args) {
		int num1 =2;
		int num2 = 0;
		try {
		int result= num1/num2;
		System.out.println("result: "+ result );
		
		}
		//System.out.println("hello");
		catch(ArithmeticException e) {
			System.out.println("Connot divide by zero");
			e.printStackTrace();// print complete stack track on console
			                   //needed for debugging
			
		}
	}

}
