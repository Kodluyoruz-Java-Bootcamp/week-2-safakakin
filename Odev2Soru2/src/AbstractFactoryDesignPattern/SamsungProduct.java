package AbstractFactoryDesignPattern;

public class SamsungProduct implements ProductFactory{

	@Override
	public Phone createPhone() {
		return new SamsungPhone();
	}

	@Override
	public Computer createComputer() {
		return new SamsungComputer();
	}
}
