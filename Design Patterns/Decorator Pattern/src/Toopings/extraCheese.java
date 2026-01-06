package Toopings;
import BasePizza.basePizza;

public class extraCheese extends toping_decorator{
    basePizza bp;

    public extraCheese(basePizza bp) {
        this.bp = bp;
    }

    @Override
    public int cost() {
        return bp.cost() + 10;
    }
}
