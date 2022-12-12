package FactoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		PhoneCreater phoneCreater=new PhoneCreater();
		
		Phone phone1=phoneCreater.factoryMethod(PhoneType.Iphone);
		Phone phone2=phoneCreater.factoryMethod(PhoneType.Samsung);
		phone1.phoneType();
		phone2.phoneType();
	}

}
