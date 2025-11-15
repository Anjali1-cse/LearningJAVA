package org.ycpait.studentmangementpp.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Student implements Serializable,Comparable<Student>{
	//attributes
	 private static int count;
	 private int rollNumber;
	 private String name;
	 private float marks;
	 private List<String> subjects;
	 
	 public Student( String name, float marks){
		 //System.out.println("parameterized constructor");
		 count++;
		 this.rollNumber = count;
		 this.name =name;
		 this.marks= marks;
		
	 }
	
	 public List<String> getSubjects() {
		return subjects;
	}

	 public void setSubjects(List<String> subjects) {
		 this.subjects = subjects;
	 }

	 public Student( String name, float marks,List<String>subjects){
		 //System.out.println("parameterized constructor");
		 count++;
		 this.rollNumber = count;
		 this.name =name;
		 this.marks= marks;
		 this.subjects =subjects;
	 }
	 
	 public int getRollNumber() {
		return rollNumber;
	}


	 public String getName() {
		 return name;
	 }


	 public float getMarks() {
		 return marks;
	 }

	

	 public static int getCount(){
		 return count;
	 }
	 
	 void accept(int rollNumber, String name, float marks) {
		 this.rollNumber = rollNumber;
		 this.name =name;
		 this.marks= marks;
	 }
	 
	 // instance method
	 void display() {
		 System.out.println(rollNumber);
		 System.out.println(this.name);
		 System.out.println(this.marks);
	 }
	 
	 public String toString() {
		return  this.rollNumber+"\t   "+this.name+"\t   "+this.marks+"\t   "+this.subjects; 
		 
	 }

	 @Override
	 public int compareTo(Student o) {
		
		return (int)(marks - o.marks);
	 }
//	 @Override
//	 public int compare(Student s1,Student s2) {
//		
//		return (int)(s1.name.compareTo(s2.name));
//	 }
	
	 @Override
	 public int hashCode(){
		
		return this.name.length();
	 }
	 
	 @Override
	 public boolean equals(Object o){
		Student s = (Student)o;//down-casting
		return this.name.equals(s.name);
	 }

}
