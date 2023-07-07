package system.design.library_management_system;

import java.util.Objects;

public class Library {
	
	private String name;
	
	private Address address;
	
	//The library is a singleton class that ensures it will have only one active instance at a time
	private static Library library = null;
	
	public static Library getInstance() {
		return Objects.isNull(library) ? new Library() : library;
	}
	
}
