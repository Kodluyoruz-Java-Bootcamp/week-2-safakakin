package PrototypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		//Tree nesnesi yarattık.
		Tree tree1=new Tree(1,2,15);
		//Clone methodunu kullanarak yeni bir tree değişkenine
		//nesne ataması yaptık.
		Tree tree2=tree1.clone();
		// Eşitlik durumunu incelediğimizde false dönmektedir.
		// Bu da iki farklı nesneye ait referans olduğunu kanıtlar.
		System.out.println(tree1==tree2);

	}

}
