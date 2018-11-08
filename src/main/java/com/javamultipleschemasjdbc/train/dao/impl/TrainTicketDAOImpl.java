package com.javamultipleschemasjdbc.train.dao.impl;

import com.javamultipleschemasjdbc.train.dao.TrainTicketDAO;
import com.javamultipleschemasjdbc.train.dao.query.TrainTicketQuery;
import com.javamultipleschemasjdbc.train.dao.rowmapper.TicketRowMapper;
import com.javamultipleschemasjdbc.train.entity.Ticket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("trainTicketDAO")
public class TrainTicketDAOImpl implements TrainTicketDAO {
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public TrainTicketDAOImpl(@Qualifier("dataSourceTrain") DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<Ticket> findAll() {
		List<Ticket> tickets = this.namedParameterJdbcTemplate.query(TrainTicketQuery.SELECT_ALL, new TicketRowMapper());
		
		return tickets;
	}
	
	@Override
	public Ticket findById(Long id) {
		MapSqlParameterSource parameter = new MapSqlParameterSource("id", id);
		Ticket ticket = (Ticket) this.namedParameterJdbcTemplate.queryForObject(TrainTicketQuery.SELECT_BY_ID, parameter, new TicketRowMapper());
		
		return ticket;
	}
}
