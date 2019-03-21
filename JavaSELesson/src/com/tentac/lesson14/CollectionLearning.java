package com.tentac.lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.tentac.lesson5.Card;

public class CollectionLearning {

	public static void main(String[] args) {
		
		ArrayList<String> str_list = new ArrayList<String>();
//		Collection str_list = new LinkedList();
//		str_list  = new ArrayList();
		
		//存入数据元素的同时，即向上转型的过程，因为参数的类型是Object。
		str_list.add("guangtouqiang");
		str_list.add("xiongda");
		str_list.add("xionger");
		str_list.add("jimiKing");
		
		Card c1 = new Card();
		Integer int1 = new Integer(911);
//		str_list.add(c1);
//		str_list.add(int1);
		
		
		int length = str_list.size();
		System.out.println(length);
		
		//需要向下转型，因为存入元素的时候已经默认向上转型过了；
		String temp = (String)str_list.get(0);
		System.out.println(temp);
		
		//用for循环方式遍历list对象元素
		for(int i=0;i<length;i++){
			String p = (String)str_list.get(i);
			String p2 = str_list.get(i);
			System.out.println("----"+p2);
		}

		//使用集合框架的遍历器进行遍历
		Iterator<String> it = str_list.iterator();
		while(it.hasNext()){
//			String element1 = (String)it.next();
			String element2 = it.next();
			System.out.println("====="+element2);
		}
		
		
		//Set的实验
//		HashSet<String> hs1 = new HashSet<String>();
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("b");
		ts1.add("k");
		ts1.add("s");
		ts1.add("w");
		ts1.add("q");
		ts1.add("a");
		ts1.add("c");
		Iterator<String> iths = ts1.iterator();
		while(iths.hasNext()){
			String str = iths.next();
			System.out.println("看看这个容器里的元素输出的顺序："+str);
		}
		
		
		
	}

}
