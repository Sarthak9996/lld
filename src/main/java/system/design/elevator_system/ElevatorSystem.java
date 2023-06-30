package system.design.elevator_system;

import java.util.Objects;

public class ElevatorSystem {
	
	private Building building;
	
	public void monitoring() {
		//definition
	}
	
	public void dispatcher() {
		//definition
	}
	
	//The ElevarSystem is a singleton class that ensures it will have only one active instance at a time
	private static ElevatorSystem elevatorSystem = null;
	
	//Created a static method to access the singleton instance of ElevatorSytem class
	public static ElevatorSystem getInstance() {
		elevatorSystem = Objects.isNull(elevatorSystem) ? new ElevatorSystem() : elevatorSystem;
		return elevatorSystem;
	}
	
}
