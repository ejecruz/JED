package com.dhl.webservice.dummy;

import java.util.ArrayList;
import java.util.List;

import com.dhl.ocnt.model.Filter;
import com.dhl.ocnt.model.Movement;

public class CreateDummyData {
	
	//create dummy data
	public static List<Movement> createDummyData(){
		List<Movement> mvList = new ArrayList<Movement>();
		
		//create ramdom data
		for(int i = 0; i<100; i++){
			
			Movement mv = new Movement();
			
			if((i%9) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("C");
				mv.setSTD("23:00");
				mv.setDestination("SINHUB");
				mv.setMawb("111-"+(987658321+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OP");
			}
			else if((i%8) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("24:00");
				mv.setDestination("MNLHUB");
				mv.setMawb("112-"+(987654371+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OX");
			}
			else if((i%7) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("22:00");
				mv.setDestination("TPEHUB");
				mv.setMawb("113-"+(987654328+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OJ");
			}
			else if((i%6) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("21:00");
				mv.setDestination("KLUHUB");
				mv.setMawb("114-"+(987654327+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OU");
			}
			else if((i%5) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("20:00");
				mv.setDestination("CYBHUB");
				mv.setMawb("115-"+(987654327+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OY");
			}
			else if((i%4) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("19:00");
				mv.setDestination("USAHUB");
				mv.setMawb("116-"+(987654326+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OT");
			}
			else if((i%3) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("18:00");
				mv.setDestination("HUBHUB");
				mv.setMawb("117-"+(987654325+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OR");
			}
			else if((i%2) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("17:00");
				mv.setDestination("LETHUB");
				mv.setMawb("118-"+(987654324+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OD");
			}
			else{
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("X");
				mv.setSTD("16:00");
				mv.setDestination("HKGHUB");
				mv.setMawb("119-"+(987654323+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OV");
			}
			
			mvList.add(mv);
		}
		
		return mvList;
	}
	
	//create dummy data with parameters
	public static List<Movement> createDummyData(String plus_date, String minus_date){
		List<Movement> mvList = new ArrayList<Movement>();
		
		//create ramdom data
		for(int i = 0; i<100; i++){
			
			Movement mv = new Movement();
			
			if((i%9) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("C");
				mv.setSTD("23:00");
				mv.setDestination("SINHUB");
				mv.setMawb("111-"+(987658321+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OP");
			}
			else if((i%8) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("24:00");
				mv.setDestination("MNLHUB");
				mv.setMawb("112-"+(987654371+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OX");
			}
			else if((i%7) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("22:00");
				mv.setDestination("TPEHUB");
				mv.setMawb("113-"+(987654328+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OJ");
			}
			else if((i%6) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("21:00");
				mv.setDestination("KLUHUB");
				mv.setMawb("114-"+(987654327+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OU");
			}
			else if((i%5) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("20:00");
				mv.setDestination("CYBHUB");
				mv.setMawb("115-"+(987654327+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OY");
			}
			else if((i%4) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("19:00");
				mv.setDestination("USAHUB");
				mv.setMawb("116-"+(987654326+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OT");
			}
			else if((i%3) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("18:00");
				mv.setDestination("HUBHUB");
				mv.setMawb("117-"+(987654325+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OR");
			}
			else if((i%2) == 0){
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("17:00");
				mv.setDestination("LETHUB");
				mv.setMawb("118-"+(987654324+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OD");
			}
			else{
				mv.setOperation("");
				mv.setMovementNo(""+i);
				mv.setTransptReg("");
				mv.setTransptType("X");
				mv.setSTD("16:00");
				mv.setDestination("HKGHUB");
				mv.setMawb("119-"+(987654323+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OV");
			}
			
			mv.setPlus_date(plus_date);
			mv.setMinus_date(minus_date);
			
			mvList.add(mv);
		}
		
		return mvList;
	}
	
	public static Filter getDestFilterList(){
		
		List<String> dest_fil = new ArrayList<String>();
		Filter fil = new Filter();
		
		dest_fil.add("<ALL>");
		dest_fil.add("SINHUB");
		dest_fil.add("KULGTW");
		dest_fil.add("ICNGTW");
		
		fil.setDest_filter_dropdown(dest_fil);
		
		return fil;
		
	}

}
