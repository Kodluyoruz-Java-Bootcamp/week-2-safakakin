import Abstract.Entity;
import instanceCreation.InstanceCreator;
import instanceCreation.InstanceType;


public class Main {

	public static void main(String[] args) {
		
		InstanceCreator instanceCreator=InstanceCreator.getInstance();
		System.out.println(instanceCreator.toString());
		
		InstanceCreator instanceCreator2=InstanceCreator.getInstance();
		System.out.println(instanceCreator2.toString());
		
		Entity model=instanceCreator.factoryMethod(InstanceType.REALTY);
		System.out.println(model.toString());
		
		Entity model2=instanceCreator.factoryMethod(InstanceType.REALTY);
		System.out.println(model2.toString());
		
		Entity realtyDao=instanceCreator.factoryMethod(InstanceType.REALTYDAO);
		System.out.println(realtyDao.toString());
		
		Entity userService=instanceCreator.factoryMethod(InstanceType.USERSERVICE);
		System.out.println(userService.toString());
	}

}
