package com.tentac.lesson1;

public class Test {

	public static void main(String[] args) {
		
		 Byte bWrapped = new Byte("3"); 
		 double d = bWrapped.floatValue(); 
		 Double dWrapped = new Double(d); 
		 byte b = dWrapped.byteValue(); 
		 System.out.println("b = " + b); 
		 
		 String str = "3.14159";
//		 float value = Float.floatValue(str);
//		 float value = (new Float()).parseFloat(str);
		 float value = Float.valueOf(str).floatValue();
		 
		 Integer c = new Integer(10);
		 Float f = new Float(10);
		 boolean blean = c.equals(f);
		 System.out.println(blean);
	}

}
