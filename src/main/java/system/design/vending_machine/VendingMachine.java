package system.design.vending_machine;

import java.util.List;
import java.util.Objects;

public class VendingMachine {
	
	private State currentState;
	
	private double amount;
	
	private int noOfRacks;
	
	private List<Rack> racks;
	
	private List<Integer> availableRacks;
	
	
	//VendingMachine is a Singleton class that ensures it will have only one active instance at a time
	private static VendingMachine vendingMachine = null;
	
	//Created a static method to access the singleton instance of VendingMachine
	private VendingMachine() {
	
	}
	
	//Created a static method to access the singleton instance of VendingMachine
	public static VendingMachine getInstance() {
		return Objects.isNull(vendingMachine) ? new VendingMachine() : vendingMachine;
	}
	
	public void insertMoney(double amount) {
	}
	
	public void pressButton(int rackNumber) {
	}
	
	public void returnChange(double amount) {
	}
	
	public void updateInventory(int rackNumber) {
	}
	
	public void dispenseProduct(int rackNumber) {
	}
	
	public int getProductIdAtRack(int rackNumber) {
		//definition
		return 0;
	}
	
}
