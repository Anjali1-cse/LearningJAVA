package geometryapp;

public class Circle extends Shape {
	private float radius;
	//private String color;
	
	Circle(float radius,String color){
		super(color);
		this.radius = radius;
		//this.color = color;
	}

	
	
	public float calculateArea() {
		return 3.14f*radius*radius;
	}
	
	@Override //built-in annotation to check if overriding is appropriate
	 // it is recommended to annotate for overriden methods
	// not mandate
	//overridden method
	public void draw() {
		super.draw();
		System.out.println("with radius"+ this.radius);
	}
	
	

}
