package abstract_class;

public abstract class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breath() {
		System.out.println(getName() + " is breathing");
	}
	
	public abstract void slash();
}
