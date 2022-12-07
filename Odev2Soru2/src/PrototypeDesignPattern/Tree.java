package PrototypeDesignPattern;

//Oluşturulan sınıf Cloneable arayüzünü implement eder
public class Tree implements Cloneable{
	
	//Sınıfın fieldları oluşturulur.
	private int height;
	private int width;
	private int age;
	
	
	//Field değerlerini içeren yapıcı method oluşturulur.
	public Tree(int height, int width, int age) {
		super();
		this.height = height;
		this.width = width;
		this.age = age;
	}
	
	// Field getter ve setter metotları oluşturulur.
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	//Clone methodunu tree objesinin deep copy versiyonunu döndürecek 
	//şekilde güncelliyoruz.
	@Override
	public Tree clone() {
		
		Tree tree = null;

        try {
        	tree = (Tree) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Tree clone'u yaratılamadı.");
            e.printStackTrace();
        }
        return tree;
	}
}
