package com.dhl.ocnt.dao;

import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Page;

public interface HandlingUnitInMovementDao {
	
	Page<HandlingUnit> getHandlingUnitInMovementList(String movementId, int pageNo, int pageSize);
	
	Page<HandlingUnit> getHandlingUnitNotAllocated(String movementId, int pageNo, int pageSize);

}
