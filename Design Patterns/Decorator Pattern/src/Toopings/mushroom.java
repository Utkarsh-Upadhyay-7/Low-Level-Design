package Toopings;
import BasePizza.basePizza;

public class mushroom extends toping_decorator{

    basePizza bp;

    public mushroom(basePizza bp) {
        this.bp = bp;
    }

    @Override
    public int cost() {
        return bp.cost() + 15;
    }
}
