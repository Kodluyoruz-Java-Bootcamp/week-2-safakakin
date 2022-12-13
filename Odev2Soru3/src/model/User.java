package model;

import Abstract.Entity;

public class User implements Entity{
	
	
	private static User userInstance;
	
	private User() {}
	
	public static User getInstance() {
		if(userInstance==null) {
			userInstance=new User();
		}
		return userInstance;
	}
}
