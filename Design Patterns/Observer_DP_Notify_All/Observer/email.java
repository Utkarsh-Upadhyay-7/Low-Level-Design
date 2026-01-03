package Observer;

public class email implements Observer_Interface{

    String email;

    public email(String email) {
        this.email = email;
    }

    @Override
    public void update(String Product, int stock) {
        System.out.println("Email send to " + email + " : " + Product + " is back in stock with "+ stock + " units.");
    }
}
