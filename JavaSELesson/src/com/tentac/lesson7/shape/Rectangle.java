package com.tentac.lesson7.shape;

public class Rectangle extends Shape{

	int weigth;
	int height;
	
	
	public Rectangle(int weigth, int height,String color) {
		super(color);
		this.weigth = weigth;
		this.height = height;
		
	}

	public Rectangle(){
		
		System.out.println("---------Rectangle()------------");
	}
	
	public Rectangle(String color){
//		super();
		System.out.println("---------Rectangle(String color)------------"+this.color);
	}
	
	public double getArea(){
		area = weigth *height;
		return area;
	}
	
	public double getPer(){
		per = (weigth +height)*2;
		return per;
	}
	
	
	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void showAll(){
		System.out.println("the area is :"+getArea());
		System.out.println("the per is :"+getPer());
		System.out.println("the color is :"+getColor());
		System.out.println("the height is :"+this.height);
		System.out.println("the width is :"+this.weigth);
	}
}
