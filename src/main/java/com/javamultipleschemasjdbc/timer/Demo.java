package com.javamultipleschemasjdbc.timer;

import com.javamultipleschemasjdbc.subway.dao.SubwayTicketDAO;
import com.javamultipleschemasjdbc.train.dao.TrainTicketDAO;
import com.javamultipleschemasjdbc.train.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Demo {
	
	private static Logger logger = Logger.getLogger(Demo.class.getName());
	
	@Autowired
	private TrainTicketDAO trainTicketDAO;
	
	@Autowired
	private SubwayTicketDAO subwayTicketDAO;
	
	@Scheduled(fixedRate = 5000)
	public void execute() {
		try {
			List<Ticket> tickets = trainTicketDAO.findAll();
			subwayTicketDAO.save(tickets);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}
