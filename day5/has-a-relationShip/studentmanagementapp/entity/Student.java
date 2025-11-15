package org.ycpait.studentmanagementapp.entity;

public class Student {
	private static int count;
    private int rollNumber;
    // has-a relation composition
    private Address postalAddress;
    //Aggregation
    private Trainer instructor;
    
    
	public Trainer getInstructor() {
		return instructor;
	}
	public void setInstructor(Trainer instructor) {
		this.instructor = instructor;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public Address getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}
	public Student(int rollNumber, Address postalAddress) {
		super();
		count++;
		this.rollNumber = count;
		this.postalAddress = postalAddress;
	}
}
