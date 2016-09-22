package com.pragmatic.homework;

import java.util.Date;

public abstract class AbstractUser implements User {
	protected String name;
	protected Date registrationDate;
	
	public AbstractUser(String name, Date registrationDate) {
		this.name = name;
		this.registrationDate = registrationDate;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getRegistrationDate() {
		return registrationDate;
	}
}