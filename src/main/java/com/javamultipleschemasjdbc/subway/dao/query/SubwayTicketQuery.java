package com.javamultipleschemasjdbc.subway.dao.query;

public class SubwayTicketQuery {
	
	private SubwayTicketQuery() {}
	
	public static final String SAVE = "insert into " +
										"   subway.ticket (id, price) " +
										"VALUES (" +
										"   nextVal('subway.ticket_sequence'), " +
										"   ?);";
	
}
