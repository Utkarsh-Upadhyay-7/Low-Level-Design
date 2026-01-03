package Observable;

import Observer.Observer_Interface;

import java.util.ArrayList;
import java.util.List;

public class Product_Observable implements Observable_Interface{

    String productname;
    int stock ;
    List<Observer_Interface> obj_list = new ArrayList<>();

    public Product_Observable(String productname) {
        this.productname = productname;
    }


    @Override
    public void addUsers(Observer_Interface ob) {
       obj_list.add(ob);
    }

    @Override
    public void removeUsers(Observer_Interface ob) {
       obj_list.remove(ob);
    }

    @Override
    public void notify_All() {
       for(Observer_Interface ob : obj_list){
           ob.update(productname, stock);
       }
    }

    @Override
    public void setStock(int stock) {
      this.stock=stock;
      if (stock>0)
      {
          notify_All();
      }
    }

    @Override
    public int getStock() {
         return stock;
    }
}
