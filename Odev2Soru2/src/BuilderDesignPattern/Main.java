package BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		Computer computer=new Computer.Builder().cpu("3.5 ghz").ram("8 gb").ssd("256gb").build();
		System.out.println(computer.toString());
	}

}
