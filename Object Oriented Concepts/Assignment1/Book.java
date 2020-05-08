package Assignment1;

public class Book {
	
	private String isbn;
	private String title;
	private String author;
	private int price;
	
    public Book(String isbn, String title, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
    
    public void displayDetails() {
    	System.out.println("ISBN: "+isbn+"\nTitle: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
    
    public void discountedPrice(float discount) {
    	System.out.println("Discount: "+(price-(price*discount*0.01)));
    }
    
	public static void main(String[] args) {
		
    	Book book = new Book("ISBN123","Harry Potter","JK Rowling",1000);
    	book.displayDetails();
    	book.discountedPrice(20);
	}

}
