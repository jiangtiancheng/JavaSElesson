package com.tentac.lesson15;

public class MainBoard {

	String cpu;
	
	VideoCard_Inf vCard;
	
	public void setCpu(String newCpu){
		this.cpu = newCpu;
	}
	
	public void setVideoCard(VideoCard_Inf vc){
		this.vCard = vc;
	}
	
	//主板运行方法
	public void run(){
		System.out.println(this.cpu);
		System.out.println(vCard.getName());
		vCard.display();
		System.out.println("MainBoard is running.....");
	}
}
