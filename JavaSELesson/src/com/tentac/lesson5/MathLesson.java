package com.tentac.lesson5;

public class MathLesson {
	
	public int getAvgValue(int[] a){
		
		int avgVal = 0;
		int count = a.length; 	//计算出将要传进来数组的个数
		int totalValue = 0;
		for(int i=0;i < count;i++){
			
			totalValue += a[i];		// totalValue = totalValue + a[i];
		}
		avgVal = totalValue/count;
		return avgVal;
	}

	public int getMinValue(int[] a){
		
		int max_value = Integer.MIN_VALUE;
		
		for(int index=0;index<=a.length-1;index++){
			if(a[index] > max_value){
				max_value = a[index];
			}
		}
		return max_value;
	}
	public static void main(String[] args) {

		int[] testValue = { -10,2,3,246,-100,0,5};
		
		MathLesson mln = new MathLesson();
		
//		int max_value = mln.getMinValue(testValue);
//		
//		System.out.println(max_value);
		
		int avg = mln.getAvgValue(testValue);
		System.out.println(avg);
	}

}
