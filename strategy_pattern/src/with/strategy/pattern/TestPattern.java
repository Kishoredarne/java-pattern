package with.strategy.pattern;

public class TestPattern {

	public static void main(String []args) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPaymentStrategy());
		String message = paymentProcessor.processPayment(6000.00);
		System.out.println(message);
	}
}
