package SingletonDesignPattern;

public class SingletonDesign {
	
	//Varsayılan yapıcı method private olarak işaretlenir. 
	//Sadece sınıf içerisinde erişim sağlanır.
	
	private SingletonDesign() {
		
	}
	
	//Instance oluştururken kullanılacak ilk değeri null olan field 
	//private static olarak tanımlanır. Private olduğu için dışarıdan erişilemez.
	//Static bir method içerisinde kullanacağımız için static olarak tanımlanır.
	
	private static SingletonDesign singletonInstance;
	
	
	// Diğer sınıflardan bu sınıfın nesnesini oluşturmak için kullanılacak olan
	// methot tanımlanır. Methot çağırıldığında if bloğu ile daha önce bir instance
	// oluşturulup oluşturulmadığı kontrol ediliyor. Eğer oluşturulmadıysa yeni bir 
	// instance yaratılıp methot tarafından döndürülüyor. Eğer instance mevcut ise 
	// doğrudan mevcut instance döndürülüyor. Böylece her methot çağırıldığında 
	// aynı referansa sahip nesne döndürülüyor.
	public static SingletonDesign getInstance() {
		if(singletonInstance==null) {
			singletonInstance=new SingletonDesign();
		}
		return singletonInstance;
	}
}
