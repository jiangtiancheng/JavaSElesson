package com.tentac.lesson16;

import java.io.File;
import java.io.IOException;

public class FileLearning {

	public static void main(String[] args)throws IOException {


		File f = new File("d:\\myJava\\src");
		boolean b3 = f.mkdirs();
		System.out.println(b3);
		boolean b1 = f.isDirectory();
		boolean b2 = f.isFile();
		System.out.println(b1+"   "+b2);

		String name = f.getName();
		String parent = f.getParent();
		System.out.println(name+"   "+parent);
		
		File f4 = new File(f,"myText");
		f4.createNewFile();
		
		
		File f2 = new File("d:\\myJava\\src\\a.txt");
		boolean b4 = f2.isDirectory();
		boolean b5 = f2.isFile();
		System.out.println(b4+"   "+b5);
		
		boolean b6 = f2.canExecute();
		boolean b7 = f2.canRead();
		boolean b8 = f2.canWrite();
		boolean b9 = f2.isHidden();
		System.out.println(b6+"   "+b7+"   "+b8+"   "+b9);
		
		File f3 = new File("d:\\myJava\\src\\b.txt");
		boolean b10 = f3.exists();
		System.out.println(b10);
		
		try {
			boolean b11 = f3.createNewFile();
			System.out.println("文件创建成功"+b11);
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
