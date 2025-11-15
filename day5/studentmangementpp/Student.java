package studentmangementpp;

public class Student {
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
	 // overload method
	 void display(String format) {
		 System.out.println("RollNumber \t Name \t Marks"); 
		 
		 for(int i= 1; i<=40;i++) {
			 System.out.print(format);
		 }
		 System.out.println(); 
		 System.out.println(this.rollNumber+"\t   "+this.name+"\t   "+this.marks); 
	 }
	
	

}
