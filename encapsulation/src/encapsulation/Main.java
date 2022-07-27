package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO OOP: Dong goi, ke thua, da hinh, truu tuong
		// I. Dong goi
		// bao dam tinh dung dan, toan ven cua du lieu.
		// khong the goi truc tiep => goi qua get or set
		// dung get de khong can refactor code nhieu noi
		
		Human human = new Human();
		
		human.setName("Viet");
		human.setAge(1);
		human.setCountry("Vietnam");
		
		human.display();
	}

}
