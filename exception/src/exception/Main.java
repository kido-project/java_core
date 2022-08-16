package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.crypto.ExemptionMechanismException;

class Hello {
	void a () throws FileNotFoundException { // dung try catch trong ham hoac throw exception, 
		// throws KHAI BAO exception
		// uncheck exception
		// checkd exception, example: int a = "a"; bao' do?
//		int a = 3/0;
		FileReader fReader = new FileReader("test.txt");
//		throw new FileNotFoundException(); CHU DONG TAO exception
	}
	
	void b () throws FileNotFoundException {
		a();
	}
	
	void c () {
		try {
			b();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
public class Main {
	public static void validateAge (int age) throws InvalidAgeException {
		if (age < 19) {
			throw new InvalidAgeException("Em chua 19: " + age);
		} else {
			System.out.println("Ok");
		}
	}
	public static void main(String[] args) {
//		int a=3;
//		int b=0;
//		int device = 0;
//		try {
//			device = a/b;
//			System.out.println(device);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("Loi vai cuc");
//		} catch (ArrayIndexOutOfBoundsException e2) {
//			e2.printStackTrace();
//		} catch (ArrayStoreException e3) {
//			e3.printStackTrace();
//		} catch (Exception e4) {
//			e4.printStackTrace();
//		} finally {
//			System.out.println("Kieu gi t cha chay");
//		}
		//con multiple catch thi phai chi ro excepion phai o cuoi cung vi exception la Class cha cua cac exception khac
		new Hello().c();
		
		//CUSTOM EXCEPTION
		try {
			validateAge(15);
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			int a = 3/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
