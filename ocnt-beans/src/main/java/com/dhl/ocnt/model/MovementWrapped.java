package com.dhl.ocnt.model;

import java.util.List;

public class MovementWrapped {
	
	private List<Movement> list_mv_data;
	private int totalNoOfRec;
	private int totalNoOfPage;
	private List<String> dest_filter_dropdown;
	private String plus_date;
	private String minus_date;
	private List<String> opt_filter_dropdown;
	
	public List<Movement> getList_mv_data() {
		return list_mv_data;
	}

	public void setList_mv_data(List<Movement> list_mv_data) {
		this.list_mv_data = list_mv_data;
	}

	public List<String> getOpt_filter_dropdown() {
		return opt_filter_dropdown;
	}

	public void setOpt_filter_dropdown(List<String> opt_filter_dropdown) {
		this.opt_filter_dropdown = opt_filter_dropdown;
	}
	
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
