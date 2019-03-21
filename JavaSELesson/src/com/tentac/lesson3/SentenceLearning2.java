package com.tentac.lesson3;

public class SentenceLearning2 {

	public static void main(String[] args) {

		int p = 0;
		for(int i=0;i<50;i++){
			
			p = i;
			if(p==36){
//				break;
				continue;
			}
			System.out.println("第"+i+"次： "+p);
		}
		SentenceLearning2 sl2= new SentenceLearning2();
		
		sl2.drawShape(9, 9, '*', ' ');
	}
	
//	public int getTotal(int a,int b,int c){
//		int total = 0;
//		
//	}
	public void drawShape(int a,int b,char c,char d){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				if(i==0 || i==a-1 ||j==0 ||j==b-1){
					System.out.print(c);
				}else{
					System.out.print(d);
				}
			}
			System.out.println();
		}
	}

}
