package PaymentStrategyPattern;

public class creditCardPayment implements payment_strategy{

    public creditCardPayment(double fee) {
    }

    @Override
    public void processpayment(double amount) {
        System.out.println("Credit Card payment "+ amount);
    }
}
