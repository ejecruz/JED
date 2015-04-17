package com.dhl.ocnt.model;

public class HandlingUnit {
	
	private String operation;
	private String handlingUnit;
	private String regNo;
	private String handlingUnitType;
	private String EPO;
	private String flagging;
	private String status;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getHandlingUnit() {
		return handlingUnit;
	}
	public void setHandlingUnit(String handlingUnit) {
		this.handlingUnit = handlingUnit;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getHandlingUnitType() {
		return handlingUnitType;
	}
	public void setHandlingUnitType(String handlingUnitType) {
		this.handlingUnitType = handlingUnitType;
	}
	public String getEPO() {
		return EPO;
	}
	public void setEPO(String ePO) {
		EPO = ePO;
	}
	public String getFlagging() {
		return flagging;
	}
	public void setFlagging(String flagging) {
		this.flagging = flagging;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
