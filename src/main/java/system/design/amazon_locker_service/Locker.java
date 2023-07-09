package system.design.amazon_locker_service;

import system.design.amazon_locker_service.enums.LockerSize;
import system.design.amazon_locker_service.enums.LockerState;

public class Locker {
	
	private String lockerId;
	
	private LockerSize lockerSize;
	
	private String locationId;
	
	private LockerState lockerState;
	
	public boolean addPackage() {
		//definition
		return true;
	}
	
	public boolean removePackage() {
		//definition
		return true;
	}
	
}
