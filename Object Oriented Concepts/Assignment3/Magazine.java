package Assignment3;

public class Magazine extends Book {

	private String type;

	public Magazine(String isbn, String title, int price, String type) {
		super(isbn, title, price);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	

}
