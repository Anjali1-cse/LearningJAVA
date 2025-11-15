package org.ycpait.studentmangementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.ycpait.studentmangementpp.dao.impl.StudentDaoImpl;
import org.ycpait.studentmangementpp.entity.Student;
import org.ycpait.studentmangementpp.exception.StudentNotFound;

public class StudentManagementApplication {

	

	public static void main(String[] args) {
		
	
		//Student[] students = new Student[2];
		//List<Student> students = new ArrayList<Student>();
		StudentDaoImpl dao = new StudentDaoImpl();
		
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
		    System.out.println("7. find masks who have more then 90 marks");
		    System.out.println("8. find name who have more then 90 marks");
		    System.out.println("9. find name who have subject Java ");
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
			     List<String> subjects = new ArrayList<String>();
			     System.out.println("enter the Number of Subject ");
			      int num = sc.nextInt();
			      for(int i= 0; i<num; i++) {
			    	  System.out.println("enter Subject NAME ");
			    	    String sub= sc.next();
			    	    subjects.add(sub);
			      }
			     Student s = new Student(name, marks,subjects);
			        //students.add(s);   
			          dao.save(s);
	                   break;
		 case 2: for (Student stu : dao.fndAll())  {
			          if(stu !=null)
			        	  System.out.println(stu);
			         }  
		             break;
		 case 3: System.out.println("enter the rollnumber ");
		               int r = sc.nextInt();
			          try {
				         Student searchStudent = dao.findOne(r);
				         System.out.println(searchStudent);
			           } catch (StudentNotFound e) {
				               e.printStackTrace();
			            }
		          break;
		case 4: System.out.println("enter the rollnumber ");
			    int roll = sc.nextInt();
			      dao.deleteOne(roll);
                   break;
		case 5:  Collections.sort(dao.fndAll());
		        for (Student stu :dao.fndAll())  {
	                if(stu !=null)
	        	  System.out.println(stu);
	         }   
		           break;
		case 6:  Collections.sort(dao.fndAll(),
				(s1,s2)-> s1.getName().compareTo(s2.getName()));
		
               for (Student stu :dao.fndAll())  {
                  if(stu !=null)
    	        System.out.println(stu);
     }   
           break;  
	case 7: /*Stream<Student> streamStu = students.stream();
	        Stream<Student> filtered = streamStu
		    .filter(stu -> stu.getMarks() > 90);  
	        List<Student> li=filtered.toList();
	        System.out.println(li);*/
		dao.fndAll().stream()
		.filter(stu -> stu.getMarks() > 90)
		.toList().forEach(stu->System.out.println(stu)); 
		   
		    break;
	case 8: List<String> topNames= dao.fndAll().stream()
	        .filter(stu -> stu.getMarks() > 90)
	        .map(stu->stu.getName())
	        .toList(); 
	        topNames.forEach(n-> System.out.println("top student name "+n));
	        break;
	case 9 : List<String> list= dao.fndAll().stream()
			                            .filter(stu->stu.getSubjects()
			                            .contains("java"))
			                            .map(stu->stu.getName())
			                            .toList();
	         list.forEach(n-> System.out.println("student name who has subject java "+n));
			break;
		 case -1: System.out.println("thanku for using ");          
	
		
		}
		  
	}while(choice!= -1);


	}

}