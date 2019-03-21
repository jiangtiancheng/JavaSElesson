package com.tentac.lesson7.shape;

public class Shape {

	double area;	//面积
	double per;		//周长
	String color;	//颜色
	
	public Shape(){
		System.out.println("---------Shape()------------");
	}
	
	public Shape(String color){
		this.color = color;
		
		System.out.println("---------Shape(String color)------------");
	}
	
	public double getArea(){
		return this.area;
	}
	
	public double getPer(){
		return this.per;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void showAll(){
		System.out.println("the area is :"+getArea());
		System.out.println("the per is :"+getPer());
		System.out.println("the color is :"+getColor());
	}
}
