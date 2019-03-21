package com.tentac.lesson9;

public class ChinaBankCard extends Card{
	
	public ChinaBankCard(){
		super();
	}
	
	public ChinaBankCard(int myCount,String cardNo){
		super(myCount,cardNo);
	}

	public int getUserCount(String cardNum){
		
		return 0;
	}
	
	public String findOwnerNameByCardNum(String cardNum){
		return "";
	}
}
