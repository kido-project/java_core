package inheritance_relationship;

public class Address {
	private String phone;
	private String province;
	private String street;
	
	public Address() {}

	public Address(String phone, String province, String street) {
		super();
		this.phone = phone;
		this.province = province;
		this.street = street;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public void present() {
		System.out.println(this.getPhone());
		System.out.println(this.getStreet());
		System.out.println(this.getProvince());
	}
}
