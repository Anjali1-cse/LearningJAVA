import java.util.HashSet;
import java.util.Set;

import org.ycpait.studentmangementpp.entity.Student;

public class DemoHashCodeEquals {

	public static void main(String[] args) {
		Set<Student> students= new HashSet<Student>();
		
		Student s1 = new Student("anjali",85);
		Student s2 = new Student("Saini",88);
		 
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
	}

}
