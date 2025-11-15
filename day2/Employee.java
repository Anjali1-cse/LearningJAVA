public class Employee {
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
     public double calculateSalary() {
    	 return basicSalary*2.3;
     }
     public static int getCount(){
		 return count;
	 }
     void showDetail() {
    	 System.out.println("id: "+id);
		 System.out.println("name: "+name);
		 System.out.println("sal: "+calculateSalary());
     }
     
     void showDetail(String format) {
		 System.out.println("ID \t Name \t SALARY"); 
		 
		 for(int i= 1; i<=40;i++) {
			 System.out.print(format);
		 }
		 System.out.println(); 
		 System.out.println(this.id+"\t   "+this.name+"\t   "+calculateSalary()); 
	 }
}
