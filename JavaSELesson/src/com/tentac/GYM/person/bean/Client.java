package com.tentac.GYM.person.bean;

import java.util.Calendar;

public class Client extends Person_base{

	private Calendar in_time;
	private double fees;
	private Coach coach;
	private String phone_num;
	
	public String toString(){
		String msg = "["+this.id+"-"+this.name+"-"+
							this.age+"-"+this.sex+"-"+this.in_time.getTime().toString()+"-"+
								this.fees+"-"+this.coach.getName()+"-"+this.phone_num+"]";
		return msg;
	}
	public Client() {
		super();
	}
	
	public Client(Calendar in_time, double fees, Coach coach,String phone_num,String id, String name, String sex, int age) {
		super(id,name,sex,age);		//调用父类对应四个参数的构造方法，同时将父类定义的属性赋值
		this.in_time = in_time;
		this.fees = fees;
		this.coach = coach;
		this.phone_num = phone_num;
	}

	public Calendar getIn_time() {
		return in_time;
	}

	public void setIn_time(Calendar in_time) {
		this.in_time = in_time;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	
}
