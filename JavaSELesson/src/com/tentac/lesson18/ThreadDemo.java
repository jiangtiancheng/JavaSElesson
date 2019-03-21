package com.tentac.lesson18;

public class ThreadDemo extends Thread{

	//构造方法，同时为该线程传入一个名称msg
	public ThreadDemo(String msg){
		super(msg);
	}
	//需要以多线程运行的逻辑代码示例
	private void count(){
		for(int i=0;i<100;i++){
			if(i%10 ==0){
				System.out.println(this.getName()+"  "+i);
			}
		}
	}
	//将需要以多线程方式运行的代码，写入/被run方法调用即可
	public void run(){
		this.count();
	}

}
