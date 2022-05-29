package abstractFactoryPattern.impl.color;

import abstractFactoryPattern.mapper.Color;

/**
 * @author ginger
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
