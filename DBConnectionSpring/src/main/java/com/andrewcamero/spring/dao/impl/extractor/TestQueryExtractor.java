package com.andrewcamero.spring.dao.impl.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

/*
 * This class conne
 */
public class TestQueryExtractor implements ResultSetExtractor<List<String>> {

	@Override
	public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<String> queryList = new ArrayList<>();
		if (rs != null) {
			while (rs.next()) {
				String column1 = rs.getString("COLUMN1");
				String column2 = rs.getString("COLUMN2");
				String column3 = rs.getString("COLUMN3");

				queryList.add(column1 + "," + column2 + "," + column3);
			}
		}
		return queryList;
	}

}
