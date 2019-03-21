package com.tentac.lesson18;

public class Test {

	public static void main(String[] args) {


//		ThreadDemo td1 = new ThreadDemo("我的第1个线程示例");
//		
//		td1.start();
//
//		ThreadDemo td2 = new ThreadDemo("我的第2个线程示例");
//		
//		td2.start();
//		
//		ThreadDemo td3 = new ThreadDemo("我的第3个线程示例");
//		
//		td3.start();		
		
		RunnableDemo rd = new RunnableDemo();
		
		Thread td4 = new Thread(rd,"我的第td4个线程示例");
		td4.start();
		Thread td5 = new Thread(rd,"我的第td5个线程示例");
		td5.start();
		Thread td6 = new Thread(rd,"我的第td6个线程示例");
		td6.start();
	}

}
