package com.tentac.lesson6;

public class Library {

	public static void main(String[] args) {


		BookType[] bts = new BookType[3];
		BookType bt1 = new BookType("34-0901","计算机科学与技术","少壮不努力老大写java");
		BookType bt2 = new BookType("34-0902","美食与养颜","不如撸串");
		BookType bt3 = new BookType("34-0903","运动与养生","不如玩游戏");
		bts[0] = bt1;
		bts[1] = bt2;
		bts[2] = bt3;

		//Book(String b_id, String b_name, String b_price, BookType[] bt)
		Book b1 = new Book("isn-7654","《java编程思想》",99.90,bt1);
		Book b2 = new Book("isn-7655","《论工程师的持久战》",88.33,bt1);
		Book b3 = new Book("isn-7656","《逃课与恋爱》",22.34,bt3);
		Book b4 = new Book("isn-7657","《逃课与学习》",56.09,bt2);
		Book b5 = new Book("isn-7658","《逃课与撸串》",66.8,bt2);
		Book b6 = new Book("isn-7659","《逃课与养颜》",12.8,bt2);
		Book b7 = new Book("isn-7650","《逃课与运动》",3.78,bt3);
		Book b8 = new Book("isn-7651","《逃课与美食》",70,bt2);
		Book b9 = new Book("isn-7652","《逃课与游戏人生》",66,bt3);
		
		Book[] libs = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
		
		for(int i=0;i<libs.length;i++){
			Book book = libs[i];
			String id = book.getB_id();
			String name = book.getB_name();
			double price = book.getB_price();
			BookType bt = book.getBt();
			String type_id = bt.getType_id();
			String type_name = bt.getType_name();
			String type_des = bt.getType_des();
			
			System.out.println(id+"   "+name+"   "+price+"   "+type_id+"  "+type_name+"   "+type_des);
			
			
		}
		

	}

}
