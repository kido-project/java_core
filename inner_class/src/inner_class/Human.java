package inner_class;

public class Human {
	private long id;
	public Human(long id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("ID " + this.id + " is starting");
		
//		Brain brain = new Brain();
//		brain.think();
		new Brain().think();
	}
	
	class Brain {
		public void think () {
			System.out.println("Human is thinking");
			Human human = new Human(2);
			System.out.println("Human " + human.id +  " in brain");
		}
	}
	
	static class Power {
		public void charge() {
			System.out.println("Human is charging");
		}
	}
}
