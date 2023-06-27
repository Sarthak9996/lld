package system.design.parking_lot;

public abstract class ParkingSpot {
	
	private int id;
	
	private boolean isFree;
	
	private Vehicle vehicle;
	
	boolean getIsFree() {
		//declaration
		return false;
	}
	
	public abstract boolean assignVehicle(Vehicle vehicle);
	
	boolean removeVehicle() {
		//declaration
		return true;
	}
	
}

class Handicapped extends ParkingSpot {
	
	@Override
	public boolean assignVehicle(Vehicle vehicle) {
		//declaration
		return false;
	}
	
}

class Compact extends ParkingSpot {
	
	@Override
	public boolean assignVehicle(Vehicle vehicle) {
		//declaration
		return false;
	}
	
}

class Large extends ParkingSpot {
	
	@Override
	public boolean assignVehicle(Vehicle vehicle) {
		//declaration
		return false;
	}
	
}

class Motorcycle extends ParkingSpot {
	
	@Override
	public boolean assignVehicle(Vehicle vehicle) {
		//declaration
		return false;
	}
	
}