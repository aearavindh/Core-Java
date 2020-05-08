package Assignment4;

public class Payment {
	
	protected Double amount;

	public Payment(Double amount) {
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails() {
		System.out.println("Payment Details: "+amount);
	}
	
	public static void main(String[] args) {
		CashPayment cp1 = new CashPayment(5000.0);
		CashPayment cp2 = new CashPayment(10000.0);
		CreditCardPayment ccp1 = new CreditCardPayment(5000.0,"ABC","05/2026","123ABC");
		CreditCardPayment ccp2 = new CreditCardPayment(10000.0,"XYZ","03/2023","456XYZ");
		cp1.paymentDetails();
		cp2.paymentDetails();
		ccp1.paymentDetails();
		ccp2.paymentDetails();
	}

}
