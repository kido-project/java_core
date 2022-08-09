package collection_project;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema("CGV", 12, 12);
//		cinema.printCinemaSeat();
		
		if(cinema.reserveSeat("A12")) { 
			System.out.println("Successfully!");
		} else {
			System.out.println("This seat was reserved by another guys!");
		}
		System.out.println("----------------------");
		if(cinema.reserveSeat("A12")) { 
			System.out.println("Successfully!");
		} else {
			System.out.println("This seat was reserved by another guys!");
		}
	}
}
