package collection_project;

public class Seat {
	private String seatNumber;
	private boolean reserved;

	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.reserved = false;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	public boolean reserveSeat () {
		if (!this.reserved) {
			this.reserved = true;
			System.out.println("Seat " + this.seatNumber + " was reserved! Congratulation!!!");
			return true;
		}
		return false;
	}
}
