package SingletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		// İlgili sınıfın yapıcı methodu private olduğu için yapıcı
		// methodu kullanarak nesne yaratamıyoruz.
		// SingletonDesign singletonIstance2=new SingletonDesign();
		
		// Sınıf içerisindeki örnek oluşturma metoduna static işaretli olduğu için
		// sınıfın nesnesine ihtiyaç duymadan ulaşabiliyoruz. Methot sayesinde ilk
		// ve kalıcı methodumuzu oluşturuyoruz.
		SingletonDesign singletonInstance3=SingletonDesign.getInstance();
		
		// Aynı methodu farklı bir değişken ismi ile tekrar çağırdığımızda önceden
		// oluşturmuş olduğumuz nesneyi döndürecektir.
		SingletonDesign singletonInstance4=SingletonDesign.getInstance();
		
		
		
		// İki değişkenin de aynı referansa sahip olması durumunda true dönecektir.
		System.out.println(singletonInstance3==singletonInstance4);
	}

}
