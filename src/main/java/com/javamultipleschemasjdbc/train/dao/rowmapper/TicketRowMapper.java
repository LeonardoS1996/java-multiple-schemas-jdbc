package com.javamultipleschemasjdbc.train.dao.rowmapper;

import com.javamultipleschemasjdbc.train.entity.Ticket;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketRowMapper implements RowMapper {
	
	@Override
	public Ticket mapRow(ResultSet rs, int i) throws SQLException {
		Ticket ticket = new Ticket();
		ticket.setId(rs.getLong("id"));
		ticket.setPrice(rs.getBigDecimal("price"));

		return ticket;
	}
	
}
