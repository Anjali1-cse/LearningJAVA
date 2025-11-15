package org.ycpait.studentmangementpp.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ycpait.studentmangementpp.entity.Student;
import org.ycpait.studentmangementpp.exception.StudentNotFound;

public class StudentDaoImpl {

	private List<Student> students;
	
	public StudentDaoImpl() {
		this.students = new ArrayList<Student>();
	}
	
	public void save(Student s) {
		this.students.add(s);
	}
	public List<Student> fndAll(){
		return students;
	}
	public Student findOne(int rollNumber) throws StudentNotFound {// exec
		 /*
          for(Student foundStudent: students ) {
          	if(foundStudent!=null) {
          		if(foundStudent.getRollNumber() == rollNumber) {
          	         return foundStudent; 
          			
          		}

          	}
          }*/
          
           StudentNotFound e = new StudentNotFound("Student with "
  					+ "rollNmuber " +rollNumber + " Not found");
                 //throw e;
           return this.students.stream()
        		   .filter( s-> s.getRollNumber()==rollNumber)
        		   .findFirst().orElseThrow(()->e);
                	  
	}
	public void deleteOne(int rollNumber) {
		 boolean isExist = false;
		    Iterator<Student> i = students.iterator();
		    while (i.hasNext()) {
		        Student foundStudent = i.next();
		        if (foundStudent != null) {
		            if (foundStudent.getRollNumber() == rollNumber) {
		                isExist = true;
		                i.remove(); 
		                
		                System.out.println("Student removed successfully."); 
		                break;
		            }
		        }
		    }

		    if (!isExist) {
		        StudentNotFound e = new StudentNotFound("Student with rollNmuber " + rollNumber+ " Not found");
		        try {
		            throw e;
		        } catch (StudentNotFound ex) {
		            System.err.println(ex.getMessage()); // A cleaner way to show the error
		        }
		    }
	}
	

	
}
