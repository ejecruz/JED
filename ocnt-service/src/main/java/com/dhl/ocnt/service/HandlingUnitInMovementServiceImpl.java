package com.dhl.ocnt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.ocnt.dao.HandlingUnitInMovementDao;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Page;

public class HandlingUnitInMovementServiceImpl implements HandlingUnitInMovementService{
	
	@Autowired
	private HandlingUnitInMovementDao handlingUnitInMovementDao;

	@Override
	public Page<HandlingUnit> getHandlingUnitInMovementList(String movementId, int pageNo, int pageSize) {
		return handlingUnitInMovementDao.getHandlingUnitInMovementList(movementId, pageNo, pageSize);
	}
}
