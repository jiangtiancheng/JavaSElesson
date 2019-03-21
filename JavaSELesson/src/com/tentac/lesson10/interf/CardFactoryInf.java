package com.tentac.lesson10.interf;

import com.tentac.lesson5.Card;

public interface CardFactoryInf{

	public static final String BANK_NAME = "ChinaBank";
	
	public String[] getRandomLast4Nums(int count);
	
	public Card[] buildCardObjects(int count,String begin_nums,String[] last4Nums,int account);
	
	public Card[] buildLuckyCardObjects(Card[] card,String luckyNum);
	
	public void listAllofCards(Card[] cards);
}
