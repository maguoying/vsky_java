package com.magy.java.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtil {
	public static Date getDate() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		return date;
	}
	
	@Test
	public void test(){
		System.out.println(getDate());
	}
	
	public static String getFormatDate(String formatString) {
		SimpleDateFormat format = new SimpleDateFormat(formatString);
		return format.format(getDate());
	}
	
	public static String DATEFORMAT1 = "yyyy-MM-dd";
	public static String DATEFORMAT2 = "yyyyMMdd";
	public static String DATETIMEFORMAT1 = "yyyy-MM-dd HH:mm:ss";
	public static String DATETIMEFORMAT2 = "yyyyMMdd HHmmss";
}
