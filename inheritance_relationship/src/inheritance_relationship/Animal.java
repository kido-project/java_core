package inheritance_relationship;

public class Animal {
	private String name;
	private int size;
	private float weight;

	public Animal() {
	}

	public Animal(String name, int size, float weight) {
		super();
		System.out.println("Call parents class constructor");
		this.name = name;
		this.size = size;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	protected void eat() {
		System.out.println("Animal Eat");
	}
	
	protected void move() {
		System.out.println("Animal Move");
	}
}