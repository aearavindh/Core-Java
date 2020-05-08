package Assignment4;

public class CreditCardPayment extends Payment {
	
	private String name;
	private String expirationDate;
	private String creditCardNumber;
	
	public CreditCardPayment(Double amount, String name, String expirationDate, String creditCardNumber) {
		super(amount);
		this.name = name;
		this.expirationDate = expirationDate;
		this.creditCardNumber = creditCardNumber;
	}
	
	@Override
	public void paymentDetails() {
		System.out.println("CreditCardPayment [name=" + name + ", expirationDate=" + expirationDate + ", creditCardNumber="
				+ creditCardNumber + ", amount=" + amount + "]");
	}	
	

}
