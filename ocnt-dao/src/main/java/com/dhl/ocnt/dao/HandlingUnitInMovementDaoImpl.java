package com.dhl.ocnt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dhl.ocnt.dao.util.PaginationHelper;
import com.dhl.ocnt.model.AssignMovement;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Page;

@Repository("HandlingUnitInMovementDao")
public class HandlingUnitInMovementDaoImpl implements HandlingUnitInMovementDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String handlingUnitInMovementCntSQL = "SELECT count(1) from HU_IN_MOVEMENT where movement_id = ? ";
	private String handlingUnitSQL = ConstantsDao.SELECT_HU_IN_MOVEMENT;
	
	@Override
	public Page<HandlingUnit> getHandlingUnitInMovementList(String movementId, int pageNo, int pageSize) {
		PaginationHelper<HandlingUnit> ph = new PaginationHelper<HandlingUnit>();
		return ph.fetchPage(jdbcTemplate, handlingUnitInMovementCntSQL, 
				handlingUnitSQL, 
								new Object[]{movementId}, pageNo, pageSize, new RowMapper<HandlingUnit>(){

									@Override
									public HandlingUnit mapRow(ResultSet rs,int i) 
											throws SQLException {
										HandlingUnit hu = new HandlingUnit();
										hu.setHandlingUnit(rs.getString("HU_ID"));
										hu.setRegNo("");
										hu.setHandlingUnitType("");
										hu.setEPO("");
										hu.setFlagging("");
										hu.setStatus("");
										return hu;
									}
			
		});
	}

}
