package com.tentac.lesson7;

public class Circle {

	public static double pi;
	private int r;
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
}
