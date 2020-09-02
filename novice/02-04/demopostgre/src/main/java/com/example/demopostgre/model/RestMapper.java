package com.example.demopostgre.model;

import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.tree.RowMapper;

public class RestMapper implements RowMapper{
    @Override
    public Rest mapRow(ResultSet rs, int rowNum) throws SQLException{
        Rest rest = new Rest();
        rest.setId(rs.getInt("id"));
        rest.setKey(rs.getString("key"));
		rest.setValue(rs.getString("value"));

		RestResult restResult = new RestResult();
		restResult.setId(rs.getInt("id"));
		restResult.setRand(rs.getInt("rand"));
		return rest;
    }
}
