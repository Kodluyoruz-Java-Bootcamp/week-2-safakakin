package FactoryMethodPattern;

public class PhoneCreater {
	
	public Phone factoryMethod(PhoneType phoneType) {
		Phone phone=null;
		switch(phoneType) {
			case Iphone:
				phone=new Iphone();
				break;
			case Samsung:
				phone=new Samsung();
				break;
		}
		return phone;
	}

}
