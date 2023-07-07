package system.design.library_management_system;

import java.util.Date;

public abstract class Notification {
	
	private String notificationId;
	
	private Date creationDate;
	
	private String content;
	
	public abstract boolean sendNotification();
	
}

class PostalNotification extends Notification {
	
	private Address address;
	
	@Override
	public boolean sendNotification() {
		//definition
		return false;
	}
	
}

class EmailNotification extends Notification {
	
	private String email;
	
	@Override
	public boolean sendNotification() {
		return false;
	}
	
}
