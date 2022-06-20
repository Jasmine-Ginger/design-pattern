package builderPattern.coldDrinkImpl;

import builderPattern.ColdDrink;

/**
 * 5.百世可乐
 * @author ginger
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 8.2f;
    }
}
