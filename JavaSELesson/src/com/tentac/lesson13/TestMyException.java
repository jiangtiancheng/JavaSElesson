package com.tentac.lesson13;

public class TestMyException {

	public void getSth()throws MyException{
		
		int result = 5/0;
		throw new MyException("不能这么干啊，傻啊？");
		
	}
	public static void main(String[] args)  {
		
		TestMyException tme = new TestMyException();
		
			try {
				tme.getSth();
			}
			catch (MyException e) {
				
				e.getMessage();
			}
			
		
		
		
	}

}
