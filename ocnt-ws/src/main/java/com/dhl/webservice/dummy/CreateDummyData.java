package com.dhl.webservice.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dhl.ocnt.model.AssignMovement;
import com.dhl.ocnt.model.AssignMovementWrapper;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.MovementWrapped;

public class CreateDummyData {
	

	
//	//create dummy data
//	public static MovementWrapped createDummyData(){
//		
//		MovementWrapped mv_wrapped = new MovementWrapped();
//		List<Movement> mvList = new ArrayList<Movement>();
//		
//		int no_records = randInt(100, 1000);
//		int no_pages = no_records/10;
//		
//		mv_wrapped.setTotalNoOfPage(no_pages);
//		mv_wrapped.setTotalNoOfRec(no_records);
//		mv_wrapped.setDest_filter_dropdown(getDestFilterList());
//		mv_wrapped.setOpt_filter_dropdown(getOptFilterList());
//		
//		//create ramdom data
//		for(int i = 0; i<no_records; i++){
//			
//			Movement mv = new Movement();
//			
//			if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN004/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("C");
//				mv.setSTD("23:00");
//				mv.setDestination("SINHUB");
//				mv.setMawb("119-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OP");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN005/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("24:00");
//				mv.setDestination("MNLHUB");
//				mv.setMawb("118-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OX");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN006/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("22:00");
//				mv.setDestination("TPEHUB");
//				mv.setMawb("117-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OJ");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN007/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("21:00");
//				mv.setDestination("KLUHUB");
//				mv.setMawb("116-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OU");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN008/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("20:00");
//				mv.setDestination("CYBHUB");
//				mv.setMawb("115-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OY");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN009/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("19:00");
//				mv.setDestination("USAHUB");
//				mv.setMawb("114-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OT");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN010/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("18:00");
//				mv.setDestination("HUBHUB");
//				mv.setMawb("113-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OR");
//			}
//			else if((i%(randInt(1, 9))) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN011/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("17:00");
//				mv.setDestination("LETHUB");
//				mv.setMawb("112-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OD");
//			}
//			else{
//				mv.setOperation("");
//				mv.setMovementNo("SN012/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("X");
//				mv.setSTD("16:00");
//				mv.setDestination("HKGHUB");
//				mv.setMawb("111-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OV");
//			}
//			
//			mvList.add(mv);
//		}
//		
//		mv_wrapped.setList_mv_data(mvList);
//		
//		return mv_wrapped;
//	}
//	
//	//create dummy data with parameters
//	public static MovementWrapped createDummyData(String plus_date, String minus_date){
//		
//		MovementWrapped mv_wrapped = new MovementWrapped();
//		List<Movement> mvList = new ArrayList<Movement>();
//		
//		int no_records = randInt(100, 1000);
//		int no_pages = no_records/10;
//		
//		mv_wrapped.setTotalNoOfPage(no_pages);
//		mv_wrapped.setTotalNoOfRec(no_records);
//		mv_wrapped.setDest_filter_dropdown(getDestFilterList());
//		mv_wrapped.setOpt_filter_dropdown(getOptFilterList());
//		mv_wrapped.setMinus_date(minus_date);
//		mv_wrapped.setPlus_date(plus_date);
//		
//		//create ramdom data
//		for(int i = 0; i<no_records; i++){
//			
//			Movement mv = new Movement();
//			
//			if((i%9) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN004/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("C");
//				mv.setSTD("23:00");
//				mv.setDestination("SINHUB");
//				mv.setMawb("119-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OP");
//			}
//			else if((i%8) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN005/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("24:00");
//				mv.setDestination("MNLHUB");
//				mv.setMawb("118-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OX");
//			}
//			else if((i%7) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN006/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("22:00");
//				mv.setDestination("TPEHUB");
//				mv.setMawb("117-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OJ");
//			}
//			else if((i%6) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN007/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("21:00");
//				mv.setDestination("KLUHUB");
//				mv.setMawb("116-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OU");
//			}
//			else if((i%5) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN008/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("20:00");
//				mv.setDestination("CYBHUB");
//				mv.setMawb("115-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OY");
//			}
//			else if((i%4) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN009/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("19:00");
//				mv.setDestination("USAHUB");
//				mv.setMawb("114-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OT");
//			}
//			else if((i%3) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN010/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("18:00");
//				mv.setDestination("HUBHUB");
//				mv.setMawb("113-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OR");
//			}
//			else if((i%2) == 0){
//				mv.setOperation("");
//				mv.setMovementNo("SN011/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("A");
//				mv.setSTD("17:00");
//				mv.setDestination("LETHUB");
//				mv.setMawb("112-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OD");
//			}
//			else{
//				mv.setOperation("");
//				mv.setMovementNo("SN012/"+(randInt(5,70)+i));
//				mv.setTransptReg("");
//				mv.setTransptType("X");
//				mv.setSTD("16:00");
//				mv.setDestination("HKGHUB");
//				mv.setMawb("111-"+(987658321+randInt(1,10)+i)+"");
//				mv.setMfst("");
//				mv.setCutOffTime("22:50/13");
//				mv.setStatus("OV");
//			}
//			
//			mvList.add(mv);
//		}
//		
//		mv_wrapped.setList_mv_data(mvList);
//		
//		return mv_wrapped;
//	}
//	
//	public static List<String> getDestFilterList(){
//		
//		List<String> dest_fil = new ArrayList<String>();
//		
//		dest_fil.add("SINHUB");
//		dest_fil.add("KULGTW");
//		dest_fil.add("ICNGTW");
//		
//		return dest_fil;
//		
//	}
//	
//	public static List<String> getOptFilterList(){
//		
//		List<String> opt_fil = new ArrayList<String>();
//		
//		opt_fil.add("4");
//		opt_fil.add("5");
//		opt_fil.add("7");
//		opt_fil.add("10");
//		opt_fil.add("12");
//		opt_fil.add("T");
//		
//		return opt_fil;
//		
//	}
//	
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static AssignMovementWrapper createAmcDummyData(){
		
		AssignMovementWrapper amv_wrapped = new AssignMovementWrapper();
		AssignMovement amv = new AssignMovement();
		List<AssignMovement> amvList = new ArrayList<AssignMovement>();
		List<HandlingUnit> hu_allocParent_List = new ArrayList<HandlingUnit>();
		List<HandlingUnit> hu_notAssignedParent_List = new ArrayList<HandlingUnit>();
		
		int no_records_allocatedParent = randInt(11, 22);
		int no_pages_allocatedParent = no_records_allocatedParent/5;
		
		amv_wrapped.setAllocatedParent_noOfRec(no_records_allocatedParent);
		amv_wrapped.setAllocatedParent_noOfPage(no_pages_allocatedParent);
		
		int no_records_notAssignedParent = randInt(11, 22);
		int no_pages_notAssignedParent = no_records_notAssignedParent/5;
		
		amv_wrapped.setNotAssignedParent_noOfPage(no_pages_notAssignedParent);
		amv_wrapped.setNotAssignedParent_noOfRec(no_records_notAssignedParent);
		
		amv.setOperation("");
		amv.setMovementNo("SN004/"+(randInt(5,70)));
		amv.setTransptReg("");
		amv.setTransptType("C");
		amv.setSTD("23:00");
		amv.setDestination("SINHUB");
		amv.setMawb("119-"+(987658321+randInt(1,10))+"");
		amv.setMfst("");
		amv.setCutOffTime("22:50/13");
		amv.setStatus("OP");
		amvList.add(amv);
		amv_wrapped.setAmc_data(amvList);
		
		//create ramdom data allocated Parent
		for(int i = 0; i<no_records_allocatedParent; i++){
			
			HandlingUnit hu = new HandlingUnit();
			
			if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(100,200));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL ULD");
				hu.setStatus("OPEN");

			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(201,300));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(201,300));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL");
				hu.setStatus("OPEN");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(301,400));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(401,500));
				hu.setHandlingUnitType("L");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("OPEN");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(501,600));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(601,700));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("OPEN");
			
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(701,800));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG BAG");
				hu.setStatus("CLOSED");
			
			}
			else{
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(801,900));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG BAG");
				hu.setStatus("OPEN");
			
			}
			
			hu_allocParent_List.add(hu);
		}
		
		amv_wrapped.setHu_data_allocated(hu_allocParent_List);
		
		//create ramdom data not assigned Parent
		//more than the allocated
		for(int i = 0; i<no_records_notAssignedParent; i++){
			
			HandlingUnit hu = new HandlingUnit();
			
			if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(100,200));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL ULD");
				hu.setStatus("OPEN");

			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(201,300));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(201,300));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("TEST VRN ALL");
				hu.setStatus("OPEN");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(301,400));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(401,500));
				hu.setHandlingUnitType("L");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("OPEN");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(501,600));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("CLOSED");
				
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(601,700));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG ULD");
				hu.setStatus("OPEN");
			
			}
			else if((i%(randInt(1, 9))) == 0){
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(701,800));
				hu.setHandlingUnitType("B");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG BAG");
				hu.setStatus("CLOSED");
			
			}
			else{
				
				hu.setOperation("");
				hu.setHandlingUnit("H450566"+randInt(801,900));
				hu.setHandlingUnitType("U");
				hu.setRegNo("");
				hu.setEPO("HKGHUB");
				hu.setFlagging("HKG BAG");
				hu.setStatus("OPEN");
			
			}
			
			hu_notAssignedParent_List.add(hu);
		}
		
		amv_wrapped.setHu_data_notAssigned(hu_notAssignedParent_List);
		
		return amv_wrapped;
	}

}
