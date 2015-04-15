package com.dhl.ocnt.model;

import java.util.List;

public class MovementWrapped {
	
	private List<Movement> list_mv_data;
	private int totalNoOfRec;
	private int totalNoOfPage;
	private List<String> dest_filter_dropdown;
	private String plus_date;
	private String minus_date;
	
	public String getPlus_date() {
		return plus_date;
	}

	public void setPlus_date(String plus_date) {
		this.plus_date = plus_date;
	}

	public String getMinus_date() {
		return minus_date;
	}

	public void setMinus_date(String minus_date) {
		this.minus_date = minus_date;
	}
	
	public List<String> getDest_filter_dropdown() {
		return dest_filter_dropdown;
	}

	public void setDest_filter_dropdown(List<String> dest_filter_dropdown) {
		this.dest_filter_dropdown = dest_filter_dropdown;
	}
	
	public List<Movement> getMv_data() {
		return list_mv_data;
	}
	public void setMv_data(List<Movement> mv_data) {
		this.list_mv_data = mv_data;
	}
	public int getTotalNoOfRec() {
		return totalNoOfRec;
	}
	public void setTotalNoOfRec(int totalNoOfRec) {
		this.totalNoOfRec = totalNoOfRec;
	}
	public int getTotalNoOfPage() {
		return totalNoOfPage;
	}
	public void setTotalNoOfPage(int totalNoOfPage) {
		this.totalNoOfPage = totalNoOfPage;
	}

	
}
