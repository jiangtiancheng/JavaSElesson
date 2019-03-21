package com.tentac.lesson5;

import java.util.Arrays;

public class Test {

	public int getSum(int count){
		int i= 0;
		int result = 0;
		while(i<=count){
			result = result + i;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		
		Card c1 = new Card();
		
//		Card c2 = new Card("12345678","yanghb");
		
//		System.out.println(c2.getCardNum());
		
//		c1.setCardNum("9876543");
//		c1.setCardUserName("yanghb");
//		System.out.println(c1.getCardNum()+"           "+c1.getCardUserName());
		
		CardFactory cf = new CardFactory();
		String[] last4Numbers = cf.getLast4Numbers(20);
		
//		for(String s: last4Numbers){
//			System.out.println(s);
//		}
//		
		String[] fullCardNumbs = cf.produceFullCardNum("1234-5678-9012-", last4Numbers);
		int index = 1;
		for(String s: fullCardNumbs){
			System.out.println("完整的卡号："+index+":"+s);
			index++;
		}
		
		Card[] cards = cf.produceCardObjects("guangtouqiang", fullCardNumbs);
		for(Card c:cards){
			Card cc = c;
			System.out.println(cc.getCardNum()+"    "+cc.getCardUserName());
		}
		
//		int[] a = {12,56,7,8,90,-34,-7,123};
//		Arrays.sort(a);
//		for(int t:a){
//			System.out.println(t);
//		}
//		Test t = new Test();
//		int total = t.getSum(10);
//		System.out.println(total);
		
//		while(true){
//			System.out.println("IBM");
//		}
		
	}

}
