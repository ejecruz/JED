package com.dhl.ocnt.service.MovementService;

import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;

public interface MovementService {

	public Page<Movement> getMovementList(int minusDate, int plusDate, int pageNo,
			int pageSize, String location);
	
}
