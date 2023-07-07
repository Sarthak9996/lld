package system.design.library_management_system;

import system.design.library_management_system.enums.AccountStatus;

import java.util.Date;

public abstract class User {
	
	private String id;
	
	private String password;
	
	private AccountStatus status;
	
	private Person person;
	
	private LibraryCard card;
	
	public abstract boolean resetPassword();
	
}

class Librarian extends User {
	
	public boolean addBookItem(BookItem bookItem) {
		//definition
		return true;
	}
	
	public boolean blockMember(Member member) {
		//definition
		return false;
	}
	
	public boolean unBlockMember(Member member) {
		//definition
		return true;
	}
	
	@Override
	public boolean resetPassword() {
		//definition
		return false;
	}
	
}

class Member extends User {
	
	private Date dateOfMembership;
	
	private int totalBooksCheckedOut;
	
	public boolean reserveBookItem(BookItem bookItem) {
		//definition
		return true;
	}
	
	private void incrementTotalBooksCheckedout() {
		//definiton
	}
	
	public boolean checkoutBookItem(BookItem bookItem) {
		//definition
		return true;
	}
	
	private void checkForFine(String bookItemId) {
		//definition
	}
	
	public void returnBookItem(BookItem bookItem) {
		//definition
	}
	
	public boolean renewBookItem(BookItem bookItem) {
		//definition
		return true;
	}
	
	@Override
	public boolean resetPassword() {
		return false;
	}
	
}
