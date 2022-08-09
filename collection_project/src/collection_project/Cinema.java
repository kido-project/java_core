package collection_project;

import java.util.ArrayList;

public class Cinema {
	private String cenemaName;
	private ArrayList<Seat> seats = new ArrayList<Seat>();

	public Cinema(String cenemaName, int numRow, int seatPerRow) {
		this.cenemaName = cenemaName;
		int lastRow = 'A' + numRow - 1;
		for (char row = 'A'; row < lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	public boolean reserveSeat (String seatNumber) {
		Seat requestSeat = null;
		for (Seat seat : seats) {
			if(seat.getSeatNumber().equals(seatNumber)) {
				requestSeat = seat;
				break;
			}
		}
		
		if(requestSeat == null) {
			System.out.println("This seat not exist");
			return false;
		}
		
		return requestSeat.reserveSeat();
	}

	public String getCenemaName() {
		return cenemaName;
	}

	public void setCenemaName(String cenemaName) {
		this.cenemaName = cenemaName;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}
	
	public void printCinemaSeat() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
}
