package builderPattern.packImpl;

import builderPattern.Packing;

/**
 * 2.瓶子
 *
 * @author ginger
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
