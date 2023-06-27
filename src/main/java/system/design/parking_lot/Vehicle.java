package system.design.parking_lot;

public abstract class Vehicle {
	
	private int licenseNo;
	
	abstract void assignTicket(ParkingTicket parkingTicket);
	
}

class Car extends Vehicle {
	
	@Override
	void assignTicket(ParkingTicket parkingTicket) {
		//definition
	}
	
}

class Van extends Vehicle {
	
	@Override
	void assignTicket(ParkingTicket parkingTicket) {
	
	}
	
}

class Truck extends Vehicle {
	
	@Override
	void assignTicket(ParkingTicket parkingTicket) {
	
	}
	
}

class MotorCycle extends Vehicle {
	
	@Override
	void assignTicket(ParkingTicket parkingTicket) {
	
	}
	
}