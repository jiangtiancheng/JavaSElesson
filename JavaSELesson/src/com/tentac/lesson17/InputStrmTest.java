package com.tentac.lesson17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStrmTest {

	public static void main(String[] args) {
		
		try {
//			FileInputStream fis = new FileInputStream("D:\\myJava\\src\\b.txt");
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			DataInputStream dis = new DataInputStream(bis);
//			System.out.println(dis.readInt());
//			
//			int size = fis.available();
//			
//			System.out.println(size);
//			
//			byte[] buffer = new byte[size];
//			
//			int readSize = fis.read(buffer);
//			
//			System.out.print(readSize);
//			
//			String content = new String(buffer);
//			
////			String new_Content = new String(content.getBytes("utf-8"),"");
//			
//			System.out.print(content);
//			
//			fis.close();
			
			FileOutputStream fos = new FileOutputStream("D:\\myJava\\src\\word.doc");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			DataOutputStream dos = new DataOutputStream(bos);
//			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(fos));
//			dos.writeUTF("滕泰");
//			dos.writeInt(230);
			
			bos.write("滕泰科技".getBytes());
			double d = 3.1415927;
			String sth = new Double(d).toString();
			bos.write(sth.getBytes());
//			dos.writeChars("滕泰科技");
			
//			fos.write(buffer);
			
			bos.flush();
			
			bos.close();
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
