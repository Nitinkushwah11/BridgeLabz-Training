package com.inheritance.singleinheritance.librarymanagement;

public class Book {

	String title;
	
	int publicationYear;
	
	Book( String title, int publicationYear)
	{
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public void displayInfo()
	{
	   System.out.println("The Book title name is : " + title);
	   System.out.println("Published Year:  : " + publicationYear);
	}
	
}
