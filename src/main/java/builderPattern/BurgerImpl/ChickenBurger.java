package builderPattern.BurgerImpl;

import builderPattern.Burger;

/**
 * 4.鸡肉汉堡包
 * @author ginger
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Float price() {
        return 12.5f;
    }
}
