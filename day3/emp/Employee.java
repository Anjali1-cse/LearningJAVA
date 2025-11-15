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
    	 return basicSalary;
     }
     
     public static int getCount(){
		 return count;
	 }
     void showDetail() {
    	 System.out.println("id: "+id);
		 System.out.println("name: "+name);
		 System.out.println("sal: "+calculateSalary());
     }
     
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
	 void showDetail(String format) {
		 System.out.println("ID \t Name \t SALARY"); 
		 
		 for(int i= 1; i<=40;i++) {
			 System.out.print(format);
		 }
		 System.out.println(); 
		 System.out.println(this.id+"\t   "+this.name+"\t   "+calculateSalary()); 
	 }
}
