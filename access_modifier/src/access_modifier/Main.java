package access_modifier;

public class Main {

	// static la bien hoac function, tat ca cac doi tuong co the truy cap
	private int x;
	public void changeX() {
		x = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("VietND");
		Student student2 = new Student("LinhHT");
		Student student3 = new Student("Nhon");
		System.out.println("----------");
		System.out.println(student1.getName() + "----------" + student1.getNumbers());
		System.out.println(student2.getName() + "----------" + student2.getNumbers());
		System.out.println(student3.getName() + "----------" + student3.getNumbers());
		System.out.println("----------");
		
		// co the goi truc tiep thong qua doi tuong Student
		System.out.println("Total student: " + Student.getNumbers());
//		System.out.println("Total student: " + Student.getName()); cai nay khong bao gio duoc phai goi tu doi tuong
		
		// function thong thuong can phai khoi tao doi tuong. truoc sau do moi goi den thuoc tinh or phuong thuc
		Main main = new Main();
		
		main.changeX();
		main.x = 1;
		//////////////ACCESS MODIFIER/////////////////
		BankAccount account = new BankAccount("VietND");
		account.deposit(1000000);
		account.withdrawn(20);
		account.withdrawn(20);
		account.withdrawn(20);
		account.withdrawn(20);
		// khong co phuong thuc setBalance trong TH nay vi  thay doi so du chi thong qua 2 hd, deposit vs withdrawn
	}

}
