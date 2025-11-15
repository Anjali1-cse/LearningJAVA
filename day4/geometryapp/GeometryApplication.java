package org.ycpait.geometryapp;
//
//import org.ycpait.geometryapp.entity.*;

import org.ycpait.geometryapp.entity.Circle;
import org.ycpait.geometryapp.entity.Rectangle;
import org.ycpait.geometryapp.entity.Shape;

public class GeometryApplication {

	public static void main(String[] args) {
//		Shape s ;
//		 Circle c= new Circle(2.3f,"red");
//		  s=c;//upcasting
//		//Shape s2 = new Shape() con't instantiate abstract class
//		System.out.println("Area of circle is: "+s.calculateArea());
//		s.draw();
//		Circle c1= (Circle)s;//downcasting 
//		
//		System.out.println(c1.getPi());
//		System.out.println(c.geInfo());
     	Rectangle r = new Rectangle(23f,52.2f,"blue");
    	System.out.println("Area of Rectangle is: "+r.calculateArea());
	   r.draw();
		
		Shape s = new Circle(2.3f,"red");
		
		// invoking generalized methods
		 s.calculateArea();
		 s.calculatePerimeter();
		 s.draw();
		 s.geInfo();
		// invoking specialized method
		 Circle c = (Circle)s;
		 c.getPi();
	
	}

}
