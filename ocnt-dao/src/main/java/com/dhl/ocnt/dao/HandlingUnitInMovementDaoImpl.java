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
	private String handlingUnitSQL = "SELECT HU.* FROM HANDLING_UNIT HU, HU_IN_MOVEMENT HM WHERE HM.HU_ID = HU.HU_ID AND HM.MOVEMENT_ID = ? ";
	private String handlingUitNonAllocatedCntSQL = "SELECT COUNT(1) FROM (SELECT ROWNUM RN, COUNT(1) OVER() AS TOTAL_RECORD, HU.* FROM HANDLING_UNIT HU " +
												" WHERE HU.ORI_FAC_ID = 'KULGTW' AND HU.HU_STATUS != 'N' AND NVL(HU.CURR_CONT_FAC, 'NUL') != 'KULGTW' " +
												" AND OUTB_INB_IND = 'O') HU ";
	private String handlingUitNonAllocatedSQL = "SELECT HU.* FROM (SELECT ROWNUM RN, COUNT(1) OVER() AS TOTAL_RECORD, HU.* FROM HANDLING_UNIT HU " +
												" WHERE HU.ORI_FAC_ID = 'KULGTW' AND HU.HU_STATUS != 'N' AND NVL(HU.CURR_CONT_FAC, 'NUL') != 'KULGTW' " +
												" AND OUTB_INB_IND = 'O') HU ";
	
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
										hu.setRegNo(rs.getString("HU_LOAD_DEVICE_REG_NUM")); //HU_LOAD_DEVICE_REG_NUM
										hu.setHandlingUnitType(rs.getString("HU_TYPE_CODE")); //HU_TYPE_CODE
										hu.setEPO(rs.getString("HU_PROCESS_LOCATION"));//HU_PROCESS_LOCATION
										hu.setFlagging(rs.getString("HU_FLAG"));//HU_FLAG
										hu.setStatus(rs.getString("HU_STATUS"));//HU_STATUS
										return hu;
									}
			
		});
	}
	
	@Override
	public Page<HandlingUnit> getHandlingUnitNotAllocated(String movementId, int pageNo, int pageSize) {
		PaginationHelper<HandlingUnit> ph = new PaginationHelper<HandlingUnit>();
		return ph.fetchPage(jdbcTemplate, handlingUitNonAllocatedCntSQL, 
				handlingUitNonAllocatedSQL, 
								new Object[]{}, pageNo, pageSize, new RowMapper<HandlingUnit>(){

									@Override
									public HandlingUnit mapRow(ResultSet rs,int i) 
											throws SQLException {
										HandlingUnit hu = new HandlingUnit();
										hu.setHandlingUnit(rs.getString("HU_ID"));
										hu.setRegNo(rs.getString("HU_LOAD_DEVICE_REG_NUM")); //HU_LOAD_DEVICE_REG_NUM
										hu.setHandlingUnitType(rs.getString("HU_TYPE_CODE")); //HU_TYPE_CODE
										hu.setEPO(rs.getString("HU_PROCESS_LOCATION"));//HU_PROCESS_LOCATION
										hu.setFlagging(rs.getString("HU_FLAG"));//HU_FLAG
										hu.setStatus(rs.getString("HU_STATUS"));//HU_STATUS
										return hu;
									}
			
		});
	}

}
