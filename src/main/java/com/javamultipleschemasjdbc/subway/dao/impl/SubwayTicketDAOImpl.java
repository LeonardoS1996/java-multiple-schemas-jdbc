package com.javamultipleschemasjdbc.subway.dao.impl;

import com.javamultipleschemasjdbc.subway.dao.SubwayTicketDAO;
import com.javamultipleschemasjdbc.subway.dao.query.SubwayTicketQuery;
import com.javamultipleschemasjdbc.train.entity.Ticket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository("subwayTicketDAO")
public class SubwayTicketDAOImpl implements SubwayTicketDAO {

	private JdbcTemplate jdbcTemplate;

	public SubwayTicketDAOImpl(@Qualifier("dataSource") DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Ticket ticket) {
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SubwayTicketQuery.SAVE);
				ps.setBigDecimal(1, ticket.getPrice());
				return ps;
			}
		});
	}

	@Override
	public void save(List<Ticket> tickets) {
		jdbcTemplate.batchUpdate(SubwayTicketQuery.SAVE,
				new BatchPreparedStatementSetter() {
					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setBigDecimal(1, tickets.get(i).getPrice());
					}

					@Override
					public int getBatchSize() {
						return tickets.size();
					}
				});
	}
}
