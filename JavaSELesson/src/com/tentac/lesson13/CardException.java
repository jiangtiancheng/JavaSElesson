package com.tentac.lesson13;

public class CardException extends Throwable{

	public CardException(){
		
	}
	
	public CardException(String msg){
		super(msg);
	}
	
	public CardException(String msg,Throwable t){
		super(msg,t);
	}
	
	public CardException(Throwable t){
		super(t);
	}
}
