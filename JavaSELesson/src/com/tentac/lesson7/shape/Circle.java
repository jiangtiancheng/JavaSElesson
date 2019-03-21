package com.tentac.lesson7.shape;

public class Circle extends Shape{

	private double pi;
	private int r;
	
	public Circle(double pi,int r,String color){
		super(color);
		this.pi = pi;
		this.r = r;
	}
	public Circle(String color){
		super(color);
	}
	
	public Circle(double pi){
		this.pi = pi;
	}
	public Circle() {
		super();
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public double getArea(){
		return pi*r*r;
	}
	
	public double getPer(){
		return 2*pi*r;
	}
	public void showAll(){
		System.out.println("the area is :"+getArea());
		System.out.println("the per is :"+getPer());
		System.out.println("the color is :"+getColor());
		System.out.println("the pi is :"+this.pi);
		System.out.println("the r is :"+this.r);
	}
}
