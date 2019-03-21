package com.tentac.GYM.person.bean;

public class Manager extends Person_base{

	private String department;

	public Manager() {
		super();
	}

	public Manager(String department,String id, String name, String sex, int age) {
		super(id,name,sex,age);
		this.department = department;
	}

	public String toString(){
		String msg = "["+this.getId()+"-"+this.getName()+"-"+
							this.getSex()+"-"+this.getAge()+"-"+
								this.getDepartment()+"]";
		return msg;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
