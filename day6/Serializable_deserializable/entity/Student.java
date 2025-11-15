package org.ycpait.studentmangementpp.entity;

import java.io.Serializable;

public class Student implements Serializable {
	//attributes
	 private static int count;
	 private int rollNumber;
	 private String name;
	 private float marks;
	 
	/* public Student(){
		 System.out.println("inside student");
		 this.rollNumber = 1;
		 this.name= "Guest";
		 this.marks=500.2f;
	 }*/
	 
	 public Student( String name, float marks){
		 //System.out.println("parameterized constructor");
		 count++;
		 this.rollNumber = count;
		 this.name =name;
		 this.marks= marks;
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
		return  this.rollNumber+"\t   "+this.name+"\t   "+this.marks; 
		 
	 }
	
	
	

}
