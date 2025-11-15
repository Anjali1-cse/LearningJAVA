package studentmangementpp;

public class StudentMangementApplication {

	public static void main(String[] args) {
		 System.out.println("no of Student register are: "+ Student.getCount());
		// create a reference of student type
		Student s;
		 System.out.println("before");
		//System.err.println(s);//error
		// create object and assign to reference variable
		s= new Student(101,"anjali",99.95f);
		Student s1 = new Student(202,"abc",76.7f);
		
		/*System.out.println(s.rollNumber);
		  System.out.println(s.name);
		  System.out.println(s.marks);
		 s.rollNumber=1;// to stop this we make sure rollnumber
		 s.name="anjali";// is not accessible outside the class
		 s.marks=88.5f; //in which declared*/
		
		//s.accept(1, "anjali", 99.55f);
		//s1.accept(2, "archana", 89.36f);
		
		//s.display();
		//s1.display();
		
	
		s.display("*");
		s1.display("*");
		
	}

}
