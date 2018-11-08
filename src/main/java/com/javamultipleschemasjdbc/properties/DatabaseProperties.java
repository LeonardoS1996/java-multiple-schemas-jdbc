package com.javamultipleschemasjdbc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.datasource")
public class DatabaseProperties {

	private String driverClassname;

	private String url;

	private String username;

	private String password;

	private String urlTrain;

	private String usernameTrain;

	private String passwordTrain;

	public String getDriverClassname() {
		return driverClassname;
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlTrain() {
		return urlTrain;
	}

	public void setUrlTrain(String urlTrain) {
		this.urlTrain = urlTrain;
	}

	public String getUsernameTrain() {
		return usernameTrain;
	}

	public void setUsernameTrain(String usernameTrain) {
		this.usernameTrain = usernameTrain;
	}

	public String getPasswordTrain() {
		return passwordTrain;
	}

	public void setPasswordTrain(String passwordTrain) {
		this.passwordTrain = passwordTrain;
	}
}
