package com.tentac.lesson19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args)throws IOException {
		ServerSocket server = new ServerSocket(8888);
		try {
			//ServerSocket负责监听客户端的通信请求，若有请求发来，即接收并为该请求创建一个Socket对象。以后的往来通信都将由该Socket完成。
			Socket s = server.accept();
			System.out.println("  客户端请求链接，客户端的ip地址是："+s.getInetAddress().getHostAddress()+
								",远程端口是："+s.getPort()+
								",本地端口是："+s.getLocalPort());
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
			while(true){
				//运用服务器端的输入流接收客户端发来的内容，赋值给String。
				String msg = in.readLine();
				if(msg.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println("接收到的客户端信息内容是：   "+msg);
				//将收到的数据，运用服务器端的输出流进行定向输出给客户端。
				out.println("服务器端的响应内容是："+msg+"默认收到爱谁谁");
			}
			System.out.println("服务器关闭");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			server.close();
		}

	}

}
