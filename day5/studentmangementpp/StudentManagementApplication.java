package studentmangementpp;

import java.util.Scanner;

public class StudentManagementApplication {

	

	public static void main(String[] args) {
		
		int indexCount=0;
		Student[] students = new Student[2];
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
		
		 case 1: if(indexCount!=students.length) { 
			     System.out.println(); 
			     System.out.println("enter the name");
			     String name= sc.next();
			     System.out.println("enter the marks");
			     float marks = sc.nextFloat();
			     students[indexCount] = new Student(name, marks);
		                indexCount++;
		 }   
		 else {
			 System.err.println("array out of bound ");    
		 }
	                   break;
		 case 2: for (Student stu :students)  {
			          if(stu !=null)
			        	  System.out.println(stu);
			         }  
		             break;
		 case -1: System.out.println("thanku for using ");          
	
		
		}
		  
	}while(choice!= -1);


	}

}