public class PaymentService {

    paymentStartegy ob;

    public PaymentService(paymentStartegy ob) {
        this.ob = ob;
    }

    void processpayment(int amount){
        ob.pay(amount);
    }
}
