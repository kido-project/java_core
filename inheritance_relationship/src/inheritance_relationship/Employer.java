package inheritance_relationship;

public class Employer {
	public String name;
	public long id;
	public Address address; // quan he has-a: Employee co Address
	
	public Employer() {}
	
	public Employer(String name, long id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void present() {
		System.out.println(this.getName());
		this.getAddress().present();
	}
}
