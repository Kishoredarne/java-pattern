package with.strategy.pattern;

import with.strategy.pattern.inter.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

	@Override
	public void processPayment(Double amt) {
		// TODO Auto-generated method stub
		System.out.println("CreditCardPaymentStrategy");
	}

}
