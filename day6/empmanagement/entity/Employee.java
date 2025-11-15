package org.aitycp.empmanagement.entity;

public abstract class Employee implements Printable {
    private static int count;
    private int id;
    private String name;
    private double basicSalary;

    Employee(String name, double basicSalary) {
        count++;
        this.id = count;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + calculateSalary();
    }
}