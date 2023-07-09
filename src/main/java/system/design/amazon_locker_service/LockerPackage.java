package system.design.amazon_locker_service;

import java.util.Date;

public class LockerPackage extends Package {
	
	private int codeValidDays;
	
	private String lockerId;
	
	private String packageId;
	
	private String code;
	
	private Date packageDeliveryTime;
	
	public boolean isValidCode() {
		//definition
		return true;
	}
	
	public boolean verifyCode(String code) {
		//definition
		return true;
	}
	
}
