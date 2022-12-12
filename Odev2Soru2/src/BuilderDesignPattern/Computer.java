package BuilderDesignPattern;

public class Computer{
	
public static class Builder{
		
		private String ram,ssd,cpu;
		
		public Builder ram(String ram) {
			this.ram=ram;
			return this;
		}
		public Builder ssd(String ssd) {
			this.ssd=ssd;
			return this;
		}
		public Builder cpu(String cpu) {
			this.cpu=cpu;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}

	private String ram,ssd,cpu;

	public Computer(Builder builder) {
		super();
		this.ram = builder.ram;
		this.ssd = builder.ssd;
		this.cpu = builder.cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getSsd() {
		return ssd;
	}

	public String getCpu() {
		return cpu;
	}
	
	
	@Override
	public String toString() {
		
		return "Bilgisayar " + ram + " ram "+ cpu + " işlemci ve " +ssd+" ssd ile oluşturuldu.";
	}
}
