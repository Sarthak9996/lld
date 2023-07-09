package system.design.amazon_locker_service;

import java.util.List;
import java.util.Objects;

public class LockerService {
	
	private List<LockerLocation> locations;
	
	//LockerService is a Singleton class that ensures it will have only one active instance at a time
	private static LockerService lockerService = null;
	
	//Created a static method to access the Singleton instance of LockerService class
	public static LockerService getInstance() {
		return Objects.isNull(lockerService) ? new LockerService() : lockerService;
	}
	
}
