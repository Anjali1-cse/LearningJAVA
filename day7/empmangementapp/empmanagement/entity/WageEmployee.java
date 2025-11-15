package org.aitycp.empmanagement.entity;
public class WageEmployee extends Employee {

    private int hours;
    private int rate;

    public WageEmployee(String name, double basicSalary, int hours, int rate) {
        super(name, basicSalary);
        this.hours = hours;
        this.rate = rate;
    }

    

	@Override
    public double calculateSalary() {
        return getBasicSalary()+(hours*rate);
    }
    
    @Override
    public void showDetail() {
   	 System.out.println("id: "+ getId());
		 System.out.println("name: "+ getName());
		 System.out.println("sal: "+calculateSalary());
    }
}
