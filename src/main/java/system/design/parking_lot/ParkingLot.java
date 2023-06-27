package system.design.parking_lot;

import java.util.HashMap;
import java.util.Objects;

public class ParkingLot {
	
	private int id;
	
	private String name;
	
	private String address;
	
	private ParkingRate parkingRate;
	
	private HashMap<String, Entrance> entrance;
	
	private HashMap<String, Exit> exit;
	
	// Create a hashmap that identifies all currently generated tickets using their ticket number
	private HashMap<String, ParkingTicket> tickets;
	
	//The ParkingLot is a singleton class that ensures it will have only one active instance at a time
	//Both the entrance and exit classes use this class to create and close parking tickets
	private static ParkingLot parkingLot = null;
	
	private ParkingLot() {
		//Call the name, address, parking_rate elements of the customer in the parking lot from the database
		//Create initial entrance and exit hashmaps respectively
	}
	
	public static ParkingLot getInstance() {
		if(Objects.isNull(parkingLot)) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}
	
	public boolean addEntrance(Entrance entrance) {
		//declaration
		return true;
	}
	
	public boolean addExit(Exit exit) {
		//declaration
		return true;
	}
	
	//This function allows parking tickets to be available at multiple entrances
	public ParkingTicket getParkingTicket(Vehicle vehicle) {
		//declaration
		return null;
	}
	
	public boolean isFull(ParkingSpot type) {
		//declaration
		return false;
	}
	
}
