package com.pragmatic.homework;

public interface AdminUser extends User {
	void addUser (User user);
	
	void deleteUser (User user);
}
