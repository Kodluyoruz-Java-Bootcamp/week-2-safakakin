package AbstractFactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		ProductFactory appleProduct=new AppleProduct();
		ProductFactory samsungProduct=new SamsungProduct();
		
		appleProduct.createComputer();
		appleProduct.createPhone();
		
		samsungProduct.createComputer();
		samsungProduct.createPhone();
	}
}
