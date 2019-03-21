package com.tentac.lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWork {

	public static void main(String[] args) {

		try {
			InetAddress ia = InetAddress.getByName("192.168.2.1");
			
			
		}
		catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
