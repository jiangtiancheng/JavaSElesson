package com.tentac.lesson5;

public class Card {

	private String cardNum;
	private String cardUserName;
	private int credit;
	
	public Card(){
		
	}
	
	public Card(String cardNum, String cardUserName, int credit) {
		super();
		this.cardNum = cardNum;
		this.cardUserName = cardUserName;
		this.credit = credit;
	}

	public Card(String cNum,String cUName){
		this.cardNum = cNum;
		this.cardUserName = cUName;
	}
	
	public String getCardNum(){
		return this.cardNum;
				
	}
	
	public String getCardUserName(){
		return this.cardUserName;
	}
	
	public void setCardNum(String cardNum){
		this.cardNum = cardNum;
	}
	
	public void setCardUserName(String cardUser){
		this.cardUserName = cardUser;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String toString(){
		String msg = this.cardNum+"-"+this.cardUserName+"-"+this.credit;
		return msg;
	}
}
