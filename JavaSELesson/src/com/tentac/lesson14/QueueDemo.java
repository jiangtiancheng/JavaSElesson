package com.tentac.lesson14;

import java.util.LinkedList;

public class QueueDemo implements QeueuInf{

	private LinkedList<String> list = new LinkedList<String>();
	
	public void put(String s){
		list.addLast(s);
	}
	
	public String get(){
		return list.removeLast();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}

	public static void main(String[] args){
		QueueDemo qd = new QueueDemo();
		
		qd.put("abc");
		qd.put("opq");
		qd.put("wst");
		
		while(!qd.isEmpty()){
			System.out.println(qd.get());
		}
	}
}
