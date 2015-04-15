package com.dhl.webservice.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dhl.ocnt.model.Filter;
import com.dhl.ocnt.model.Movement;

public class CreateDummyData {
	

	
	//create dummy data
	public static List<Movement> createDummyData(){
		List<Movement> mvList = new ArrayList<Movement>();
		
		int no_records = randInt(100, 1000);
		int no_pages = no_records/10;
		
		//create ramdom data
		for(int i = 0; i<no_records; i++){
			
			Movement mv = new Movement();
			
			if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN004/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("C");
				mv.setSTD("23:00");
				mv.setDestination("SINHUB");
				mv.setMawb("119-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OP");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN005/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("24:00");
				mv.setDestination("MNLHUB");
				mv.setMawb("118-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OX");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN006/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("22:00");
				mv.setDestination("TPEHUB");
				mv.setMawb("117-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OJ");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN007/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("21:00");
				mv.setDestination("KLUHUB");
				mv.setMawb("116-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OU");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN008/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("20:00");
				mv.setDestination("CYBHUB");
				mv.setMawb("115-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OY");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN009/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("19:00");
				mv.setDestination("USAHUB");
				mv.setMawb("114-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OT");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN010/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("18:00");
				mv.setDestination("HUBHUB");
				mv.setMawb("113-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OR");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%(randInt(1, 9))) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN011/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("17:00");
				mv.setDestination("LETHUB");
				mv.setMawb("112-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OD");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else{
				mv.setOperation("");
				mv.setMovementNo("SN012/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("X");
				mv.setSTD("16:00");
				mv.setDestination("HKGHUB");
				mv.setMawb("111-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OV");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			
			mvList.add(mv);
		}
		
		return mvList;
	}
	
	//create dummy data with parameters
	public static List<Movement> createDummyData(String plus_date, String minus_date){
		
		List<Movement> mvList = new ArrayList<Movement>();
		
		int no_records = randInt(100, 1000);
		int no_pages = no_records/10;
		
		//create ramdom data
		for(int i = 0; i<no_records; i++){
			
			Movement mv = new Movement();
			
			if((i%9) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN004/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("C");
				mv.setSTD("23:00");
				mv.setDestination("SINHUB");
				mv.setMawb("119-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OP");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%8) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN005/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("24:00");
				mv.setDestination("MNLHUB");
				mv.setMawb("118-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OX");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%7) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN006/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("22:00");
				mv.setDestination("TPEHUB");
				mv.setMawb("117-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OJ");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%6) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN007/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("21:00");
				mv.setDestination("KLUHUB");
				mv.setMawb("116-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OU");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%5) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN008/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("20:00");
				mv.setDestination("CYBHUB");
				mv.setMawb("115-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OY");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%4) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN009/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("19:00");
				mv.setDestination("USAHUB");
				mv.setMawb("114-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OT");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%3) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN010/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("18:00");
				mv.setDestination("HUBHUB");
				mv.setMawb("113-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OR");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else if((i%2) == 0){
				mv.setOperation("");
				mv.setMovementNo("SN011/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("A");
				mv.setSTD("17:00");
				mv.setDestination("LETHUB");
				mv.setMawb("112-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OD");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
			}
			else{
				mv.setOperation("");
				mv.setMovementNo("SN012/"+(randInt(5,70)+i));
				mv.setTransptReg("");
				mv.setTransptType("X");
				mv.setSTD("16:00");
				mv.setDestination("HKGHUB");
				mv.setMawb("111-"+(987658321+randInt(1,10)+i)+"");
				mv.setMfst("");
				mv.setCutOffTime("22:50/13");
				mv.setStatus("OV");
				mv.setTotalNoOfPage(no_pages);
				mv.setTotalNoOfRec(no_records);
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
	
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
