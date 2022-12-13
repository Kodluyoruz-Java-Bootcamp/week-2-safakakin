package dao;

import Abstract.Entity;

public class RealtyDao implements Entity{
	private static RealtyDao realtyDaoInstance;
	
	private RealtyDao() {}
	
	public static RealtyDao getInstance() {
		if(realtyDaoInstance==null) {
			realtyDaoInstance=new RealtyDao();
		}
		return realtyDaoInstance;
	}
}	
