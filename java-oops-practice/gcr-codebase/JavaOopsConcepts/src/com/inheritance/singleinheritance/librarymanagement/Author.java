package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book
{
   String name;
   String author;
   
   Author( String title, int publicationYear,String name, String author)
   {
	   super(title, publicationYear );
	   this.name = name;
	   this.author = author;
   }
   
   @Override
   public void displayInfo()
	{
	   super.displayInfo();
	   System.out.println("The Book Author name is : " + name);
	   System.out.println("Author bio : " + author);
	}
   
   
}


