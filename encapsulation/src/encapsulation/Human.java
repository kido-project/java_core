package encapsulation;

public class Human {
	private String country;
	private int age;
	private String name;

	public void display() {
		System.out.println("Name: " + this.getName() + ", age:" + this.getAge());
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18)
			System.err.println("CC");
		else
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
