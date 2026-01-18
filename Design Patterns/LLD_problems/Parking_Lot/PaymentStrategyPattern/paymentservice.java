package PaymentStrategyPattern;

public class paymentservice {
    private double amount;
    private payment_strategy ps;

    public paymentservice(payment_strategy ps, double amount) {
        this.ps = ps;
        this.amount = amount;
    }

    void pay(){
        if(amount>0)
        {
            System.out.println("payment done successfully");
            ps.processpayment(20);
        }
        else{
            System.out.println("some error happened");
        }
    }
}
