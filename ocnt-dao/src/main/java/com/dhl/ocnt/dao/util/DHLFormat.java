package com.dhl.ocnt.dao.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class DHLFormat {
	
	
	public static final int HUID = 0;
	public static final int HWB  = 1;
	public static final int PID  = 2;
	public static final int INVALID = 9;
	public static final String DASH = "-";
	
	private DHLFormat() {
		
	}
	
	public static boolean isHUIDValid(String strHuId) {
		
		try {
			if (strHuId == null || strHuId.length() < 10 || !strHuId.startsWith("H") ) {
				return false;
			}

			//The numbers between the 'H' and the check digit;
			int intLastIndex    = strHuId.length() - 1;
			int intUniqueDigits = Integer.parseInt(strHuId.substring(1, intLastIndex));
			int intCheckDigit   = Integer.parseInt(strHuId.substring(intLastIndex));


			if ( intUniqueDigits % 7 != intCheckDigit ) {
				return false;
			}

			return true;
		} 
		catch (NumberFormatException e) {
	
			return false;
		}
	}
	

	
	
	
	
	
	private static DecimalFormat df = new DecimalFormat("00000000");
	private static String formatHUID(int baseNo) {
		return "H" + df.format(baseNo) + String.valueOf(baseNo % 7);
	}
	
//	public static void main(String[] args) {
//		String strHuId = "H12345";
//		 System.out.println(strHuId.substring(strHuId.length() - 1));
//	}
	
	public static boolean isContentEmpty(String content)
	{
		if (content == null)
		{
			return true;
		}
		else if (content.equals(""))
		{
			return true;
		}
		return false;
	}
	
	public static boolean contentNotEmpty(String cnt)
	{
		if (cnt == null)
		{
			return false;
		}
		else if (cnt.equals(""))
		{
			return false;
		}
		return true;
	}
	
	public static String setMawbFormat(String before)
	{
		if (before == null)
		{
			return before;
		}
		else if (before.length() <= 3)
		{
			return before;
		}
		else
		{
			StringBuilder sb = new StringBuilder();
			sb.append(before.substring(0, 3));
			sb.append(DASH);
			sb.append(before.substring(3));
			return sb.toString();
		}
	}
	
	public static boolean isInteger(String s) {
		for (int i = 0; i < s.length(); i++){
	        if (!Character.isDigit(s.charAt(i)))
	            return false;
	    }
	    return true;
	}
}
