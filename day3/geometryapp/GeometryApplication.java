package geometryapp;

public class GeometryApplication {

	public static void main(String[] args) {
		Circle c = new Circle(2.3f,"red");
		System.out.println("Area of circle is: "+c.calculateArea());
		c.draw();
		Rectangle r = new Rectangle(23f,52.2f,"blue");
		System.out.println("Area of Rectangle is: "+r.calculateArea());
		r.draw();
		
	}

}
