package abstract_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao 1 animal co hinh thai la dog
		Animal dogAnimal = new Dog("The dog");
		dogAnimal.eat();
		dogAnimal.breath();
		System.out.println("-------------");
		// khoi tao 1 animal co hinh thai la cat
		Animal catAnimal = new Nhon("The cat");
		catAnimal.eat();
		catAnimal.breath();
//		catAnimal.slash(); // khong the dung duoc kieu nay 
		// slash khong phai la the hien cua abstract animal
		
		System.out.println("-------------");
		Cat catNhonCat = new Nhon("Nhon me");
		catNhonCat.eat();
		catNhonCat.breath();
		catNhonCat.slash();
	}
}
