package com.tentac.GYM.person.bean;

public class Coach extends Person_base{

	private String coach_type;
	private double price;
	
	public Coach() {
		super();
	}

	public Coach(String coach_type, double price,String id, String name, String sex, int age) {
		super(id,name,sex,age);			//调用父类对应四个参数的构造方法，同时将父类定义的属性赋值
		this.coach_type = coach_type;
		this.price = price;
	}

	public String toString(){
		String msg = "["+this.getId()+"-"+this.getName()+"-"+
							this.getSex()+"-"+this.getAge()+"-"+
								this.getCoach_type()+this.getPrice()+"]";
		return msg;
	}
	public String getCoach_type() {
		return coach_type;
	}

	public void setCoach_type(String coach_type) {
		this.coach_type = coach_type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
