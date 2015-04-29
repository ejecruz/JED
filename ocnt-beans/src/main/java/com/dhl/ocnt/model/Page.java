package com.dhl.ocnt.model;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {

	private int pageNumber;
    private int pagesAvailable;
    private List<T> pageItems = new ArrayList<T>();

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    public void setPageItems(List<T> pageItems) {
        this.pageItems = pageItems;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }

    public List<T> getPageItems() {
        return pageItems;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("items:"+getPageItems());
    	sb.append("pageNumber:"+getPageNumber());
    	sb.append("pageAvailable:"+getPagesAvailable());
    	return sb.toString();
    }
	
}
