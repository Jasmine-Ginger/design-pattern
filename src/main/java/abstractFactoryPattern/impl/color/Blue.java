package abstractFactoryPattern.impl.color;

import abstractFactoryPattern.mapper.Color;

/**
 * @author ginger
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
