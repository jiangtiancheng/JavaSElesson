package com.tentac.lesson2;

public class Circle {

	private double r;
	private String color;
	private double arroud;
	
	public Circle(){
		
	}
	public Circle(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String col){
		this.color = col;
	}
	/*
	 * 该方法用于求周长
	 * 参数只有一个r ，为double类型
	 */
	public double getArroud(double r){
		double pai = 3.14159;			//定义pai的值；
		double arroud = 2 * pai * r;	//求周长
		return arroud;
	}
	/**
	 * 该方法用于求特定半径长度的圆面积
	 * @param r   半径
	 * @return 面积
	 * @author yanghb
	 * @since  2017-7-26
	 */
	public double getArea(double r){
		double pai = 3.14159;
		double area = 0.0d;				//求面积
		area = pai * r * r;
		return area;
	}
}
