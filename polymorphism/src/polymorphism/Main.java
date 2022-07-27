package polymorphism;

import java.util.Iterator;

// co the khai bao nhieu class trong 1 file java, nhung chi 1 duoc public.
// va class do chi ton tai trong file nay.

class Bank {
	private String name;

	public Bank(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int interestRate() {
		return 0;
	}
}

class VCB extends Bank {

	public VCB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int interestRate() {
		return 12;
	}
}

class TCB extends Bank {

	public TCB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int interestRate() {
		return 24;
	}
}

class ACB extends Bank {

	public ACB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int interestRate() {
		return 36;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO OOP: Dong goi, ke thua, da hinh, truu tuong
		// I. Da hinh: has-A => Ngan hang co' the la ACB, TCB ,... rat nhieu hinh thai cua Bank,
		for (int i = 0; i < 10; i++) {
			Bank bank = getBank();
			System.out.println("Bank " + bank.getName() + ". Rate: " + bank.interestRate());
		}
	}

	public static Bank getBank() {
		int num = (int) (Math.random() * 3 + 1);
		switch (num) {
		case 1:
			return new VCB("VCB");
		case 2:
			return new TCB("TCB");
		case 3:
			return new ACB("ACB");
		default:
			return null;
		}
	}
}
