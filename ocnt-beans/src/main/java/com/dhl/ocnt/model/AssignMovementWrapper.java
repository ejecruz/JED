package com.dhl.ocnt.model;

import java.util.List;

public class AssignMovementWrapper {
	

	private List<AssignMovement> amc_data;
	private List<HandlingUnit> hu_data_allocated;
	private List<HandlingUnit> hu_data_notAssigned;
	private List<String> opt_dropdown;
	private int allocatedParent_noOfRec;
	private int allocatedParent_noOfPage;
	private int notAssignedParent_noOfRec;
	private int notAssignedParent_noOfPage;
	
	
	public List<String> getOpt_dropdown() {
		return opt_dropdown;
	}
	public void setOpt_dropdown(List<String> opt_dropdown) {
		this.opt_dropdown = opt_dropdown;
	}
	
	public List<HandlingUnit> getHu_data_allocated() {
		return hu_data_allocated;
	}
	public void setHu_data_allocated(List<HandlingUnit> hu_data_allocated) {
		this.hu_data_allocated = hu_data_allocated;
	}
	public List<HandlingUnit> getHu_data_notAssigned() {
		return hu_data_notAssigned;
	}
	public void setHu_data_notAssigned(List<HandlingUnit> hu_data_notAssigned) {
		this.hu_data_notAssigned = hu_data_notAssigned;
	}

	public int getAllocatedParent_noOfRec() {
		return allocatedParent_noOfRec;
	}
	public void setAllocatedParent_noOfRec(int allocatedParent_noOfRec) {
		this.allocatedParent_noOfRec = allocatedParent_noOfRec;
	}
	public int getAllocatedParent_noOfPage() {
		return allocatedParent_noOfPage;
	}
	public void setAllocatedParent_noOfPage(int allocatedParent_noOfPage) {
		this.allocatedParent_noOfPage = allocatedParent_noOfPage;
	}
	public int getNotAssignedParent_noOfRec() {
		return notAssignedParent_noOfRec;
	}
	public void setNotAssignedParent_noOfRec(int notAssignedParent_noOfRec) {
		this.notAssignedParent_noOfRec = notAssignedParent_noOfRec;
	}
	public int getNotAssignedParent_noOfPage() {
		return notAssignedParent_noOfPage;
	}
	public void setNotAssignedParent_noOfPage(int notAssignedParent_noOfPage) {
		this.notAssignedParent_noOfPage = notAssignedParent_noOfPage;
	}
	public List<AssignMovement> getAmc_data() {
		return amc_data;
	}
	public void setAmc_data(List<AssignMovement> amc_data) {
		this.amc_data = amc_data;
	}


}
