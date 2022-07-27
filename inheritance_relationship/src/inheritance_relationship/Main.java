package inheritance_relationship;

public class Main {

	public static void main(String[] args) {
		// quan he ke thua trong java: has-a, composition. VD: Dong vat co meo
		// inheritance is-a. VD: Meo la dong vat
		// tai su dung code

		Address address = new Address("0983624290", "Dong Trieu", "Ha Noi");
		Employer employer = new Employer("Viet", 101101, address);
		employer.present();
	}
}
