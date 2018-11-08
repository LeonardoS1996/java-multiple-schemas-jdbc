package com.javamultipleschemasjdbc.train.dao.query;

public class TrainTicketQuery {
	
	private TrainTicketQuery() {
	}
	
	public static final String SELECT_ALL = "SELECT " +
											"   id," +
											"   price " +
											"FROM " +
											"   train.ticket;";
	
	public static final String SELECT_BY_ID =   "SELECT " +
												"   id," +
												"   price " +
												"FROM " +
												"   train.ticket" +
												"WHERE " +
												"   id = :id;";
}
