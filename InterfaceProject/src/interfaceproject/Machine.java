package interfaceproject;

public class Machine implements IInfo, IStudiable {
	private long id;

	public Machine(long id) {
		this.id = id;
	}
	
	public void start () {
		System.out.println("Machine is starting");
	}
	
	@Override
	public void showInfo() {
		System.out.println("Show Info: Machine " + this.id);
	}

	@Override
	public void study() {
		System.out.println("Study Interface: Machine " + this.university);
	}
}
