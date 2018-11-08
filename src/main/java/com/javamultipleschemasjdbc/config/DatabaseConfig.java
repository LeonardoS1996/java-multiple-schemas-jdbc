package com.javamultipleschemasjdbc.config;

import com.javamultipleschemasjdbc.properties.DatabaseProperties;
import com.javamultipleschemasjdbc.properties.Dbcp2Properties;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
	
	@Autowired
	private DatabaseProperties databaseProperties;
	
	@Autowired
	private Dbcp2Properties dbcp2Properties;
	
	@Bean("dataSource")
	@Primary
	public DataSource getDataSourceDemo() {
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(databaseProperties.getDriverClassname());
		dataSource.setUrl(databaseProperties.getUrl());
		dataSource.setUsername(databaseProperties.getUsername());
		dataSource.setPassword(databaseProperties.getPassword());
		
		dataSource.setInitialSize(dbcp2Properties.getInitialSize());
		dataSource.setMaxIdle(dbcp2Properties.getMaxIdle());
		dataSource.setMaxTotal(dbcp2Properties.getMaxTotal());
		dataSource.setPoolPreparedStatements(dbcp2Properties.getPoolPreparedStatements());

		return dataSource;
	}
	
	@Bean("dataSourceTrain")
	public DataSource getDataSourceTrain() {
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(databaseProperties.getDriverClassname());
		dataSource.setUrl(databaseProperties.getUrlTrain());
		dataSource.setUsername(databaseProperties.getUsernameTrain());
		dataSource.setPassword(databaseProperties.getPasswordTrain());
		
		dataSource.setInitialSize(dbcp2Properties.getInitialSize());
		dataSource.setMaxIdle(dbcp2Properties.getMaxIdle());
		dataSource.setMaxTotal(dbcp2Properties.getMaxTotal());
		dataSource.setPoolPreparedStatements(dbcp2Properties.getPoolPreparedStatements());

		return dataSource;
	}
	
}
