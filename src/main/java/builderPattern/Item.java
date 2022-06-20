package builderPattern;

/**
 * 1.物品
 *
 * @author ginger
 */
public interface Item {

    Packing packing();

    String name();

    Float price();
}
