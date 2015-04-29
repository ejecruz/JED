package com.dhl.ocnt.model;

public class MovementFilter {

	private int plusDate;
	private int minusDate;
	private String location;

	public int getPlusDate() {
		return plusDate;
	}

	public void setPlusDate(int plusDate) {
		this.plusDate = plusDate;
	}

	public int getMinusDate() {
		return minusDate;
	}

	public void setMinusDate(int minusDate) {
		this.minusDate = minusDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
