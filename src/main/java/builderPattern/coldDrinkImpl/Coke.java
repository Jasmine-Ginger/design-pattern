package builderPattern.coldDrinkImpl;

import builderPattern.ColdDrink;

/**
 * 5.可乐
 * @author ginger
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Float price() {
        return 4.6f;
    }
}
