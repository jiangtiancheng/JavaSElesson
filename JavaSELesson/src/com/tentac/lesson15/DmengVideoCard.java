package com.tentac.lesson15;

public class DmengVideoCard implements VideoCard_Inf{

	String vcName;
	public DmengVideoCard(){
		this.vcName = "Dmeng is Video Card.";
	}
	//显示方法
	public void display(){
		vcName = "Dmeng is a video card.I am working...";
	}
		
	public String getName(){
		return vcName;
	}
	
	public void setVcName(String name){
		this.vcName = name;
	}
}
