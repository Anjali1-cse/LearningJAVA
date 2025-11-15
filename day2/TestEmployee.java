import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Employee  e= null;
		Scanner sc = new Scanner(System.in);
		int choice=-1;
		
		do{
			System.out.println(" welcome to emp_creation_system!");
			for(int i= 1; i<=40;i++) {
				 System.out.print("=");
			 }
			System.out.println(); 
		    System.out.println("1. register new Empolyee");
		    System.out.println("2. Display Empolyee Details");
		    System.out.println("-1. Exit");
		    System.out.println("enter your choice!");
		    choice = sc.nextInt();// accepting value
		    
		switch(choice) {
		
		 case 1:  e= new Employee("anjali", 500.56);
	                   break;
		 case 2:  if(e!=null)
			        e.showDetail("*");
		             break;
		 case -1: System.out.println("thanku for using ");          
			        
		
		}
		  
	}while(choice!= -1);
		 
	

	}

}
