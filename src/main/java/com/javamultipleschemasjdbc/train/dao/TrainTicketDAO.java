package com.javamultipleschemasjdbc.train.dao;

import com.javamultipleschemasjdbc.train.entity.Ticket;

import java.util.List;

public interface TrainTicketDAO {
	
	List<Ticket> findAll();
	
	Ticket findById(Long id);
	
}
