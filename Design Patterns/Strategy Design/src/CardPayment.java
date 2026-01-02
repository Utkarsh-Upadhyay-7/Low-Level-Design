public class CardPayment implements paymentStartegy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "rs, using card");
    }
}
