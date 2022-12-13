package dao;

import Abstract.Entity;

public class UserDao implements Entity{
	private static UserDao userDaoInstance;
	
	private UserDao() {}
	
	public static UserDao getInstance() {
		if(userDaoInstance==null) {
			userDaoInstance=new UserDao();
		}
		return userDaoInstance;
	}
}
