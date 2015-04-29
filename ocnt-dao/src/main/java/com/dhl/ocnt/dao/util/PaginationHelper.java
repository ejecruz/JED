package com.dhl.ocnt.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dhl.ocnt.model.Page;

public class PaginationHelper<E> {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Page<E> fetchPage(final JdbcTemplate jt, final String sqlCountRows,
			final String sqlFetchRows, final Object args[], final int pageNo,
			final int pageSize, final RowMapper<E> rowMapper) {

		// determine how many rows are available
		final int rowCount = jt.queryForObject(sqlCountRows, args,Integer.class);

		// calculate the number of pages
		int pageCount = rowCount / pageSize;
		if (rowCount > pageSize * pageCount) {
			pageCount++;
		}

		// create the page object
		final Page<E> page = new Page<E>();
		page.setPageNumber(pageNo);
		page.setPagesAvailable(pageCount);

		// fetch a single page of results
		final int startRow = (pageNo - 1) * pageSize;
		jt.query(sqlFetchRows, args, new ResultSetExtractor() {
			public Object extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				final List pageItems = page.getPageItems();
				int currentRow = 0;
//				while (rs.next() && currentRow < startRow + pageSize) {
//					if (currentRow >= startRow) {
//						pageItems.add(rowMapper.mapRow(rs, currentRow));
//					}
//					currentRow++;
//				}
				while (rs.next()){
					pageItems.add(rowMapper.mapRow(rs, currentRow));
					currentRow++;
				}
				return page;
			}
		});
		return page;
	}

}
