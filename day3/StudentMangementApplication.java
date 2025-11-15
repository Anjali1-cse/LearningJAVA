package studentmangementpp;

import java.util.Scanner;
public class StudentMangementApplication {

	public static void main(String[] args) {
		Student  e= null;
		Scanner sc = new Scanner(System.in);
		int choice=-1;
		
		do{
			System.out.println(" welcome to Stu_creation_system!");
			for(int i= 1; i<=40;i++) {
				 System.out.print("=");
			 }
			System.out.println(); 
		    System.out.println("1. register new Student");
		    System.out.println("2. Display Student Details");
		    System.out.println("-1. Exit");
		    System.out.println("enter your choice!");
		    choice = sc.nextInt();// accepting value
		    
		switch(choice) {
		
		 case 1:  e= new Student("anjali", 65.56f);
	                   break;
		 case 2:  if(e!=null)
			      System.out.println(e); 
			       // e.display("*");
		             break;
		 case -1: System.out.println("thanku for using ");          
	
		
		}
		  
	}while(choice!= -1);


	}

}
