package com.tentac.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StanderdInput {

	public static void main(String[] args) {
		
		String s;
		InputStream inSys = System.in;

		Reader r = new InputStreamReader(inSys);
		BufferedReader bufferIn = new BufferedReader(r);
		System.out.println("键盘输入的是......");
		try {
			while((s = bufferIn.readLine())!= null){
				System.out.println("输入的是:   "+s);
				if(s.equalsIgnoreCase("exit")){
					break;
				}
			}
			bufferIn.close();
			System.out.println("程序正常关闭！");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
