package geometryapp;

public class Rectangle extends Shape{
	private float lenght;
	private float breadth;
	//private String color;
	public Rectangle(float lenght, float breadth, String color) {
		super(color);
		this.lenght = lenght;
		this.breadth = breadth;
		//this.color = color;
	}
	
	public float calculateArea() {
		return lenght*breadth;
	}
	public void draw() {
		super.draw();
		System.out.println("with lenght & breath "+ this.lenght +" & "+ this.breadth);
	}
	

}
