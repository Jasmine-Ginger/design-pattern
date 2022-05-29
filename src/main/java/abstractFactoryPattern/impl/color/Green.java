package abstractFactoryPattern.impl.color;

import abstractFactoryPattern.mapper.Color;

/**
 * @author ginger
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
