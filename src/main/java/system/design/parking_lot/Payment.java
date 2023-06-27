package system.design.parking_lot;

import system.design.parking_lot.enums.PaymentStatus;

import java.util.Date;

public abstract class Payment {
	
	private double amount;
	
	private PaymentStatus status;
	
	private Date timestamp;
	
	public abstract boolean initiateTransaction();
	
}

class Cash extends Payment{
	
	@Override
	public boolean initiateTransaction() {
		//definition
		return false;
	}
	
}

class CreditCard extends Payment{
	
	@Override
	public boolean initiateTransaction() {
		//definition
		return false;
	}
	
}
