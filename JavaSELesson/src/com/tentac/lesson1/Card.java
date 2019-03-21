package com.tentac.lesson1;

public class Card {

	String cardNum;
	String userName;
	String bankName;
	String bankAddress;
	int balance;
	String createTime;
	public Card(String cardNum, String userName, String bankName, String bankAddress, int balance, String createTime) {
		super();
		this.cardNum = cardNum;
		this.userName = userName;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.balance = balance;
		this.createTime = createTime;
	}
	public Card() {
		super();
	}
	public Card(String cardNum, String userName) {
		super();
		this.cardNum = cardNum;
		this.userName = userName;
	}
	
	public String getCardNum(){
		return this.cardNum;
	}
	
	public String getUserName(){
		return this.userName;
	}
}
