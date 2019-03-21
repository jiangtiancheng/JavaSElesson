package com.tentac.lesson8;


import com.tentac.lesson7.shape.Circle;
import com.tentac.lesson7.shape.Rectangle;
import com.tentac.lesson7.shape.Shape;
import com.tentac.lesson7.shape.Triangle;

public class TestInstanceOf {

	public void addOne(Shape s){			//传参的过程即为向上转型的过程
		if(s instanceof Rectangle){
			Rectangle r = (Rectangle)s;		//打回原形，即向下转型；
			r.setHeight(r.getHeight()+5);
			r.setWeigth(r.getWeigth()+10);
			r.showAll();
		}else if(s instanceof Triangle){
			Triangle t = (Triangle)s;
			t.setA(t.getA()+3);
			t.setB(t.getB()+3);
			t.setC(t.getC()+3);
			t.showAll();
		}else if(s instanceof Circle){
			Circle c = (Circle)s;
			c.setR(c.getR()+10);
			c.showAll();
		}else{
			System.out.println("Error");
		}
	}
}
