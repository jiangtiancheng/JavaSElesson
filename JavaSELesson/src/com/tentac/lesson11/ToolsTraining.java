package com.tentac.lesson11;

import java.util.Calendar;
import java.util.Date;

import com.tentac.lesson5.Card;

public class ToolsTraining {

	public static void main(String[] args){
		
		int a = 10;
		int b = 12;
		boolean b1 = a == b;   //== 可以比较基本类型的值，即变量的字面量；
		
		Card c1 = new Card();
		Card c2 = new Card();
		boolean b2 = c1 == c2;	//== 可以比较引用类型的地址，即引用的值；
		
		boolean b3 = c1.equals(c2);
		
		Integer aa = 12;
		Integer bb = 12;
		boolean b4 = aa == bb;
		System.out.println("b4 is ;"+b4);
		boolean b5 = aa.equals(bb);
		System.out.println("b5 is ;"+b5);
		
		Integer aaa = new Integer(12);
		Integer bbb = new Integer(12);
		boolean b6 = aaa == bbb;
		System.out.println("b6 is ;"+b6);
		boolean b7 = aaa.equals(bbb);
		System.out.println("b7 is ;"+b7);
		
		char[] chars = {'a','b','c','A','B'};
		String str_chars = new String(chars);
		System.out.println(str_chars);
		
		byte[] str_byte = str_chars.getBytes();
		for(byte s:str_byte){
			System.out.println(s);
		}
		char[] chars2 =  str_chars.toCharArray();
		
		String s01 = new String("Abc");
		String s02 = new String("AbC");
		boolean b8 = s01.equalsIgnoreCase(s02);
		System.out.println(b8);
		
		String s03 = "error";
		String s04 = "error";
		
		boolean b9 = s03==s04;
		System.out.println("b9 is :"+b9);
		boolean b10 = s03.equals(s04);
		System.out.println("b10 is :"+b10);
		
		String s05 = new String("error");
		String s06 = new String("error");
		boolean b11 = s05==s06;
		System.out.println("b11 is :"+b11);
		boolean b12 = s05.equals(s06);
		System.out.println("b12 is :"+b12);
		
		//基本数据类型——————》字符串
		int i = 909;
		Integer ip = new Integer(i);
		String str_i = ip.toString();
		
		//字符串 ----》基本类型
		
		Date d1 = new Date();
		int date = d1.getDate();
		System.out.println(date);
		int day = d1.getDay();
		System.out.println(day);
		
		Calendar cal = Calendar.getInstance();
		Date dateTime = cal.getTime();
//		int week = cal.getw;
//		System.out.println(dateTime+"     "+week);
	}
}
