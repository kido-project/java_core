package set_java;

import java.util.Objects;

public class Human implements Comparable<Human> {
	private long id;
	private int age;
	private String name;

	public Human(long id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Human arg0) {
//		if (this.age == arg0.getAge()) {
//			return 0;
//		} else if (this.age > arg0.getAge()) {
//			return 1;return -1; //reverse
//		} else {
//			return -1;return 1; //reverse
//		}
		return -(this.age - arg0.getAge());
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

}
