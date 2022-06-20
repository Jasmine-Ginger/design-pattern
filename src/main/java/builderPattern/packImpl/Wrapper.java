package builderPattern.packImpl;

import builderPattern.Packing;

/**
 * 2.包装纸
 *
 * @author ginger
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
