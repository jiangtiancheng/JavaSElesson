package com.tentac.lesson13;

public class CardHandler {

	public String[] getRandomLast4Nums(int count)throws CardException{
		
		String[] last4Nums = new String[count];
		
		for(int i=0;i<count;i++){
			int temp = (int)(Math.random()*10000);
			String lastNum = Integer.toString(temp);
			if(lastNum.length() !=3){
				throw new CardException("末四位卡号长度不够四位，请核查");
			}
			last4Nums[i] = lastNum;
		
		}
		return last4Nums;
	}
	
	public static void main(String[] args){
		CardHandler ch = new CardHandler();
		try {
			ch.getRandomLast4Nums(20);
		}
		catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}
}
