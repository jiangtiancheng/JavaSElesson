package com.tentac.GYM.test;

import java.text.DateFormat;
import java.util.HashMap;

import com.tentac.GYM.person.bean.Client;
import com.tentac.GYM.person.bean.Coach;
import com.tentac.GYM.person.bean.Person_base;
import com.tentac.GYM.person.operator.factory.ActionsFactory;
import com.tentac.GYM.person.operator.proxy.Proxy;

public class Test {

	public static void main(String[] args) {
		
		//构建若干个会员对象，并模拟数据库存储在一个数组里或是集合内,
		//Client 使用的构造方法为：public Client(Calendar in_time, double fees, Coach coach,String phone_num,String id, String name, String sex, int age) {
		//Coach 使用的构造方法为：public Coach(String coach_type, double price,String id, String name, String sex, int age)
		Coach coach1 = new Coach("瑜伽教练",300,"201712","乐迪","female",26);
		Coach coach2 = new Coach("形体教练",280,"201713","酷飞","male",28);
		Coach coach3 = new Coach("体能教练",260,"201714","小爱","female",27);
		Coach coach4 = new Coach("搏击教练",320,"201715","大鹏","male",30);
		
		
		Client c1 = new Client(DateFormat.getInstance().getCalendar(),3880,coach1,"13904113214","170101","熊大","male",18);
		Client c2 = new Client(DateFormat.getInstance().getCalendar(),3850,coach3,"13804114254","170102","熊二","male",16);
		Client c3 = new Client(DateFormat.getInstance().getCalendar(),3990,coach2,"13704115264","170103","毛毛","female",28);
		Client c4 = new Client(DateFormat.getInstance().getCalendar(),4800,coach4,"13604116274","170104","吉吉","male",20);
		Client c5 = new Client(DateFormat.getInstance().getCalendar(),5180,coach1,"13504117284","170105","光头强","male",28);
		
		//创建一个会员数组，模拟会员数据库
		Client[] clients = {c1,c2,c3,c4,c5};
		
		Proxy p = new Proxy();
		//业务一：增加会员
		Client c6 = new Client(DateFormat.getInstance().getCalendar(),3180,coach2,"13504118288","170106","李大头","male",26);
		HashMap<String,Person_base> h = p.doWhat("13504118288-170106", c6);
		String msg = p.handleCenter("/增加会员",h,clients);
		System.out.print(msg);
		
		//业务二：删除会员
		
		 
			 String s1 = new String("true"); 
			 Boolean b1 = new Boolean(true); 
			 if (s1.equals(b1)) { 
				 System.out.println("Equal"); 
			 } 
			 
			 ActionsFactory fac = ActionsFactory.getInstance();
			 
	}

}
