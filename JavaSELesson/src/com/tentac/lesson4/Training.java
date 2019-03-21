package com.tentac.lesson4;

import com.tentac.lesson1.Card;

public class Training {

//	public String[] produceFullNumbers(String p,String[] last4Nubs){
//		
//	}
	public String[] getLast4Numbers(int count){
		
		String[] last4Numbers = new String[count];
		System.out.println("last4Numbers 的长度是："+last4Numbers.length);
		
		for(int i=0;i<count;i++){
			int randomNumb = (int)(Math.random()*10000);
			
			Integer intRandomNum = new Integer(randomNumb);   //用基本数据类型int的包装类Integer类，来将基本数据类型变量randomNumb转换成引用类型，这样它就有了自己的属性和方法。
			String temp = intRandomNum.toString();
			
			
			String pp = Integer.toString(randomNumb);    //另一种将基本类型int转换字符串对象的方式。

			
			int length = temp.length();
			
			if(length==3){
				temp = "0"+temp;
			}else if(length ==2){
				temp = "00"+temp;
			}else if(length ==1){
				temp = "000"+temp;
			}
			last4Numbers[i] = temp;
		}
		return last4Numbers;
	}
	public static void main(String[] args) {

		Training tr = new Training();
		String[] cardsLast4Numstr = tr.getLast4Numbers(30);
		
		for(int i=0;i<cardsLast4Numstr.length;i++){
			String s = cardsLast4Numstr[i];
			System.out.println(s);
		}
		Card[] cards = new Card[3];
		//创建三个card对象，并通过构造器为两个属性赋值；
		Card c1 = new Card("1234-5678-9012-2241","yang-hai-bin1");
		Card c2 = new Card("1234-5678-9012-3344","yang-hai-bin2");
		Card c3 = new Card("1234-5678-9012-5204","yang-hai-bin3");
		//分别将三个card对象，赋值给cards数组里的每一个位置
		cards[0] = c1;
		cards[1] = c2;
		cards[2] = c3;
		
		for(Card c:cards){
//			Card t = c;
			String card_num = c.getCardNum();
			String user_name = c.getUserName();
			System.out.println(card_num+"     "+user_name);
		}
		
//		String[] str_array = new String[3];
//		for(int i=0;i<str_array.length;i++){
//			String q = str_array[i];
//			System.out.println("NO: "+(i+1)+"  是："+q);
//		}
//		int[] k = new int[5];   //动态方式声明一个数组
//		for(int i=0;i<k.length;i++){
//			int q = k[i];
//			System.out.println("NO: "+(i+1)+"  是："+q);
//		}
//		k[0] = 567;
//		k[1] = 89;
//		k[2] = 67;
//		k[3] = 879;
//		k[4] = 5607;
//		k[3] = 8999;
//		for(int i=0;i<k.length;i++){
//			int q = k[i];
//			System.out.println("NO: "+(i+1)+"  是："+q);
//		}
		
//		int[] a = {12,34,56,10,0,6,67,234,900};		//静态方式声明一个数组
//		String[] str_array = {"uyt","0987","234","iu7","008io","yang","aib","yhb"};     //静态方式声明一个数组
//		
//		for(String s:str_array){
//			String temp = s;
//			System.out.println(s);
//		}
//		int temp = a[2];
//		
//		System.out.println(temp);
//		
//		int a_length = a.length;
//		for(int i = 0;i<a_length;i++){
//			int p = a[i];
//			System.out.println("NO: "+(i+1)+"  是："+p);
//		}
		
//		for(int i=0;i<5;i++){
//			
//			System.out.println("i is :"+i);
//			for(int j = 0;j<10;j++){
//				if(j % 2 ==0){
//					continue;
//				}
//				System.out.println("j is :"+j);
//			}
//		}
		
//		for(int i=1;i<10;i++){
//			System.out.println(" "+i);
//			int j = 1;
//			for(j=1;j<=i;j++){
//				if(j==9){
//					break;
//				}
//				System.out.print(" "+j);
//				
//			}
//			
//		}
		
//	double i;
//	double sum=0;
//	for(i=1; i<=2;i++){
//		sum+=1/i;
//		}
//	System.out.println(sum);
//	
//	Training tr = new Training();
//	System.out.println(tr.getTotal(10));
	}

	public double getTotal(int n){
		double total = 0.0d;
		
		for(int i=1;i<=n;i++){
			
			total += 1.0d/i;
		}
		return total;
	}
}

