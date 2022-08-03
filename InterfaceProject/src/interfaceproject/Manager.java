package interfaceproject;

public class Manager implements IInfo {
	private String name;

	public Manager(String name) {
		this.name = name;
	}
	
	public void study () {
		System.out.println("Manager is studying");
	}
	
	public void showInfo () {
		System.out.println("Show Info: Manager " + this.name);
	}
}
