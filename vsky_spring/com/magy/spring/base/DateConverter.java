package com.magy.spring.base;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String date_str) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(date_str);
			this.setValue(date);
		} catch (Exception e) {
			System.out.println("格式化失败");
			e.printStackTrace();
			
		}
	}
}
