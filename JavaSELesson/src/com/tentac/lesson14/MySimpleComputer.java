package com.tentac.lesson14;

public class MySimpleComputer {

	public double comput(double a,double b,char c){
		
		double result = 0.0;
		
		switch(c){
		
		case '+':
			result = a+b;
			break;
			
		case '-':
			result = a-b;
			break;
			
		case '*':
			result = a*b;
			break;
		
		case '/':
			result = a/b;
			break;
		
		default:
			result = 0;
			System.out.println("输入的数字或是运算符有错！");
		
		}
		return result;
	}
	
	public static void main(String[] args){
		MySimpleComputer msc = new MySimpleComputer();
		double result = msc.comput(34.90,23.45, '-');
		System.out.println(result);
	}
}
