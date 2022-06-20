package builderPattern;

import builderPattern.packImpl.Bottle;

/**
 * 3.冷饮
 *
 * @author ginger
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price();
}
