package with.strategy.pattern;

import with.strategy.pattern.inter.PaymentStrategy;

public class PaymentProcessor {
	
	PaymentStrategy paymentStrategy;

	public PaymentProcessor(PaymentStrategy paymentStrategy) {
		super();
		this.paymentStrategy = paymentStrategy;
	}
	
	public String processPayment(Double amt) {
		paymentStrategy.processPayment(amt);
		return "Payment done successfully..."+amt;
	}

}
