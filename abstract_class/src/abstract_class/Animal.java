package abstract_class;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public abstract void eat();
	
	public abstract void breath();
	
	// interface se hoan toan la cac phuong thuc truu tuong
	// abstract class se co cac phuong thuc truu tuong +  phuong thuc binh thuong.
	// abstract function phai nam trong abstract class
}
