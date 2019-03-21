package com.tentac.lesson7.shape;

public class Triangle extends Shape{

	int a;
	int b;
	int c;
	
	public Triangle(int a, int b, int c,String color) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getArea(){
		double s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
	public double getPer(){
		per = a+b+c;
		return per;
	}
	
	public void showAll(){
		System.out.println("the area is :"+getArea());
		System.out.println("the per is :"+getPer());
		System.out.println("the color is :"+getColor());
		System.out.println("the a is :"+this.a);
		System.out.println("the b is :"+this.b);
		System.out.println("the c is :"+this.c);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}
