package inheritance_relationship;

public class Cat extends Animal {

	private boolean tail;

	public Cat() {
	}

	public Cat(String name, int size, float weight, boolean tail) {
		super(name, size, weight);
		this.tail = tail;
	}

	public boolean isTail() {
		return tail;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

	// khi co phuong thuc cung ten,kieu tra ve, tham so 
	// thi se tu dong overwrite.
	public void eat() {
		System.out.println("Cat Eat");
	}
	
	public void eat(boolean fast) {
		System.out.println("Cat Eat " + (fast ? "Fast" : "Slow"));
	}
	
	public void move() {
		System.out.println("Cat Move");
	}
}