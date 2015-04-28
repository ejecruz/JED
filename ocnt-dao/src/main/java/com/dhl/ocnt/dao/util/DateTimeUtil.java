package com.dhl.ocnt.dao.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeUtil {

	
	private static final String SLASH = "/";
	private static final String COLON = ":";
	public static String getDateSchedule(Date date, String offset)
	{
		return formatDateToDdMMMyy(changeGMTtoUserTime(date, offset));
	}
	
	public static String getCloseAndDepartDateTime(Date date, String offset)
	{
		return formatDateToCloseAndDepartFormat(changeGMTtoUserTime(date, offset));
	}
	
	public static String formatDateToDdMMMyy(Date date)
	{
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		return df.format(date);
	}
	
	public static String formatDateToDdMMyy(Date date)
	{
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		return df.format(date);
	}
	
	public static String formatDateToHhMm(Date date)
	{
		DateFormat df = new SimpleDateFormat("HHmm");
		return df.format(date);
	}
	
	public static String formatDateToHhColonMm(Date date)
	{
		DateFormat df = new SimpleDateFormat("HH:mm");
		return df.format(date);
	}
	
	public static String formatDateToCloseAndDepartFormat(Date date)
	{
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy hh:mmaa");
		return df.format(date);
	}
	
	public static Date changeGMTtoUserTime(Date date, String offset)
	{
		final String METHOD_NAME = "getUserDateTimeNow";
//		log.debug(LogMessageConstant.METHOD_ENTRY + METHOD_NAME);
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		calendar = changeOffsetToCalendar(calendar, offset);
	      
//	    log.debug(LogMessageConstant.METHOD_EXIT + METHOD_NAME);
		return calendar.getTime();
	}
	
	public static Calendar changeOffsetToCalendar(Calendar calendar, String offset)
	{
		  int offsetHour = 0;
	      int offsetMinute = 0;
	      int charLocation = offset.indexOf(COLON);

	      if (offset.substring(0,1).equals("-")){     
	    	  offsetHour = Integer.valueOf(offset.substring(0,1) + offset.substring(1,charLocation));
	          offsetMinute = Integer.valueOf(offset.substring(0,1) + offset.substring(charLocation+1,charLocation+2));
	      }
	      else {
	            offsetHour = Integer.valueOf(offset.substring(1,charLocation));
	            offsetMinute = Integer.valueOf(offset.substring(charLocation+1,charLocation+2));
	      }

	      calendar.add(Calendar.HOUR_OF_DAY, Integer.valueOf(offsetHour));
	      calendar.add(Calendar.MINUTE,Integer.valueOf(offsetMinute));
	      return calendar;
	}
	
	public static Date getUserDateTimeNow(Date date, String offset)
	{
		final String METHOD_NAME = "getUserDateTimeNow";
		
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		calendar = changeOffsetToCalendar(calendar, offset);
	      
	    
		return calendar.getTime();
	}
	
	public static String getSlashDayFromDate(Date date)
	{
		final String METHOD_NAME = "getSlashDayFromDate";
		
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		return SLASH + appendZero(calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	public static String getHhMmSlashDayFromDate(Date date)
	{
		final String METHOD_NAME = "getSlashDayFromDate";
		
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		StringBuilder sb = new StringBuilder();
		sb.append(appendZero(calendar.get(Calendar.HOUR_OF_DAY)));
		sb.append(COLON);
		sb.append(appendZero(calendar.get(Calendar.MINUTE)));
		sb.append(SLASH);
		sb.append(appendZero(calendar.get(Calendar.DAY_OF_MONTH)));
		return sb.toString();
	}
	
	public static String appendZero(int i)
	{
		if (i < 10)
		{
			return "0" + i;
		}
		return Integer.toString(i);
	}
	
	public static void main(String args[])
	{
		System.out.println(formatDateToCloseAndDepartFormat(changeGMTtoUserTime(new Date(), "+08:00")));
	}
}
