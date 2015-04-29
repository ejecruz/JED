package com.dhl.ocnt.service;

import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Page;

public interface HandlingUnitInMovementService {
	
	Page<HandlingUnit> getHandlingUnitInMovementList(String movementId, int pageNo, int pageSize);

}
