package com.tentac.lesson19;

import java.io.BufferedReader;

import java.util.Vector;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args)throws IOException {
		//创建一个socket对象，并指定自己的地址和端口号！
		Socket s = new Socket("127.0.0.1",8888);
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
			while(true){
				//将标准输入设备（键盘）输入的字节流转换为字符流并包装为缓冲字符输入流
				BufferedReader keyBoard_in = new BufferedReader(new InputStreamReader(System.in));
				//接收键盘输入的内容，赋值给一个String
				String content = keyBoard_in.readLine();
				//运用客户端的输出流将客户端键盘输入的内容，输出给服务器端
				out.println(content);
				if(content.equalsIgnoreCase("exit")){
					break;
				}
				//接收服务器端发来的消息
				String msg_fromServer = in.readLine();
				System.out.println("从服务器端接收到的内容是："+msg_fromServer);
			}
			System.out.println("客户端关闭");
		}finally{
			s.close();
		}

	}

}
