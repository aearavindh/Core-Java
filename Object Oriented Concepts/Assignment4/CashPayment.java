package Assignment4;

public class CashPayment extends Payment {
	
	public CashPayment(Double amount) {
		super(amount);
	}
	
	@Override
	public void paymentDetails() {
		System.out.println("Payment amount "+amount+" is gonna be in cash");
	}

}
