package com.tentac.lesson7.shape;

import com.tentac.lesson8.TestInstanceOf;

public class Test {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(10,5,"blue");
		Triangle tri = new Triangle(3,4,5,"red");
		Circle cir = new Circle(3.14,5,"green");
		
		TestInstanceOf tio = new TestInstanceOf();
		tio.addOne(tri);
		
//		Shape s1 = new Rectangle(10,15,"Black");
//		
//		Shape s2 = new Triangle(3,4,5,"Blue");
//		
//		s1.showAll();
//		s2.showAll();
		
//		Rectangle r1 = new Rectangle();
//
//		Rectangle r2 = new Rectangle("blue");
//		
//		Rectangle r3 = new Rectangle(10,5,"blue");
//		r3.showAll();
//		double area = r3.getArea();
//		System.out.println(area+"   "+r3.getColor());
//		
//		Triangle t1 = new Triangle(3,4,5,"Red");
//		t1.showAll();
	}

}
