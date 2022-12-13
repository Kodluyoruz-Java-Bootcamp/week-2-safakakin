package model;

import Abstract.Entity;

public class Realty implements Entity{
	
	private static Realty realtyInstance;
	
	private Realty() {}
	
	public static Realty getInstance() {
		if(realtyInstance==null) {
			realtyInstance=new Realty();
		}
		return realtyInstance;
	}
	
	
}
