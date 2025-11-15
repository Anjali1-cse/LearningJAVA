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
	 
	 public int getRollNumber() {
		return rollNumber;
	}

	 public void setRollNumber(int rollNumber) {
		 this.rollNumber = rollNumber;
	 }

	 private static void setCount(int count) {//either write this with private access specifier  or no need to make it
			//it is also called as helper methods and can be accesed in same claas
		Student.count = count;
	}

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public float getMarks() {
		 return marks;
	 }

	 public void setMarks(float marks) {
		 this.marks = marks;
	 }

	 public Student(String name, float marks){
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
	 // overload method
	 void display(String format) {
		 System.out.println("RollNumber \t Name \t Marks"); 
		 
		 for(int i= 1; i<=40;i++) {
			 System.out.print(format);
		 }
		 System.out.println(); 
		 System.out.println(this.rollNumber+"\t   "+this.name+"\t   "+this.marks); 
	 }
	 @Override
	//overriden method this  method return String which is useful imfomation about object
	 public String toString(){
	     return this.rollNumber+"\t   "+this.name+"\t   "+this.marks;
	 }
	

}
