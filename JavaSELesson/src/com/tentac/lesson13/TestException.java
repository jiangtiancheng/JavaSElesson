package com.tentac.lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestException {

	public void method_1()throws FileNotFoundException{
		
		File f = new File("d://ddd/ree.a.txt");
		boolean b = f.exists();

		FileOutputStream fos = new FileOutputStream(f);
		this.method_2();
		
		System.out.println("-----------method_1()-----------");
	}
	public void method_2(){
		try{
			this.method_3();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("-----------method_2()-----------");
	}
	public void method_3() throws ArrayIndexOutOfBoundsException{
		int[] a = new int[4];
		int p = 0;
		
		p = a[4];
		
		System.out.println("p is :"+p);
		System.out.println("-----------method_3()-----------");
	}
}
