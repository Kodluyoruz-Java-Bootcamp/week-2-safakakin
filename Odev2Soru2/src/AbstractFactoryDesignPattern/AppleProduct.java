package AbstractFactoryDesignPattern;

public class AppleProduct implements ProductFactory {

	@Override
	public Phone createPhone() {
		return new ApplePhone();
	}

	@Override
	public Computer createComputer() {
		return new AppleComputer();
	}

}
