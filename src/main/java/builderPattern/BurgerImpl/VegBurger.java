package builderPattern.BurgerImpl;

import builderPattern.Burger;

/**
 * 4.素食汉堡包
 *
 * @author ginger
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Float price() {
        return 7.2f;
    }
}
