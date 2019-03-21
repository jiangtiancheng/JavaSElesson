package com.tentac.lesson13;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		TestException te = new TestException();
		
		try {
			te.method_1();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(Exception e){
			
		}finally{
			
		}
		
		System.out.println("-----------main-----------");

	}

}
