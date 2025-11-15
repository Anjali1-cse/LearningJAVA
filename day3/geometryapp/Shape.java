package geometryapp;

public class Shape {
	protected String color;

	public Shape(String color) {
		super();
		System.out.println("shape");
		
		this.color = color;
	}
	public void draw() {
	
		System.out.println("shape drawn using color "+ this.color);
	}
}
