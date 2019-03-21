package com.tentac.lesson2;

public class Test {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		
		double area = c1.getArea(100);
		System.out.println("面积是："+area);
		
		double arround = c1.getArroud(5);
		System.out.println("周长是："+arround);
		
		Circle c2 = new Circle("Blue");
		String col = c2.getColor();
		System.out.println("颜色是："+col);
		
		c2.setColor("Red");
		String newColor = c2.getColor();
		System.out.println("现在的颜色是："+newColor);
		
	}

}
