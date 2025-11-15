package org.aitycp.empmanagementapp.execption;
public class EmployeeNotFound extends Exception{

	public EmployeeNotFound() {
		super();
	}
	public EmployeeNotFound(String message) {
		super(message);
	}
}
