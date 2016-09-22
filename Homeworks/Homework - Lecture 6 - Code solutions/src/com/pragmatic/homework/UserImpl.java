package com.pragmatic.homework;

import java.util.Date;

public class UserImpl extends AbstractUser {

	public UserImpl(String name, Date registrationDate) {
		super(name, registrationDate);
	}
	
	@Override
	public void login() {
		System.out.println("User [" + name + "] is logging in");
	}
}