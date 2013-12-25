package com.educationproject.web.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.educationproject.web.common.Constants;

public class WebUtil {
	public static String getFormattedDate(java.util.Date date){
		DateFormat df=new SimpleDateFormat(Constants.DATE_FORMAT);
		return df.format(date);
	}
	
	public static String getFormattedDate(Date date,String format){
		DateFormat df=new SimpleDateFormat(format);
		return df.format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(getFormattedDate(new Date()));
	}
	
}
