package com.pragmatic.homework;

import java.util.Date;

public class AdminUserImpl extends AbstractUser implements AdminUser {

	public AdminUserImpl(String name, Date registrationDate) {
		super(name, registrationDate);
	}
	
	@Override
	public void login() {
		System.out.println("The following administrator has logged in: " + this.getName());
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("The following user was deleted: " + user.getName());
	}

	@Override
	public void addUser(User user) {
		System.out.println("The following user was added: " + user.getName());
	}
}