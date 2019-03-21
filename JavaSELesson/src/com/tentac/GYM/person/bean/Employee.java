package com.tentac.GYM.person.bean;

public class Employee extends Person_base{

	private String job_type;
	private Manager manager;
	private String phone;
	
	public Employee() {
		super();
	}

	public Employee(String job_type, Manager manager,String phone,String id, String name, String sex, int age) {
		super(id,name,sex,age);
		this.job_type = job_type;
		this.manager = manager;
		this.phone = phone;
	}

	public String toString(){
		String msg = "["+this.getId()+"-"+this.getName()+"-"+
							this.getSex()+"-"+this.getAge()+"-"+
								this.getJob_type()+"-"+this.getManager().getName()+"-"+this.phone+"]";
		return msg;
	}
	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
