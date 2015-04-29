package com.dhl.ocnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhl.ocnt.dao.HandlingUnitInMovementDao;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Page;

@Service
public class HandlingUnitInMovementServiceImpl implements HandlingUnitInMovementService{
	
	@Autowired
	private HandlingUnitInMovementDao handlingUnitInMovementDao;

	@Override
	public Page<HandlingUnit> getHandlingUnitInMovementList(String movementId, int pageNo, int pageSize) {
		return handlingUnitInMovementDao.getHandlingUnitInMovementList(movementId, pageNo, pageSize);
	}
	
	@Override
	public Page<HandlingUnit> getHandlingUnitNotAllocated(String movementId, int pageNo, int pageSize) {
		return handlingUnitInMovementDao.getHandlingUnitNotAllocated(movementId, pageNo, pageSize);
	}
}
