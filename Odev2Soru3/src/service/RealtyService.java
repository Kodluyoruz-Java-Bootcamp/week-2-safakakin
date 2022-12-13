package service;

import Abstract.Entity;

public class RealtyService implements Entity{
	private static RealtyService realtyServiceInstance;
	
	private RealtyService() {}
	
	public static RealtyService getInstance() {
		if(realtyServiceInstance==null) {
			realtyServiceInstance=new RealtyService();
		}
		return realtyServiceInstance;
	}
}
