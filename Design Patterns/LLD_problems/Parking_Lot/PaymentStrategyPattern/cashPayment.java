package PaymentStrategyPattern;

public class cashPayment implements payment_strategy{

    public cashPayment(double fee) {
    }

    @Override
    public void processpayment(double amount) {
        System.out.println("Cash Payment done " + amount);
    }
}
