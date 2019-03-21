package com.tentac.lesson15;

public class Computer {

	public static void main(String[] args) {
		
		DmengVideoCard dvc = new DmengVideoCard();//创建一个显卡对象/实例；
		
		GForce550 gf550 = new GForce550();  //创建另一个显卡对象/实例；
		
		MainBoard mb = new MainBoard();
		
		mb.setCpu("I am Intel 's CPU ");
		mb.setVideoCard(gf550);
		
		mb.run();

	}

}
