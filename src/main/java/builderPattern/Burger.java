package builderPattern;

import builderPattern.packImpl.Wrapper;

/**
 * 3.汉堡包
 *
 * @author ginger
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract Float price();
}
