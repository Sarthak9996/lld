package system.design.parking_lot;

import java.util.Date;

public class ParkingTicket {
	
	private int ticketNo;
	
	private Date timestamp;
	
	private Date exitTime;
	
	private double amount;
	
	private boolean status;
	
	private Vehicle vehicle;
	
	private Payment payment;
	
	private Entrance entrance;
	
	private Exit exit;
	
}
