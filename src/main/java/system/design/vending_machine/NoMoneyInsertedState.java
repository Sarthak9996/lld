package system.design.vending_machine;

public class NoMoneyInsertedState implements State {
	
	@Override
	public void insertMoney(VendingMachine machine, double amount) {
	
	}
	
	@Override
	public void pressButton(VendingMachine machine, int rackNumber) {
	
	}
	
	@Override
	public void returnChange(double amount) {
	
	}
	
	@Override
	public void updateInventory(VendingMachine machine, int rackNumber) {
	
	}
	
	@Override
	public void dispenseProduct(VendingMachine machine, int rackNumber) {
	
	}
	
}
