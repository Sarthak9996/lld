package system.design.parking_lot;

import system.design.parking_lot.enums.AccountStatus;

public abstract class Account {
	
	private String userName;
	
	private String password;
	
	private Person person;
	
	private AccountStatus status;
	
	public abstract boolean resetPassword();
	
}

class Admin extends Account {
	
	//spot here refers to an instance of the ParkingSpot class
	public boolean addParkingSpot(ParkingSpot spot) {//declaration
		return false;
	}
	
	//displayBoard here refers to an instance of the DisplayBoard class
	public boolean addDisplayBoard(DisplayBoard displayBoard) {
		//declaration
		return false;
	}
	
	//entrance here refers to an instance of the Entrance class
	public boolean addEntrance(Entrance entrance) {
		//declaration
		return false;
	}
	
	//exit here refers to an instance of the Exit class
	public boolean addExit(Exit exit) {
		//declaration
		return false;
	}
	
	@Override
	public boolean resetPassword() {
		//definition
		return false;
	}
	
}

class ParkingAttendant extends Account {
	
	public boolean processTicket(String ticketNumber) {
		//declaration
		return false;
	}
	
	@Override
	public boolean resetPassword() {
		//declaration
		return false;
	}
	
}
