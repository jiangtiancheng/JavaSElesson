package com.tentac.lesson2;

public class Employee {

	private String id;
	private String name;
	private double salary;
	private Department dept;
	public Employee(String id, String name, double salary, Department dept) {
		super();
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee(String id, String name) {
		this();
		
		this.id = id;
		this.name = name;
		System.out.println("public Employee(String id, String name) 已经被调用运行.....");
		
	}
	public Employee() {
		System.out.println("public Employee() 已经被调用运行.....");
	}
	
	public static void main(String[] args){
		Employee e = new Employee("10010","yanghb");
	}
	
	public int drink(int n){
		for(int i=n;i>=3;i-=2){
			n++;
		}
		return n;
	}
}
