package com.dhl.ocnt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dhl.ocnt.dao.util.PaginationHelper;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;

@Repository("MovementDao")
public class MovementDaoImpl implements MovementDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Properties movementQuery;
	
	@Override
	public Page<Movement> getMovementList(int minusDate, int plusDate,
			final int pageNo,final int pageSize,String location) {
		PaginationHelper<Movement> ph = new PaginationHelper<Movement>();
		return ph.fetchPage(jdbcTemplate, movementQuery.getProperty("getMovementCount"), 
								movementQuery.getProperty("getMovement"), 
								new Object[]{}, pageNo, pageSize, new RowMapper<Movement>(){

									@Override
									public Movement mapRow(ResultSet rs,int i) 
											throws SQLException {
										Movement movement = new Movement();
										movement.setMovementId(rs.getString("MOVEMENT_NUMBER"));
										return movement;
									}
			
		});
	}

}
