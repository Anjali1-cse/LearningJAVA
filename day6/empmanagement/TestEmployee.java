package org.aitycp.empmanagement;

import java.util.Scanner;
import org.aitycp.empmanagement.entity.*;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int empCount = 0;
        int choice;

        do {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Register New Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee by ID");
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

                    Employee emp = null;
                    if (type == 1) {
                        System.out.print("Enter Hours: ");
                        int hours = sc.nextInt();
                        System.out.print("Enter Rate: ");
                        int rate = sc.nextInt();
                        emp = new WageEmployee(name,salary, hours, rate);
                    } else if (type == 2) {
                        System.out.print("Enter Incentives: ");
                        int inc = sc.nextInt();
                        emp = new Manger(name, salary, inc);
                    } else if (type == 3) {
                        System.out.print("Enter Incentive: ");
                        int inc = sc.nextInt();
                        System.out.print("Enter Target: ");
                        int target = sc.nextInt();
                        emp = new SalesManager(name, salary, inc, target);
                    }

                    employees[empCount++] = emp;
                    System.out.println(" Employee Registered Successfully!");
                    break;

                case 2:
                    System.out.println("\n=== All Employees ===");
                    if (empCount == 0) {
                        System.out.println("No employees found.");
                    } else {
                        for (int i = 0; i < empCount; i++) {
                            if (employees[i] != null)
                                employees[i].showDetail();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < empCount; i++) {
                        if (employees[i] != null && employees[i].getId() == searchId) {
                            employees[i].showDetail();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println(" Employee not found!");
                    break;

                case 4:
                    System.out.print("\nEnter Employee ID to Delete: ");
                    int delId = sc.nextInt();
                    boolean deleted = false;
                    for (int i = 0; i < empCount; i++) {
                        if (employees[i] != null && employees[i].getId() == delId) {
                            employees[i] = null;
                            deleted = true;
                            System.out.println(" Employee deleted successfully!");
                            break;
                        }
                    }
                    if (!deleted) System.out.println(" Employee not found!");
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