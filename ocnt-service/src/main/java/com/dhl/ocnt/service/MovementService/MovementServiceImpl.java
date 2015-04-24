package com.dhl.ocnt.service.MovementService;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.ocnt.dao.MovementDao;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;

public class MovementServiceImpl implements MovementService{

	@Autowired
	private MovementDao movementDao;

	@Override
	public Page<Movement> getMovementList(int minusDate, int plusDate,
			int pageNo, int pageSize, String location) {
		return movementDao.getMovementList(minusDate, plusDate, pageNo, pageSize, location);
	}
	
}
