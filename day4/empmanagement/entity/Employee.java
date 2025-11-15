package org.aitycp.empmanagement.entity;
public abstract class Employee {
	 private static int count;
     private int id;
     private String name;
     private double basicSalary;
     
     
     Employee( String name, double basicSalary){
    	 count++;
    	 this.id= count;
    	 this.name= name;
    	 this.basicSalary= basicSalary;
     }
     public abstract double calculateSalary() ;
     
     public static int getCount(){
		 return count;
	 }
    public abstract void showDetail();
     
     public int getId() {
		return id;
	}
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getBasicSalary() {
		 return basicSalary;
	 }
	 public void setBasicSalary(double basicSalary) {
		 this.basicSalary = basicSalary;
	 }
	
	 public String toString() {
		  return this.id+"\t   "+this.name+"\t   "+calculateSalary();
	 }
}
