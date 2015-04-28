package com.dhl.ocnt.model;

import java.util.List;

public class Movement {

	private String movementId;
	private String operation;
	private String movementNo;
	private String transptReg;
	private String transptType;
	private String STD;
	private String destination;
	private String mawb;
	private String mfst;
	private String cutOffTime;
	private String status;


	
	public Movement(){
		
	}
	
	public String getMovementId() {
		return movementId;
	}

	public void setMovementId(String movementId) {
		this.movementId = movementId;
	}

	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getMovementNo() {
		return movementNo;
	}
	public void setMovementNo(String movementNo) {
		this.movementNo = movementNo;
	}
	public String getTransptReg() {
		return transptReg;
	}
	public void setTransptReg(String transptReg) {
		this.transptReg = transptReg;
	}
	public String getTransptType() {
		return transptType;
	}
	public void setTransptType(String transptType) {
		this.transptType = transptType;
	}
	public String getSTD() {
		return STD;
	}
	public void setSTD(String sTD) {
		STD = sTD;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getMawb() {
		return mawb;
	}
	public void setMawb(String mawb) {
		this.mawb = mawb;
	}
	public String getMfst() {
		return mfst;
	}
	public void setMfst(String mfst) {
		this.mfst = mfst;
	}
	public String getCutOffTime() {
		return cutOffTime;
	}
	public void setCutOffTime(String cutOffTime) {
		this.cutOffTime = cutOffTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString(){
		StringBuilder b = new StringBuilder();
		
		b.append("operation: ");
		b.append(operation);
		b.append("||");
		
		b.append("movementNo: ");
		b.append(movementNo);
		b.append("||");
		
		b.append("transptReg: ");
		b.append(transptReg);
		b.append("||");
		
		b.append("STD: ");
		b.append(STD);
		b.append("||");
		
		b.append("destination: ");
		b.append(destination);
		b.append("||");
		
		b.append("mawb: ");
		b.append(mawb);
		b.append("||");
		
		b.append("mfst: ");
		b.append(mfst);
		b.append("||");
		
		b.append("cutOffTime: ");
		b.append(cutOffTime);
		b.append("||");
		
		b.append("status: ");
		b.append(status);
		
		return b.toString();
	}


}
