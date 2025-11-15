package org.aitycp.empmanagement.entity;

public class SalesManager extends Employee {
    private int incentive;
    private int target;

    public SalesManager(String name, double basicSalary, int incentive, int target) {
        super(name, basicSalary);
        this.incentive = incentive;
        this.target = target;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + incentive + (0.02 * target);
    }

    @Override
    public void showDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}