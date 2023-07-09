package system.design.vending_machine;

public interface State {
	
	void insertMoney(VendingMachine machine, double amount);
	
	void pressButton(VendingMachine machine, int rackNumber);
	
	void returnChange(double amount);
	
	void updateInventory(VendingMachine machine, int rackNumber);
	
	void dispenseProduct(VendingMachine machine, int rackNumber);
	
}
