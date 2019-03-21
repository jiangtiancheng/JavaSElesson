package com.tentac.GYM.person.bean;
/**
 * 这是“客户类”和“员工类”的父类，定义了他们的共同属性及方法；
 * 本类具有两个构造方法：public Person_base()；public Person_base(String id, String name, String sex, int age)
 * 本类为自有的四个受保护的属性提供了统一的公共的读写方法，get***();set***();
 * @author Administrator
 *
 */
public class Person_base {

	protected String id;	//无论是员工还是客户，都有唯一标识他们的id（如，员工编号、客户编号）
	protected String name;	//姓名
	protected String sex;	//性别
	protected int age;		//年龄
	
	//一个默认构造方法
	public Person_base() {
		super();
	}
	//一个带有四个参数的构造方法，调用它可以为本类四个属性赋予初值
	public Person_base(String id, String name, String sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
