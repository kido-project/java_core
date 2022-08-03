package inner_class;

import inner_class.Human.Brain;

public class Main {

	public static void main(String[] args) {
		Human human = new Human(1);
		human.start();
//		Brain brain = new Brain();
		// khai bao doi tuong inner class
		System.out.println("--------------");
//		Human.Brain brain = human.new Brain();
		Human.Brain brain = new Human(0).new Brain();
		brain.think();
		System.out.println("--------------");
		Human.Power power = new Human.Power();
		power.charge();
	}
}
