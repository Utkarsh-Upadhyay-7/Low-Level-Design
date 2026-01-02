public class Main {
    public static void main(String[] args) {

        PaymentService service = new PaymentService(new UpiPayment());
        service.processpayment(100);
    }
}