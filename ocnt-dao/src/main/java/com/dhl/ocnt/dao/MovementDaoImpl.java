package com.dhl.ocnt.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dhl.ocnt.dao.util.DHLFormat;
import com.dhl.ocnt.dao.util.DateTimeUtil;
import com.dhl.ocnt.dao.util.PaginationHelper;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;

@Repository("MovementDao")
public class MovementDaoImpl implements MovementDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String movementCountSQL = "SELECT COUNT(1) "+
			"FROM MOVEMENT M INNER JOIN MOVEMENT_DOCUMENT MD "+
			"ON M.MOVEMENT_ID = MD.MOVEMENT_ID WHERE " +
			"m.MVMT_SCHD_DEPARTURE_DT BETWEEN TRUNC(SYSDATE) -? AND TRUNC(SYSDATE) +? "+
			"AND m.ORI_FAC_ID=?";

	private String movementSQL = "SELECT MOVEMENT_NUMBER,M.MOVEMENT_ID,FLEET_TYPE,VEHICLE_ID,M.MVMT_SCHD_DEPARTURE_DT, " +
			"M.DEST_FAC_ID, MOVEMENT_DOCUMENT_ID, MVMT_STATUS_CODE, CLOSE_DT, DEPART_DT, CUT_OFF_TIME " +
			"FROM MOVEMENT M INNER JOIN MOVEMENT_DOCUMENT MD " +
			"ON M.MOVEMENT_ID = MD.MOVEMENT_ID WHERE " +
			"m.MVMT_SCHD_DEPARTURE_DT BETWEEN TRUNC(SYSDATE) -? AND TRUNC(SYSDATE) +? " +
			"AND m.ORI_FAC_ID=?";
	
	@Override
	public Page<Movement> getMovementList(int minusDate, int plusDate,
			final int pageNo,final int pageSize,String location) {
		PaginationHelper<Movement> ph = new PaginationHelper<Movement>();
		return ph.fetchPage(jdbcTemplate, movementCountSQL, 
				movementSQL, 
								new Object[]{minusDate,plusDate,location}, pageNo, pageSize, new RowMapper<Movement>(){

									@Override
									public Movement mapRow(ResultSet rs,int i) 
											throws SQLException {
										Movement movement = new Movement();
										
										Date stdDate = rs.getDate("MVMT_SCHD_DEPARTURE_DT");
										Date cutOffTime = rs.getDate("CUT_OFF_TIME");
										String movno = rs.getString("MOVEMENT_NUMBER");
										String movId = rs.getString("MOVEMENT_DOCUMENT_ID");
										movement.setMovementNo(movno + DateTimeUtil.getSlashDayFromDate(stdDate));
										movement.setTransptReg(rs.getString("VEHICLE_ID"));
										movement.setTransptType(rs.getString("FLEET_TYPE"));
										movement.setSTD(DateTimeUtil.formatDateToHhColonMm(stdDate));
										movement.setDestination(rs.getString("DEST_FAC_ID"));
										movement.setMawb(DHLFormat.setMawbFormat(movId));
										movement.setMfst("");
										movement.setCutOffTime(DateTimeUtil.formatDateToHhColonMm(cutOffTime));
										movement.setStatus(rs.getString("MVMT_STATUS_CODE"));
										return movement;
									}
			
		});
	}

}
