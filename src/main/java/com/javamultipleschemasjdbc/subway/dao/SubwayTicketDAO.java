package com.javamultipleschemasjdbc.subway.dao;

import com.javamultipleschemasjdbc.train.entity.Ticket;

import java.util.List;

public interface SubwayTicketDAO {
	
	void save(Ticket ticket);
	
	void save(List<Ticket> tickets);
	
}
