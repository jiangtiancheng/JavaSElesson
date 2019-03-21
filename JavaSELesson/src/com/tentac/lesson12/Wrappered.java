package com.tentac.lesson12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Wrappered {

	public static void main(String[] args) {
		
		String s = "1234.509";
		
		double ds = Double.parseDouble(s);
		
		Double dsd = new Double(s);
		double dssd = dsd.doubleValue();
		
		double p = 9090.999;
		String sp = new Double(p).toString();
		
		StringBuffer sb = new StringBuffer("error");
		System.out.println(sb.length()+"    "+sb.capacity());
		
		StringBuffer sb2 = new StringBuffer(12);
		System.out.println(sb2.length()+"    "+sb2.capacity());
		
		sb.setCharAt(2, 'O');
		System.out.println(sb);
		
		Math.abs(12);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"   "+c.get(Calendar.MONTH)+"   "+c.get(Calendar.DATE)+"   "+c.get(Calendar.DAY_OF_WEEK));
		
		DateFormat df = DateFormat.getDateInstance();
		TimeZone tz = df.getTimeZone();
		String stz = tz.getDisplayName();
		System.out.println(stz);
		
		Calendar df_cal = df.getCalendar();
		
		System.out.println(df_cal.get(Calendar.DATE));
		
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String str_sdf = sdf.format(new Date());
		System.out.println(str_sdf);
		
		
	}

}
