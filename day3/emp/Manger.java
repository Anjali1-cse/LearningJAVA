
public class Manger extends Employee {
     private int incentives ;

	 public Manger(String name, int basicSalary,int incentives) {
		super(name,basicSalary);
		this.incentives = incentives;
	 }
	 
	 @Override
	    public double calculateSalary() {
	        return getBasicSalary()+ incentives ;
	    }
	    
	    @Override
	    void showDetail() {
	   	 System.out.println("id: "+ getId());
			 System.out.println("name: "+ getName());
			 System.out.println("sal: "+calculateSalary());
	    }
     
}
