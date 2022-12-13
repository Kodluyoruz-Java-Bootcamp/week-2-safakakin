package instanceCreation;

import Abstract.Entity;
import dao.RealtyDao;
import dao.UserDao;
import model.Realty;
import model.User;
import service.RealtyService;
import service.UserService;

public class InstanceCreator {
	private static InstanceCreator instanceCreatorInstance;
	
	private InstanceCreator() {}
	
	public static InstanceCreator getInstance() {
		if(instanceCreatorInstance==null) {
			instanceCreatorInstance=new InstanceCreator();
		}
		return instanceCreatorInstance;
	}
	
	public Entity factoryMethod(InstanceType instanceType) {
		Entity entity=null;
		switch(instanceType) {
			case REALTY:
				entity=Realty.getInstance();
				break;
			case USER:
				entity=User.getInstance();
				break;
			case REALTYDAO:
				entity=RealtyDao.getInstance();
				break;
			case USERDAO:
				entity=UserDao.getInstance();
				break;
			case REALTYSERVICE:
				entity=RealtyService.getInstance();
				break;
			case USERSERVICE:
				entity=UserService.getInstance();
				break;
		}
		return entity;
	}
	
}
