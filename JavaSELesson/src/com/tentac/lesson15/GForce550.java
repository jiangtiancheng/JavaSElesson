package com.tentac.lesson15;

public class GForce550 implements VideoCard_Inf{

	String name;
	public GForce550(){
		this.name = "GForce550 is Video Card.";
	}
	public void setName(String name){
		this.name = name;
	}
	//显示方法
	public void display(){
		System.out.println("GForce is video card ,is working ....");
	}
		
	public String getName(){
		return this.name;
	}
}
