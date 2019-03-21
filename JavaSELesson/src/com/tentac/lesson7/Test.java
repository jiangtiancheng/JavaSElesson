package com.tentac.lesson7;

import com.tentac.lesson5.Card;

public class Test {

	Test t = new Test();
	String id = new String("");;
	static int age = 0;
	
	public void getSth1(){
		
	}
	public static void getSth2(){
		Test.age = 6;
	}
	public static void main(String[] dd) {

		Test t = new Test();
		t.id = "89";
		Circle c1 = new Circle(3.1415927);
		c1.pi=3;
		Circle.pi = 9;
//		c1.setPi(3.1415);
		c1.setR(5);
		System.out.println(c1.getArea());
		
		Circle c2 = new Circle();
//		c2.setPi(3.14);
		System.out.println(c2.getArea());
		
		int a = Math.abs(-39);
		double b = Math.round(34.6678);
		System.out.println(b);
		
		String str = "    yang hb-tentac-China-Liao Ning-Da lian    ";
		String[] strings = str.split("-");
		int length = strings.length;
		int str_length = str.length();
		String new_str = str.trim();
		int new_str_length = new_str.length();
		System.out.println(strings[2]+"     "+length+"   字符串长度是： "+str_length+"     new str's length is :"+new_str_length);
		
		char[] str_chars = new_str.toCharArray();
		boolean flag = new_str.contains("D");
		System.out.println(flag);
		
		String s1 = new_str.substring(7);
		System.out.println(s1);
		
		String s2 = new_str.substring(7, 14);
		System.out.println(s2);
		
		boolean b1 = new_str.isEmpty();
		
		String str2 = "apple";
		String str3 = "app-le";
		boolean b2 = str2.equals(str3);
		System.out.println(b2);
		
		String str4 = new String("apple");
		String str5 = new String("apple");
		boolean b3 = str4.equals(str5);
		System.out.println(b3);
		
		Card card1 = new Card();
		Card card2 = new Card();
		boolean b4 = card1.equals(card2);
		System.out.println(b4);
		
		Integer t1 = new Integer(250);
		Integer t2 = new Integer(251);
		boolean b5 = t1.equals(t2);
		System.out.println(b5);
		boolean b6 = t1 == t2;
		System.out.println(b6);
	}

}
