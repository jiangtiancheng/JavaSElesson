package com.tentac.lesson18;

public class RunnableDemo implements Runnable{

	private void count(){
		for(int i=0;i<100;i++){
			if(i%10 ==0){
				System.out.println(Thread.currentThread().getName()+"  --"+i);
			}
		}
	}
	//将需要以多线程方式运行的代码，写入/被run方法调用即可
	public void run(){
		this.count();
	}
	
}
