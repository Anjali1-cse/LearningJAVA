package org.ycpait.exceptionhanding;

import java.util.Scanner;

public class StudentNotFoundException extends RuntimeException {
	public static void main(String[] args) throws StudentNotFoundException {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the rollnumber");
		 int r = sc.nextInt();
		 
		 if(r!=1) {
			 StudentNotFoundException  e = new StudentNotFoundException ();
			 throw e;
		 }
	}
}
