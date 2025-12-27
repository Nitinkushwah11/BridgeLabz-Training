package com.constructors.level1;

public class Book {
	
	//Attributes
	String title;
	String author;
	double price;
	
	//default Constructor
	public Book() 
	 {
		System.out.println("Default Constructor \n");
	        title = "Unknown Title";
	        author = "Unknown Author";
	        price = 0.0;
	 }
	 
	
	//Using Parameterized Constructor
	public Book(String title, String author, int price)
	{
		System.out.println("Using Parameterized Constructor \n");
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	
	public void display()
	{
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Price :" + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Book b1 = new Book("Java Programming", "James Gosling", 399);
    	b1.display();
    	
    	System.out.println("------------------------------");
		
		Book b2 = new Book();
		b2.display();
		

	}

}
