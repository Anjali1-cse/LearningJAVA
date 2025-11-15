package org.aitycp.empmanagementapp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.aitycp.empmanagement.entity.*;
import org.aitycp.empmanagementapp.execption.EmployeeNotFound;



public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees  =  new ArrayList<Employee>();
        int empCount = 0;
        int choice;

        do {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Register New Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee by ID");
		    System.out.println("5. Sort Employee by salary");
		    System.out.println("6. Sort Employee by name");
            System.out.println("-1. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nSelect Employee Type:");
                    System.out.println("1. Wage Employee");
                    System.out.println("2. Manager");
                    System.out.println("3. Sales Manager");
                    int type = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                  
                    if (type == 1) {
                        System.out.print("Enter Hours: ");
                        int hours = sc.nextInt();
                        System.out.print("Enter Rate: ");
                        int rate = sc.nextInt();
                        Employee emp = new WageEmployee(name,salary, hours, rate);
                        employees.add(emp);
                    } else if (type == 2) {
                        System.out.print("Enter Incentives: ");
                        int inc = sc.nextInt();
                        Employee emp  = new Manger(name, salary, inc);
                          employees.add(emp);
                        
                    } else if (type == 3) {
                        System.out.print("Enter Incentive: ");
                        int inc = sc.nextInt();
                        System.out.print("Enter Target: ");
                        int target = sc.nextInt();
                        Employee emp = new SalesManager(name, salary, inc, target);
                        employees.add(emp);
                    }

                    System.out.println(" Employee Registered Successfully!");
                    break;

                case 2:
                    System.out.println("\n=== All Employees ===");
                   
                        for (Employee e:employees) {
                        	if(e !=null)
      			        	  System.out.println(e);
                            System.out.println("--------------------");
                        }
                        
                    
                    break;

                case 3:
                    System.out.print("\nEnter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Employee foundEmp:employees) {
                        if (foundEmp != null && foundEmp.getId() == searchId) {
                            found = true;
                            System.out.println(foundEmp);
                            break;
                        }
                    }
                    if (!found) {
                    	EmployeeNotFound e = new EmployeeNotFound("Employee with EmpNO " +searchId + " Not found");
                    	try{
            				throw e;
            			}catch(EmployeeNotFound ex) {
            				ex.printStackTrace();
            				
            			}
                    }
                    break;

                case 4:
                    System.out.print("\nEnter Employee ID to Delete: ");
                    int delId = sc.nextInt();
                    boolean isExist = false;
                     Iterator<Employee> i = employees.iterator();
                         
                     while (i.hasNext()) {
                    	 Employee foundEmp = i.next();
     			        if (foundEmp != null) {
     			            if (foundEmp.getId() == delId) {
     			                isExist = true;
     			                i.remove(); 
     			                
     			                System.out.println("Employee removed successfully."); 
     			                break;
     			            }
     			        }
     			    }

     			    if (!isExist) {
     			     EmployeeNotFound e = new EmployeeNotFound("");
     			        try {
     			            throw e;
     			        } catch (EmployeeNotFound ex) {
  
     			            System.err.println(ex.getMessage()); // A cleaner way to show the error
     			        }}
                    break;
                
                	 
                case -1:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != -1);

        sc.close();
    }
}