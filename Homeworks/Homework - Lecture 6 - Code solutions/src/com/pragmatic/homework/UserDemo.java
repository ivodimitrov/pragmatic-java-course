package com.pragmatic.homework;

import java.util.Date;

public class UserDemo {
	public static void main(String[] args) {
		Date date = new Date ();
		User regularUser = new UserImpl("John", date);
		AdminUser adminUser = new AdminUserImpl("Mark", date);

		adminUser.login();
		adminUser.addUser(regularUser);
		
		regularUser.login();
		adminUser.deleteUser(regularUser);
	}
}
