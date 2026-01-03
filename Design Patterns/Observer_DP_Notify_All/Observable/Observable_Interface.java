package Observable;

import Observer.Observer_Interface;

public interface Observable_Interface {

    void addUsers(Observer_Interface ob);

    void removeUsers(Observer_Interface ob);

    void notify_All();

    void setStock(int stock);

    int getStock();
}
