package org.ycpait.geometrapp;

import static java.lang.System.out;

interface Printable{
    void print();
    static void of() {}
    default void printformat() {
    	System.out.println("default printFromat");
    }
}
public interface Drowable {
	//public static final int PX=1;
	//static final int PX=1;
	//publicfinal int PX=1;
     int PX=1;
     void draw();
}
 class Circle implements Drowable,Printable{

	@Override
	public void print() {
		System.out.println("Circle print");
		
	}

	@Override
	public void draw() {
		System.out.println("Circle draw");
		
	}
	 
 }
 class Main{
	 public static void main(String[] args) {
		Circle  d = new Circle();
		   d.draw();
		   d.print();
		}
 }
 
 