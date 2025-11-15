package org.ycpait.studentmangementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.studentmangementpp.entity.Student;
import org.ycpait.studentmangementpp.exception.StudentNotFound;

public class StudentManagementApplication {

	

	public static void main(String[] args) {
		
	
		//Student[] students = new Student[2];
		List<Student> students = new ArrayList<Student>();
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
		    System.out.println("3. Serach Student by Roll number");
		    System.out.println("4. Delete Student by Roll number");
		    System.out.println("5. Sort Student by marks");
		    System.out.println("6. Sort Student by name");
		    System.out.println("-1. Exit");
		    System.out.println("enter your choice!");
		    choice = sc.nextInt();// accepting value
		    
		switch(choice) {
		
		 case 1:  
			     System.out.println(); 
			     System.out.println("enter the name");
			     String name= sc.next();
			     System.out.println("enter the marks");
			     float marks = sc.nextFloat();
			     Student s = new Student(name, marks);
			        students.add(s);      
	                   break;
		 case 2: for (Student stu :students)  {
			          if(stu !=null)
			        	  System.out.println(stu);
			         }  
		             break;
		 case 3: System.out.println("enter the rollnumber ");
		               int r = sc.nextInt();
		               boolean isFound = false;
		            for(Student foundStudent:students ) {
		            	if(foundStudent!=null) {
		            		if(foundStudent.getRollNumber() == r) {
		            			isFound = true;
		            			System.out.println(foundStudent);
		            	
		            			break;
		            		}

		            	}
		            }
		            
		            if(!isFound) {
            			StudentNotFound e = new StudentNotFound("Student with rollNmuber " + r+ " Not found");
            			try{
            				throw e;
            			}catch(StudentNotFound ex) {
            				ex.printStackTrace();
            				
            			}
            		}  
		          break;
		case 4: System.out.println("enter the rollnumber ");
			    int roll = sc.nextInt();
			    boolean isExist = false;
			    Iterator<Student> i = students.iterator();
			    while (i.hasNext()) {
			        Student foundStudent = i.next();
			        if (foundStudent != null) {
			            if (foundStudent.getRollNumber() == roll) {
			                isExist = true;
			                i.remove(); 
			                
			                System.out.println("Student removed successfully."); 
			                break;
			            }
			        }
			    }

			    if (!isExist) {
			        StudentNotFound e = new StudentNotFound("Student with rollNmuber " + roll + " Not found");
			        try {
			            throw e;
			        } catch (StudentNotFound ex) {
			            // It's generally better to just print the message 
			            // or let the calling method handle the exception.
			            // ex.printStackTrace();
			            System.err.println(ex.getMessage()); // A cleaner way to show the error
			        }
			    }
                   break;
		case 5:  Collections.sort(students);
		        for (Student stu :students)  {
	                if(stu !=null)
	        	  System.out.println(stu);
	         }   
		           break;
		case 6:  Collections.sort(students,
				(s1,s2)-> s1.getName().compareTo(s2.getName()));
		
               for (Student stu :students)  {
                  if(stu !=null)
    	        System.out.println(stu);
     }   
           break;          
		 case -1: System.out.println("thanku for using ");          
	
		
		}
		  
	}while(choice!= -1);


	}

}