package com.tentac.lesson10.imp;

import com.tentac.lesson10.interf.CardFactoryInf;
import com.tentac.lesson10.interf.EmployeeInfoDaoInf;
import com.tentac.lesson10.interf.UserInfoDaoInf;
import com.tentac.lesson5.Card;

public class CardFactoryImp implements CardFactoryInf,UserInfoDaoInf,EmployeeInfoDaoInf{

	public CardFactoryImp(){
//		this.MAX_VALUE = "90";
	}
	public String[] getRandomLast4Nums(int count){
		
		String[] last4Nums = new String[count];
		
		for(int i=0;i<count;i++){
			int temp = (int)(Math.random()*10000);
			String lastNum = Integer.toString(temp);
			if(lastNum.length()==3){
				lastNum = "0"+lastNum;
			}else if(lastNum.length()==2){
				lastNum = "00"+lastNum;
			}else if(lastNum.length()==1){
				lastNum = "000"+lastNum;
			}
			last4Nums[i] = lastNum;
		
		}
		return last4Nums;
	}
	
	public Card[] buildCardObjects(int count,String begin_nums,String[] last4Nums,int account){
		
		if(count == last4Nums.length){
			Card[] cards = new Card[count];
			for(int i=0;i<count;i++){
				String fullCardNum = begin_nums.concat(last4Nums[i]);
				String userName = "SomeBody-"+i;
				Card c = new Card(fullCardNum,userName,account);
				
				//将符合规格的卡对象存入事先准备好的card类型数组中
				cards[i] = c;
			}
			return cards;
		}else{
			System.out.println("参数输入有误！");
			return null;
		}
		
		
	}
	
	public Card[] buildLuckyCardObjects(Card[] card,String luckyNum){
		
		int count = 0;
		for(int i=0;i<card.length;i++){
			Card c = card[i];
			String numbers = c.getCardNum();
			if(numbers.endsWith(luckyNum)){
				count++;
			}
		}
		Card[] cards = new Card[count];
		int a = 0;
		for(int i=0;i<card.length;i++){
			Card c = card[i];
			String numbers = c.getCardNum();
			if(numbers.endsWith(luckyNum)){
				c.setCredit(c.getCredit()+2000);
				cards[a] = c;
				a++;
			}
			
		}
		
		return cards;
	}
	
	public void listAllofCards(Card[] cards){
		for(Card c:cards){
//			System.out.println(c.getCardNum()+"  "+c.getCardUserName()+"   "+c.getCredit());
			System.out.println("let's look:"+c.toString());
		}
	}
}
