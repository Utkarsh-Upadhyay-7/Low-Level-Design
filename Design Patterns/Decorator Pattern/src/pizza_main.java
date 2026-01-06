import BasePizza.basePizza;
import BasePizza.margherita;
import Toopings.extraCheese;
import Toopings.mushroom;

public class pizza_main {
    public static void main(String[] args) {

        // lets say we want margherita + extra cheese

        basePizza bp = new margherita();

        basePizza me = new extraCheese(bp);
        System.out.println("The cost of margherita with extra cheese is : " + me.cost());

        // lets say we want margherita + extra cheese + mushroom

        basePizza final_pizza = new mushroom(new extraCheese(new margherita()));

        System.out.println("The cost of margherita + extra cheese + mushroom is : " + final_pizza.cost());
    }
}