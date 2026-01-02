public class UpiPayment implements paymentStartegy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "rs, using UPI");
    }
}
