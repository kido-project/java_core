package abstract_class;

public class Nhon extends Cat {

	public Nhon(String name) {
		super(name);
	}
	
	@Override
	public void slash() {
		System.out.println(getName() + " is slashing");
		
	}

}
