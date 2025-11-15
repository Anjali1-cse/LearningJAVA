package org.ycpait.geometryapp.entity;

public abstract class Shape {
	protected String color;

	public Shape(String color) {
		super();
		System.out.println("shape");
		
		this.color = color;
	}
	
	public abstract float calculateArea();
	public abstract String geInfo();
	public abstract float calculatePerimeter();
	public void draw() {
	
		System.out.println("shape drawn using color "+ this.color);
	}
}
