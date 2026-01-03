package Observer;

public class sms implements Observer_Interface{

    int PhoneNo;

    public sms(int phoneNo) {
        this.PhoneNo = phoneNo;
    }

    @Override
    public void update(String Product, int stock) {
        System.out.println("SMS send to " + PhoneNo + " : " + Product + " is back in stock with "+ stock + " units.");
    }
}
