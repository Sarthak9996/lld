package system.design.elevator_system;

public abstract class Button {
	
	private boolean status;
	
	public void pressDown() {
		//definition
	}
	
	public abstract boolean isPressed();
	
}

class HallButton extends Button {
	
	@Override
	public boolean isPressed() {
		//definition
		return false;
	}
	
}

class ElevatorButton extends Button {
	
	private int destinationFloor;
	
	@Override
	public boolean isPressed() {
		//definition
		return false;
	}
	
}