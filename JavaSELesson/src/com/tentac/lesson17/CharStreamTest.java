package com.tentac.lesson17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTest {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D:\\myJava\\src\\myNoteBook.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("华为科技-\r东软集团-\r富达信息-\r埃森哲-\n滕泰科技-\n七彩光信息-\r爱立信");
			bw.close();
			
			FileReader fr = new FileReader("D:\\myJava\\src\\myNoteBook.txt");
			BufferedReader br = new BufferedReader(fr);
			String result = "";
			
			while((result = br.readLine()) != null){
				System.out.println(result);
			}
			br.close();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
