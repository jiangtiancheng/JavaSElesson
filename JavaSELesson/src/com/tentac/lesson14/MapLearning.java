package com.tentac.lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.tentac.lesson6.Book;
import com.tentac.lesson6.BookType;

public class MapLearning {

	public static void main(String[] args) {
		
		HashMap<String,Book> hm_1 = new HashMap<String,Book>();

		BookType[] bts = new BookType[3];
		BookType bt1 = new BookType("34-0901","计算机科学与技术","少壮不努力老大写java");
		BookType bt2 = new BookType("34-0902","美食与养颜","不如撸串");
		BookType bt3 = new BookType("34-0903","运动与养生","不如玩游戏");
		bts[0] = bt1;
		bts[1] = bt2;
		bts[2] = bt3;
		Book b1 = new Book("isn-7654","《java编程思想》",99.90,bt1);
		Book b2 = new Book("isn-7655","《论工程师的持久战》",88.33,bt1);
		Book b3 = new Book("isn-7656","《逃课与恋爱》",22.34,bt3);
		Book b4 = new Book("isn-7657","《逃课与学习》",56.09,bt2);
		Book b5 = new Book("isn-7658","《逃课与撸串》",66.8,bt2);
		Book b6 = new Book("isn-7659","《逃课与养颜》",12.8,bt2);
		Book b7 = new Book("isn-7650","《逃课与运动》",3.78,bt3);
		Book b8 = new Book("isn-7651","《逃课与美食》",70,bt2);
		Book b9 = new Book("isn-7652","《逃课与游戏人生》",66,bt3);
		
		//学习TreeMap
		TreeMap<String,Book> tm = new TreeMap<String,Book>();
		tm.put("book_106", b1);
		tm.put("book_102", b2);
		tm.put("book_104", b3);
		tm.put("book_103", b4);
		tm.put("book_105", b5);
		tm.put("book_101", b6);
		
		Set<String> tm_key = tm.keySet();
		for(String key:tm_key){
			Book book = tm.get(key);
			System.out.println("************key is :"+key+"    value's name:"+book.getB_name()+"*********");
		}
		
		
		hm_1.put("book_101", b1);
		hm_1.put("book_102", b2);
		hm_1.put("book_103", b3);
		hm_1.put("book_104", b4);
		hm_1.put("book_105", b5);
		hm_1.put("book_106", b6);
		
		Book book = (Book)hm_1.get("book_104");
		String id = book.getB_id();
		String bookename = book.getB_name();
		double price = book.getB_price();
		BookType bt = book.getBt();
		String bt_name = bt.getType_name();
		String bt_desc = bt.getType_des();
		System.out.println(id+"  "+bookename+"   "+bt_name+"   "+bt_desc);
		System.out.println("----------------------------");
		
		Collection<Book> books_value = hm_1.values();   //该values()方法是将该map对象的value值统一的放在了collection对象中去。
														//可不可以使用List直接扣类型呢？
		Iterator it = books_value.iterator();
		while(it.hasNext()){
			Book b = (Book)it.next();
			String auth = b.getB_author();
			String name = b.getB_name();
			System.out.println("author is :"+auth+"    name is :"+name);
		}
		
		//for each写法一：
		for(Book at:books_value){
			Book b = at;
			System.out.println("--"+b.getB_name()+"--");
		}
		
		//for each写法二：
		for(Iterator<Book> at=books_value.iterator();at.hasNext();){
			Book bk = at.next();
			System.out.println("**"+bk.getB_name()+"**");
		}
		
		//如何快速的遍历map对象中的所有键值对?
		Set<String> myKeys = hm_1.keySet();
		for(String key:myKeys){
			String k = key;
			Book bb = hm_1.get(key);
			System.out.println("key is :"+k+" value's val:"+bb.getB_name()+"  "+bb.getB_price());
		}
	}

}
