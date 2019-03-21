package com.tentac.lesson10.imp;

import com.tentac.lesson10.interf.CardFactoryInf;
import com.tentac.lesson5.Card;

public class Test {

	public static void main(String[] args) {


//		CardFactoryFinal cff = new CardFactoryFinal();
//		
//		System.out.println(cff.toString());
//		
//		Card c = new Card();
//		System.out.println(c.toString());
		
		CardFactoryInf cfi = new CardFactoryImp();
		String[] last4Nums = cfi.getRandomLast4Nums(30);
		for(String s:last4Nums){
			System.out.println(s);
		}
		
		Card[] cards = cfi.buildCardObjects(30, "1234-5678-9012-", last4Nums, 20000);
		cfi.listAllofCards(cards);
		
		Card[] luckyCards = cfi.buildLuckyCardObjects(cards, "4");
		cfi.listAllofCards(luckyCards);
	}

}
