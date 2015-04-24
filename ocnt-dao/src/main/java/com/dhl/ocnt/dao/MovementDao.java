package com.dhl.ocnt.dao;

import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;

public interface MovementDao {

	Page<Movement> getMovementList(int minusDate, int plusDate,
			int pageNo, int pageSize, String location);
	
}
