package access_modifier;

public class Student {
	private String name;
	
	private static int numbers;
	
	public Student (String name) {
		this.name = name;
		System.out.println("New student: " + this.name);
		numbers++;
		System.out.println("Total student: " + numbers);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNumbers() {
		return numbers;
	}

	public static void setNumbers(int numbers) {
		Student.numbers = numbers;
	}
	
	
}
