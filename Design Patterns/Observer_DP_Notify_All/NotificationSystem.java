import Observable.Observable_Interface;
import Observable.Product_Observable;
import Observer.Observer_Interface;
import Observer.email;
import Observer.sms;

public class NotificationSystem {

    public static void main(String[] args) {

        // Observables (Products)
        Observable_Interface Iphone = new Product_Observable("IPHONE");
        Observable_Interface Samsung = new Product_Observable("SAMSUNG");

        // Observers
        Observer_Interface observerSmsIphone = new sms(999999);
        Observer_Interface observerEmailIphone = new email("abc@gamil.com");

        Observer_Interface observerSmsSamsung = new sms(777777);
        Observer_Interface observerEmailSamsung = new email("def@gamil.com");

        //Subscribe observers
        Iphone.addUsers(observerSmsIphone);
        Iphone.addUsers(observerEmailIphone);

        Samsung.addUsers(observerSmsSamsung);
        Samsung.addUsers(observerEmailSamsung);

        System.out.println("---- iPhone Stock Updates ----");
        Iphone.setStock(0);    // ❌ no notification
        Iphone.setStock(5);    // ✅ notification

        System.out.println("\n---- Samsung Ultra Stock Updates ----");
        Samsung.setStock(0);  // ❌ no notification
        Samsung.setStock(7);  // ✅ notification

    }

}
