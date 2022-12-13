package service;

import Abstract.Entity;

public class UserService implements Entity{
	private static UserService userServiceInstance;
	
	private UserService() {}
	
	public static UserService getInstance() {
		if(userServiceInstance==null) {
			userServiceInstance=new UserService();
		}
		return userServiceInstance;
	}
}
