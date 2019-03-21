package com.tentac.lesson5;

public class CardFactory {

	public String[] getLast4Numbers(int count){
		
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
	
	/**
	 * 该方法主要用于将给定的号码段与随机生成的四位末尾数字进行拼接，产生完整的、指定数量的卡号，
	 * @param partNum   for excample:"1234-5678-9012-"
	 * @param last4Nums 已经通过方法public String[] getLast4Numbers(int count)创造指定数量的随机4位数字；
	 * @return String[] fullCardNumbers
	 */
	public String[] produceFullCardNum(String partNum,String[] last4Nums){
		int size = last4Nums.length;
		String[] fullCardNumbers = new String[size];
		for(int i=0;i<size;i++){
			String temp = last4Nums[i];
			String fullNums = partNum.concat(temp);    //即 字符串拼接，等价“+”；
			fullCardNumbers[i] = fullNums;
		}
		return fullCardNumbers;
	}
	
	public Card[] produceCardObjects(String userName,String[] cardsNum){
		
		int size = cardsNum.length;   //根据传入的卡号的数量，来决定我们的循环次数、创建card数组的长度；
		Card[] cards = new Card[size];
		
		for(int i=0;i<size;i++){
			String cardNo = cardsNum[i];
			String user_name = i+userName;
			
			Card c = new Card(cardNo,user_name);   //通过特定构造方法，将属性传值；或者通过该对象的对应的set方法来为card对象属性赋值；
//			c.setCardNum(cardNo);
//			c.setCardUserName(user_name);
			cards[i] = c;
		}
		return cards;
	}
}
