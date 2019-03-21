package com.tentac.lesson9;

public abstract class Card {

	private int count;
	private String cardNum;
	
	public Card(){
		
	}

	public Card(int count, String cardNum) {
		super();
		this.count = count;
		this.cardNum = cardNum;
	}

	public abstract String findOwnerNameByCardNum(String cardNum);
	
	public abstract int getUserCount(String cardNum);
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	
}
