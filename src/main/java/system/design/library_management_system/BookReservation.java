package system.design.library_management_system;

import system.design.library_management_system.enums.ReservationStatus;

import java.util.Date;

public class BookReservation {
	private String itemId;
	private Date createdDate;
	private ReservationStatus status;
	private String memberId;
	
	public static BookReservation fetchReservationDetails(String bookItemId){
		return new BookReservation();
	}
}
