package com.tentac.lesson1;

import java.math.BigDecimal;

public class Goods {

	String id;
	String producer;
	String name;
	double price;
//	public Goods(String id,String prod,String name,double price){
//		
//		this.producer = prod;
//		this.name = name;
//		this.price = price;
//	}
	public Goods(String id,String name){
		this.id = id;
		
		this.name = name;
	}
	public Goods(){
		
	}
	public static void main(String[] args){
	
		int i = 1;
	    boolean b = i !=1 && (i++)==2;//短路与, i++不执行
	    System.out.println(b);//false
	    System.out.println(i);//1
	    
	    b = i !=1 & (i++)==2; //非短路运算, i++执行
	    System.out.println(b);//false
	    System.out.println(i);//2
	    
	    b = i==2 || (i++)==2;//短路或. i++不执行
	    System.out.println(b);//true
	    System.out.println(i);//2
	    
	    int t = 80;
	    String result = (t >=85 && t<=95)?"优秀":"良好";
	    System.out.println(result);

	    double aa = 23;
	    int bb = 99;
	    double cc = aa + bb;
	    
	    short ss = 23;
	    byte bbs = 44;
	    int sh = ss + bbs;
//		int age = 12;
//		char sex = '男';
//		boolean isChild = age<16;
//		boolean isMan = sex=='男';
//		boolean isBoy = isChild && isMan;
//		System.out.println(isBoy);
//		
//		boolean isGirl = isChild && ! isMan;
//		System.out.println(isGirl);
//		
//		boolean isKid = isBoy || isGirl;
//		System.out.println(isKid);

//		Goods g1 = new Goods();
//		g1.id = "1234567890";
//		g1.producer = "IBM";
//		g1.name = "suibian";
//		g1.price = 1234.099d;
//		
////		System.out.print(g1.name);
//		
//		Goods g2 = new Goods("987654","NewSoft");
//		String str1 = g1.id;
//		String str2 = g2.name;
//		
//		System.out.println(str1 + "---"+str2);
//		
//		short s1 = (short)3.3;
//		System.out.println(s1);
//		
//		float f1 = 3.4f;
//		
//		double d1 = 3.14154927D;
//		
//		double d2 = f1;
////		long ds2 = 100L;
//		
//		BigDecimal D;
//		
//		char c1 = '让';
//		char c2;
//		
////		float f5 = 4e1;
//		char c3 = '\u123f';
//		
//		byte b1 = 120;
//		byte b2 = 40;
////		byte b3 = b1 + b2;
//		
//		String st1 = new String("abc");
//		String st2 = new String("abc");
//		
//		boolean bn1 = st1 == st2;
//		boolean bn2 = st1.equals(st2);
//		System.out.println("bn1 is :"+bn1 +"       "+"bn2 is :"+bn2);
	
	}
}
