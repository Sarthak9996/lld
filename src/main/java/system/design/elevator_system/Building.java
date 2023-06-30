package system.design.elevator_system;

import java.util.List;
import java.util.Objects;

public class Building {
	
	private List<Floor> floor;
	
	private List<ElevatorCar> elevator;
	
	private static Building building = null;
	
	public static Building getInstance() {
		building = Objects.isNull(building) ? new Building() : building;
		return building;
	}
	
}
