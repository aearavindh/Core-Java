package Assignment3;

public class Book {
	
	protected String isbn;
	protected String title;
	protected int price;
	
	public Book(String isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Magazine magazine = new Magazine("ISBN123", "Computers Today", 400, "Technology");
		Novel novel = new Novel("ISBN456", "Ponniyin Selvan", 500, "John Doe");
		System.out.println(magazine+"\n"+novel);
		
	}
}
