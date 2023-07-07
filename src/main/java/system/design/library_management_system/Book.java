package system.design.library_management_system;

import system.design.library_management_system.enums.BookFormat;
import system.design.library_management_system.enums.BookStatus;

import java.util.Date;
import java.util.List;

public abstract class Book {
	
	private String isbn;
	
	private String title;
	
	private String subject;
	
	private String publisher;
	
	private String language;
	
	private int numberOfPages;
	
	private BookFormat bookFormat;
	
	private List<Author> authors;
	
	private Date publicationDate;
	
}

class BookItem extends Book {
	
	private String id;
	
	private boolean isReferenceOnly;
	
	private Date borrowed;
	
	private Date dueDate;
	
	private double price;
	
	private BookStatus status;
	
	private Date dateOfPurchase;
	
	private Date publicationDate;
	
	private Rack placedAt;
	
	public boolean checkout(String memberId) {
		//definition
		return false;
	}
	
}

class Rack {
	
	private int number;
	
	private String locationIdentifier;
	
}
