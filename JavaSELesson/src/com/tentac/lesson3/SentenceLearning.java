package com.tentac.lesson3;

public class SentenceLearning {

	public static void main(String[] args){
		//hwgiuqwhrqw
		int age = 16;
		
		if(age>=4 && age <=15){
			age += 10; // age = age+ 10;
		}
		System.out.println(age);
		//
		if(age>=4 && age <=15){
			age += 10; // age = age+ 10;
		}else{
			age -= 5;
		}
		System.out.println(age);
		//
		int sof = 90;
		String level = "";
		if(sof>=85){
			level = "A";
		}else{
			level = "B";
		}
		System.out.println("level is :"+level);
		
		/*
		 * 判断给定的分数，属于哪一个档；
		 * 分5档：A,B,C,D,E;
		 * A:90~100;B:89~75;C:74~65;D:64~60;E:~
		 */
		int souce = 102;
		String flag = "";
		if(souce>=90 && souce<=100){
			flag = "A";
		}else if(souce >=75 && souce<=89){
			flag = "B";
		}else if(souce >=65 && souce<=74){
			flag = "C";
		}else if(souce >=60 && souce<=64){
			flag = "D";
		}else{
			flag = "E";
		}
		System.out.println("flag is :"+flag);
		
		double randomValue = Math.random();
		System.out.println("randomValue is :"+randomValue);
		
		int randomValue_Int = (int)(Math.random()*1000);
//		System.out.println("randomValue_Int is :"+randomValue_Int);
		
		SentenceLearning sl = new SentenceLearning();
		System.out.println("randomValue_Int is :"+sl.getIntegerValue());
		
		sl.getSomeIntVale(10);
		
	}
	
	public int getIntegerValue(){
		int p = 0;
		int randomValue_Int = (int)(Math.random()*1000);
		if(randomValue_Int>=100 && randomValue_Int<1000){
			if(randomValue_Int % 2 == 1){
				p = randomValue_Int;
			}
		}
		return p;
	}
	
	public void getSomeIntVale(int num){
		int p = 0;
		for(int i=0;i<num;i++){
			int randomValue_Int = (int)(Math.random()*1000);
//			if(randomValue_Int>=100 && randomValue_Int<1000){
//				if(randomValue_Int % 2 == 1){
//					p = randomValue_Int;
//					System.out.println("第"+i+"次："+"p :"+p);
//				}
//			}
			System.out.println("第"+i+"次："+"randomValue_Int :"+randomValue_Int);
		}
	}
}

















